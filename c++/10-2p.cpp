//Paul Lyon
//10-2p.cpp

#include <iostream.h>
#include <fstream.h>
#define PRINT_IT ofstream prn("PRN")
PRINT_IT;

char String[7] = "ABCDEF";
char EString[7];

int main()
{
	int i=0, ch;

	cout << "\nSee string..." << String;
	prn << "\nSee string..." << String;

	do
	{
		ch = String[i];
		String[i] = ch + 1;

		i++;
	} while (i < 6);

	cout << "... See string encrypted... " << String;
	prn << "... See string encrypted... " << String;


	return 0;
}