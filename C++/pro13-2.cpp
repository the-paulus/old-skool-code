//Paul Lyon
//Project13-2
//pro13-2.cpp

#include<iostream.h>
#include<string.h>
#include<fstream.h>
#define PRINT_IT ofstream prn("PRN")
PRINT_IT;

char Reverse_String(char *str);

int main()
{
	char STRING[20];

	cout << "\nEnter a string: ";
	cin.get(STRING,20);
	cin.ignore(19,'\n');

	cout << Reverse_String(STRING);

	return 0;

}

char Reverse_String(char *str);
{
	int i,a=19;
	char reversed[20];

	for(i=0; i<20; i++; a--)
	{
		reversed[i] = str[a];
	}

	strcmp(str,reversed

	