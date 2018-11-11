//Paul Lyon
//6-1.cpp

#include <iostream.h>
#include <fstream.h>
#define PRINT_IT ofstream prn("PRN")
PRINT_IT;

main()
{
	char Name[50], Address[50], City[30], State[3], PhoneNumber[15];
	int ZipCode;

	cout << "\nEnter your first and last name: ";
	cin.get(Name, 50);
	
	cout << "\nWhat is your street address? ";
	cin.get(Address, 50);
	
	cout << "\nWhat city do you live in? ";
	cin.get(City, 30);
	
	cout << "\nWhat state do you live in? (Two letter abrevation) ";
	cin.get(State, 3);
	
	cout << "\nWhat's your zip code? ";
	cin >> ZipCode;
	
	cout << "\nExample: (414)123-45678 \nWhat's your phone number? ";
	cin.get(PhoneNumber, 15);

	cout << "Thanks: \n" << Name << "\n" << Address << "\n" << City << ", " << State << " " << ZipCode << "\n\n I will be calling this number shortly: " << PhoneNumber;
	
	prn << "\nEnter your first and last name: ";
	prn << Name;
	prn << "\nWhat is your address? ";
	prn << Address;
	prn << "\nWhat city do you live in? ";
	prn << City;
	prn << "\nWhat state do you live in? (Two letter abrevation) ";
	prn << State;
	prn << "\nWhat's your zip code? ";
	prn << ZipCode;
	prn << "\nExample: (414)123-45678 \n What's your phone number? ";
	prn << PhoneNumber;

	return 0;
}
