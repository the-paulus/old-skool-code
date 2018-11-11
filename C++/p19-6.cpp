#include<iostream.h>
#include<fstream.h>
#include<string.h>

void sort_users(char usr_name_array[], int number_of_users);
void search_for_user(char usr_name_array[], int upper, int lower, char user_to_look_for);
usr_name_array[4];

int main()
{
	char usr_names[4][9] = { "root", "linuxusr", "javausr" };
	char user2look[9];

	cout << "\nEnter a user name to search for: ";
	cin.get(user2look,9);
	cin.ignore(80,'\n');

	sort_users(usr_names[4],3);
	search_for_user(usr_name_array[4], 0, 3, user2look);

	return 0;
}

void sort_users(char usr_name_array[], in number_of_users)
{
	int i, j, small;
	char temp;

	for(i=number_of_users; i>0; i--)
	{
		small=0;
		for(j=1;j<-i;j++)
		{
			if(usr_name_array[j] < usr_name_array[small])
			{
				small = j;
			}
		}
		temp = usr_name_array[small];
		usr_name_array[small] = usr_name_array[i];
		usr_name_array[i] = temp;

	}
}

void search_for_user(char usr_name_array[], int upper, int lower, char user_to_look_for)
{
	int search_pos, compare_count=1;

	search_pos(lower+upper)/2;

	while((!strcmp(usr_name_array[search_pos], user_to_look_for) && (lower <= upper))
	{
		compare_count++;
		if(usr_name_array[search_pos] > user_to_look_for)
		{
			upper = search_pos -1;
		}
		else
		{
			lower=search_pos+1;
		}
		search_pos=(lower+upper)/2;
	}
	if(lower<=upper)
	{
		cout << "\nUser found " << compare_count << " times!";
	}
	else
	{
		cout << "\nUser not found!";
	}
}
