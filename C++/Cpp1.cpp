//Paul Lyon
//5-1.cpp
#include <iostream.h>
#include <fstream.h>
#define PRINT_IT ofstream prn("PRN")
PRINT_IT;

main()
{
	int people;

	cout << "How many people will be traveling? ";
	prn << "How many people will be traveling? ";
	cin >> people;
	prn << people;

	cout << people / 50 << " Charter buses will be needed, and " << people % 50 << " will be put in vans.";
	prn << << people / 50 << " Charter buses will be needed, and " << people % 50 << " will be put in vans.";
	return 0;
}