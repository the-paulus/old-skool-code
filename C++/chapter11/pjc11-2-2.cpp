//Paul Lyon
//Project 11.2.2
//p11-2-2.cpp

#include<iostream.h>
#include<fstream.h>
#define PRINT_IT ofstream prn("PRN")
PRINT_IT;

char loc[40];
float sum, average, temp;
int ctr;
ifstream FILE;

int main()
{
	cout << "\nEnter the file path which contains the tempature data: ";
	prn << "\nEnter the file path which contains the tempature data: ";
	cin.get(loc,40);
	cin.ignore(80,'\n');

	FILE.open(loc,ios::in);

	do
	{
		FILE >> temp;
		sum = sum + temp;
		ctr++;
	}while(!FILE.eof());

	average = sum / ctr;

	cout << "\nThe average tempature of the past " << ctr << " is " << average << " degrees Celius.";
	prn << "\nThe average tempature of the past " << ctr << " is " << average << " degrees Celius.";
	return 0;
}
