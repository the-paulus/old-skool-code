//Paul Lyon
//Problem 13.2.2
//pro13-2-2.cpp

#include<iostream.h>
#include"oostring.h"
#include"oostring.cpp"
#include<fstream.h>
#define PRINT_IT ofstream prn("PRN")
PRINT_IT;

int main()
{
	oostring first, last, full;

	cout << "\nEnter your first name: ";
	prn << "\nEnter your first name: ";
	getline(cin,first);
	prn << first;

	cout << "\nEnter your last name: ";
	prn << "\nEnter your last name: ";
	getline(cin,last);
	prn << last;

	full = first + " " + last;

	cout << '\n' << full;
	prn << '\n' << full;

	return 0;
}