//Paul Lyon
//Project 11-2
//prj11-2.cpp

#include<iostream.h>
#include<fstream.h>

ifstream FILE;
char LOCATE[40], ch;
int c, n;
int cnctr(ifstream FILE);

int main()
{
	cout << "*********Charater Counter***********";
	cout << "\nEnter the file path: ";
	cin.get(LOCATE,40);
	cin.ignore(80,'\n');

	if(!FILE)
	{
		cout << "\nThe file was not found, try again";
		return 0;
	}
	else
	{
		cout << cnctr(FILE);
	}
	
	return 0;
}

int cn_ctr(ifstream FILE);
{
	while(!FILE.eof())
	{
		FILE >> ch
			if(ch == 32)
			{
				c++;
			}
			if(ch == '\n')
			{
				n++;
			}
	}
	return "\nThe number of characters is: " << c << ". The newline count is: " << n;
}