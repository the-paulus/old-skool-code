//Paul Lyon
//Project 11-1
//11-1.cpp

#include<iostream.h>
#include<fstream.h>
#define PRINT_IT ofstream prn("PRN")
PRINT_IT;

char rm_spc(char file);
char ch;
char fileIN[50];
char fileOUT[50];
ofstream OFILE;
ifstream IFILE;

int main()
{
	cout << "\nEnter a file path to a text file. Make sure it has a lot of spaces: ";
	prn << "\nEnter a file path to a text file. Make sure it has a lot of spaces: ";
	cin.get(fileIN,50);
	cin.ignore(80,'\n');
	prn << fileIN;

	cout << "\nEnter a path so a new file can be created: ";
	prn << "\nEnter a path so a new file can be created: ";
	cin.get(fileOUT,50);
	cin.ignore(80,'\n');
	prn << fileOUT;

	OFILE.open(fileOUT,ios::out);
	IFILE.open(fileIN,ios::in);

	if (!OFILE)
	{
		cout << "\nNew file has been created!";
		prn << "\nNew file has been created!";
	}
	
	while (!IFILE.eof())
	{
		IFILE >> ch;
		if((ch == 32) || (ch == '\n'))
		{
			//do nothing till next time around
		}
		else
		{
			OFILE << ch;
		}
	}
	return 0;
}

		
