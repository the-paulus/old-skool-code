#include<iostream.h>
#include<string.h>
#include<fstream.h>
#define PRINT_IT ofstream prn("PRN");
PRINT_IT;

struct friend_data
{
	char LastName[20];
	char FirstName[20];
	char PhoneNumber[15];
};

const int MAX_SIZE = 20;
friend_data input_array[];
friend_data friend_array[20];

void selection_sort(friend_data input_array[], int input_size);

int main()
{
	int con;
	int index;
	cout << "***Enter friend data***\n\n";
	prn << "***Enter friend data**\n\n";

	for(index = 0; index < 20; index++)
	{
		cout << "\nEnter the friend\'s first name: ";
		cin >> friend_array[index].FirstName;
		cout << "\nEnter the friend\'s last name: ";
		cin >> friend_array[index].LastName;
		cout << "\nEnter their phone number: ";
		cin >> friend_array[index].PhoneNumber;

		cout << "\nDo you wish to enter another? (Y=1,N=0) ";
		cin >> con;
		//Print
		prn << "\nEnter the friend\'s first name:";
		prn << friend_array[index].FirstName;
		prn << "\nEnter the friend\'s last name: ";
		prn << friend_array[index].LastName;
		prn << "\nEnter their phone number: ";
		prn << friend_array[index].PhoneNumber;
		prn << "\nDo you wish to enter another? (Y=1,N=0) ";
		prn << con;
		//End Print
		if (con == 1)
		{
			continue;
		}
		else
		{
			break;
		}
	}
	
	selection_sort(friend_array, index+1);

	cout << "\n\n";
	prn << "\n\n";

	for(int i1 = 0; i1<=index; i1++)
	{
		cout << "\nFriend: " << friend_array[i1].LastName << ", " << friend_array[i1].FirstName;
		cout << "\nPhone Number: " << friend_array[i1].PhoneNumber << '\n';

		//Print
		prn << "\nFriend: " << friend_array[i1].LastName << ", " << friend_array[i1].FirstName;
		prn << "\nPhone Number: " << friend_array[i1].PhoneNumber << '\n';
	}

	return 0;
}

// Selection sort procedure. Sorts an array of ints in descending order.
void selection_sort(friend_data input_array[], int input_size)
{
	friend_data TEMP;
	int small=0;
	int i, j;

	for (i = input_size - 1; i > 0; i--)
	{
		  // Initialize small to first element.
    
		// Find the smallest element between the positions 1 and i.
		for (j = 1; j <= i; j++)	
		{
			if (strcmp(friend_array[j].LastName, friend_array[small].LastName)>0)	
			{
				small = j;
			}
		}
		// Swap the smallest element found with element in position i.
		TEMP = input_array[small];
		input_array[small] = input_array[i];
		input_array[i] = TEMP;
	}
}


