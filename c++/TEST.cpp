//Paul Lyon
//Chapter 14 Test

#include<iostream.h>
#include<fstream.h>
#include<string.h>

#define PRINT_IT ofstream prn("PRN")
PRINT_IT;

int main()
{
	char city[20]= "Shallowater"; 
	char state[30] = "Texas";
	char zip[11] = "79363-1151";
	char combined[100];
	char user[50];

	cout << "\nlength of zip: " << strlen(zip) << '\n';
	prn << "\nlength of zip: " << strlen(zip) << '\n';

	strcpy(combined, city);
	strcat(combined, ", ");
	strcat(combined, state);
	strcat(combined, " ");
	strcat(combined, zip);

	cout << "\nLength of combined: " << strlen(combined);
	cout << "\ncombined holds: " << combined;
	cout << "\n\ncity: " << city << "\nstate: " << state << "\nzip: " << zip;
	prn << "\nLength of combined: " << strlen(combined);
	prn << "\ncombined holds: " << combined;
	prn << "\n\ncity: " << city << "\nstate: " << state << "\nzip: " << zip;

	cout << "\n\nEnter your city state and zip: ";
	prn << "\n\nEnter your city state and zip: ";
	cin.get(user,50);
	cin.ignore(80,'\n');
	prn << user;

	cout << "\nYou entered: " << user;
	prn << "\nYou entered: " << user;
	return 0;
}