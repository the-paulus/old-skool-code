
//Paul Lyon
//Problem 13.1.1
//pro13-1-1.cpp

#include<iostream.h>
#include"oostring.h"
#include "oostring.cpp"
#include<fstream.h>
#define PRINT_IT ofstream prn("PRN")
PRINT_IT;

int main()
{
	oostring result, string;
	int slen, ctr=0;

	cout << "\nEnter a string: ";
	prn << "\nEnter a string: ";
	getline(cin,string);
	prn << string;

	slen = string.length();

	slen = slen / 2;

	while(ctr != (40-slen))
	{
		result += " ";
		ctr++;
	}

	result += string;

	cout << '\n' << result;
	prn << '\n' << result;

	return 0;
}