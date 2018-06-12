
//Paul Lyon
//Problem 13.1.1
//pro13-1-1.cpp

#include<iostream.h>
#include<string.h>
#include<fstream.h>
#define PRINT_IT ofstream prn("PRN")
PRINT_IT;

int main()
{
	char string[15], resualt[80] = " ";
	int slen, ctr=0;

	cout << "\nEnter a string: ";
	prn << "\nEnter a string: ";
	cin.get(string,15);
	cin.ignore(80,'\n');
	prn << string;

	slen = strlen(string);

	slen = slen / 2;

	while(ctr != (40-slen))
	{
		strcat(resualt, " ");
		ctr++;
	}

	strcat(resualt, string);

	cout << '\n' << resualt;
	prn << '\n' << resualt;

	return 0;
}