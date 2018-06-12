//Paul Lyon
//10-2p.cpp

#include <iostream.h>
#include <fstream.h>
#define PRINT_IT ofstream prn("PRN")
PRINT_IT;


int main()
{
	int i=0, ch;
	int choice;

	cout << "\n(1)encrypt or (2)decrypt";
	prn << "\n(1)encrypt or (2)decrypt?";
	cout << "\nWhat do you want to do? ";
	prn << "\nWhat do you want to do? ";
	cin >> choice;	
	prn << choice;


	if (choice == 1)
	{
		char String[7] = "ABCDEF";

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
	}
	else
	{
		char String[7] = "BCDEFG";

		cout << "\nSee string..." << String;
		prn << "\nSee string..." << String;

		do
		{
			ch = String[i];
			String[i] = ch - 1;

			i++;
		} while (i < 6);
	cout << "... See string decrypted... " << String;
	prn << "... See string decrypted... " << String;
	}
	return 0;
}