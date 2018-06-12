//Paul Lyon
//7-2.cpp

#include <iostream.h>
#include <fstream.h>
#define PRINT_IT ofstream prn("PRN")
#define O cout
#define I cin
#define P prn
PRINT_IT;

main()
{
	int Choice;
	float Money, CMoney;

	O << "\nHow much money do you have? $";
	I >> Money;
	
	O << "\nWhat do you want your money converted to?";
	O << "\n1-Pounds";
	O << "\n2-Guilders";
	O << "\n3-Marks";
	O << "\nCanadian Dollars";
	O << "\n? ";
	I >> Choice;

	switch(Choice)
	{
	case 1:
		CMoney = Money * 1.492
	break;
	case 2:
		CMoney = Money * 1.625;
	break;
	case 3:
		CMoney = Money * 1.4506;
	break;
	case 4;
		CMoney = Money * 1.3757;
	break;
	}

	