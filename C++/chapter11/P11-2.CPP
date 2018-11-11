//Paul Lyon
//Project 11-2
//p11-2.cpp

#include<iostream.h>
#include<fstream.h>
#define PRINT_IT ofstream prn("PRN")
PRINT_IT;

int main()
{
char ch,PATH[50];
int s=0, n=0, c=0;

ifstream FILE;

cout << "\nEnter a file path so I can count its characters: ";
prn << "\nEnter a file path so I can count its characters: ";
cin.get(PATH,50);
cin.ignore(80,'\n');
prn << PATH;

FILE.open(PATH,ios::in);
FILE.unsetf(ios::skipws);

if (FILE)
{
	while(!FILE.eof())
	{
		FILE >> ch;

		if(ch == ' ')
		{
			s++;
		}
		if(ch == '\n')
		{
			n++;
		}
		if((ch != ' ') || (ch != '\n'))
		{
			c++;
		}
	}

		cout << "\nThe file " << PATH << " contains:";
		cout << '\n' << s << " spaces.";
		cout << '\n' << n << " lines.";
		cout << '\n' << c << " characters.";
		prn << "\nThe file " << PATH << " contains:";
		prn << '\n' << s << " spaces.";
		prn << '\n' << n << " lines.";
		prn << '\n' << c << " characters.";
}
else
{
cout << "\nError opening file! Check the path and try again.";
prn << "\nError opening file! Check the path and try again.";
return 0;
}
return 0;
}