//Paul Lyon
//Project 19-6
//P19-6.cpp

#include<iostream.h>
#include<fstream.h>
#include<string.h>
#define PRINT_IT ofstream prn("PRN")
PRINT_IT;

struct usr_data
{
	char usr[9];	//user name
	char passwd[15];	//password
};

//Functions
void selection_sort(usr_data input_array[], int input_size);
void display_array(usr_data input_array[], int input_size);
void binary_search(usr_data input_array[], int lowerbound, int upperbound, usr_data search);

//Variables
usr_data input_array[5];
usr_data users[5];
usr_data search;

int main( void )
{
	cout << "\nUser names may NOT exceed 8 characters!\n\n";
	prn << "\nUser names may NOT exceed 8 characters!\n\n";

	//Get user names and passwords
	for (int i=0; i<5;i++)
	{
		cout << "\nEnter a user name: ";
		cin.get(users[i].usr, 9);
		cin.ignore(80, '\n');
		cout << "\nEnter their password: ";
		cin.get(users[i].passwd,15);
		cin.ignore(80, '\n');

		prn << "\nEnter a user name: ";
		prn << users[i].usr;
		prn << "\nEnter their password: ";
		prn << users[i].passwd;
	}

	//Make output pretty
	cout << "\n\n\n";
	prn << "\n\n\n";

	//sorts users
	selection_sort(users,i);

	//displays users
	display_array(users,i);

	//Asks for a user to look for
	cout << "\n\nEnter a name to search for in the array: ";
	cin.get(search.usr, 9);
	cin.ignore(80, '\n');
	prn << "\n\nEnter a name to search for in the array: ";
	prn << search.usr;

	//looks for that user
	binary_search(input_array, 0, 5,search);

	return 0;
}
void selection_sort(usr_data input_array[], int input_size)
{
	int i, j;
	int small;
	usr_data temp; //for swaping
  
	for (i = input_size - 1; i > 0; i--)
	{
		small = 0;

		for (j = 1; j <= i; j++)	
		{
			if (strcmp(input_array[j].usr , input_array[small].usr)==1)	//compares user names
			{
				small = j;
			}
		}
		//swaping action
		temp = input_array[small];	
		input_array[small] = input_array[i];
		input_array[i] = temp;
	}
}

//Simple function that makes the program look big and bad
void display_array(usr_data input_array[], int input_size)
{
	int i;
  
	for (i = 0; i < input_size; i++)
	{
		cout << input_array[i].usr <<"'s password is "<<input_array[i].passwd << endl;
		prn << input_array[i].usr <<"'s password is "<<input_array[i].passwd << endl;
	}
  
	cout << "\n\n";
	prn << "\n\n";
}

//Search function
void binary_search(usr_data input_array[], int lowerbound, int upperbound, usr_data search)
{
	int search_pos;
 
	//starts in the center
	search_pos = (lowerbound + upperbound) / 2;

	//keep doing til end of array
	while((strcmp(input_array[search_pos].usr, search.usr) !=0) && (lowerbound <= upperbound))
	{
		//if current user is greater than the user specified then go back
		if((input_array[search_pos].usr > search.usr))
		{                             
			upperbound = search_pos - 1; 
		}   
		//go up
		else                           
		{                             
			lowerbound = search_pos + 1; 
		}
		
		search_pos = (lowerbound + upperbound) / 2;
	}
 
	//if the user is found
	if(lowerbound <= upperbound)
	{
		cout << "\nUser found!\n";
		prn << "\nUser found!\n";
	}

	//if the user is not found
	else
	{
		cout << "\nUser not found! Possible hacker, but hey who likes Windows anyways?\n";
		prn << "\nUser not found! Possible hacker, but hey who likes Windows anyways?\n";
	}
}


