//Paul Lyon
//Project 15-1
//pro15-1.cpp

#include <iostream.h>
#include <iomanip.h>
#include <stdlib.h>
#include <fstream.h>
#define PRINT_IT ofstream prn("PRN")
PRINT_IT;

int main()
{
	char NAME[20];
	int i;

	cout << "\nEnter your name: ";
	prn << "\nEnter your name: ";
	cin.get(NAME,20);
	cin.ignore(20,'\n');
	prn << NAME;

	for(i=0; i<20; i++)
	{
		if(NAME[i] != '\0')
		{
			cout << "\n " << setw(i+1) << NAME[i];
			prn << "\n " << setw(i+1) << NAME[i];
		}
		else
		{
			break;
		}
	}

return 0;
}
