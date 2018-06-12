//Paul Lyon
//Project 11-3
//p11-3.cpp

#include<iostream.h>
#include<fstream.h>
#include<ctype.h>
#define PRINT_IT ofstream prn("PRN")
PRINT_IT;

char fullname[40];
int i = 0;
bool is = isspace(fullname[i]);

int main()
{
	cout << "\nEnter your FULL name: ";
	prn << "\nEnter your FULL name: ";
	cin.get(fullname,40);
	cin.ignore(80,'\n');
	prn << fullname;

	fullname[0] = fullname[0] - 32;

	do
	{
		is = isspace(fullname[++i]);

		if (is == 1)
		{
			++i;
			fullname[i] = fullname[i] - 32;
		}

		
	}while(i < 40);

	cout << '\n' << fullname;
	prn << '\n' << fullname;
	return 0;
}

