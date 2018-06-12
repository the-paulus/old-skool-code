//Paul Lyon
//Project 13-1
//project13-1.cpp

#include <iostream.h>
#include <fstream.h>
#include <string.h>
#define PRINT_IT ofstream prn("PRN")
PRINT_IT;

void StringCat1(char *d, char *s);
char char1[10];
char char2[10];

int main()
{


	cout << "\nEnter a string: ";
	prn << "\nEnter a string: ";
	cin.get(char1, 10);
	cin.ignore(80,'\n');
	prn << char1;

	cout << "\nEnter a string: ";
	prn << "\nEnter a string: ";
	cin.get(char2, 10);
	cin.ignore(80,'\n');
	prn << char2;

	StringCat1(char1, char2);

	return 0;
}

void StringCat1(char *d, char *s)
{
	cout<<d<<s;
	prn<<d<<s;
}
