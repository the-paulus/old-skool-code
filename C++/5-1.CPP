//Paul Lyon
//5-1.cpp
#include <iostream.h>
#include <fstream.h>
#define PRINT_IT ofstream prn("PRN")
PRINT_IT;

main()
{
	int people;

	prn << "Paul Lyon\n5-1.cpp";
	cout << "\nHow many people will be traveling? ";
	prn << "\nHow many people will be traveling? ";
	cin >> people;
	prn << people;

	cout << " \n" << people / 50 << " Charter buses will be needed, and " << people % 50 << " will be put in vans.";
	prn << "\n" << people / 50 << " Charter buses will be needed, and " << people % 50 << " people will be put in vans.";
	return 0;
}