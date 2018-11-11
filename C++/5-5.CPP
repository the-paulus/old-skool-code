//Paul Lyon
//5-5.cpp
#include <iostream.h>
#include <fstream.h>
#define PRINT_IT ofstream prn("PRN")
PRINT_IT;

main()
{
	int money, years;
	float intrestrate, intrest;

	cout << "\nHow much money do you want to loan? $";
	cin >> money;

	cout << "\nWhat is the intrest rate? ";
	cin >> intrestrate;

	cout << "\nHow many years will it take to pay back? ";
	cin >> years;

	intrest = money * intrestrate / years;

	cout << "\nThe intrest will be $" << intrest;

	//Printing
	prn << "\nPaul Lyon\n5-5.cpp";
	prn << "\nHow much money do you want to loan? $";
	prn << money;
	prn << "\nWhat is the intrest rate? ";
	prn << intrestrate;
	prn << "\nHow many years will it take to pay back? ";
	prn << years;
	prn << "\nThe intrest will be $" << intrest;

	return 0;

}