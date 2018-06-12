//Paul Lyon
//Project 13-1
//prj13-1.cpp

#include<iostream.h>
#include<fstream.h>
#include<string.h>
#include<memory.h>
#include <conio.h>
char StringCat(char *S1, char *S2);

int main()
{
	char String[10], String2[10];

	cout << "\nEnter a string: ";
	cin.get(String,10);
	cin.ignore(80,'\n');

	cout << "\nEnter a string to append to the first string: ";
	cin.get(String2,10);
	cin.ignore(80,'\n');

	cout << "\n\n" << StringCat(String,String2);

	return 0;

}

char StringCat(char *S1, char *S2)
{
	for(
}
