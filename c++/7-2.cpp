//Paul Lyon
//6-4.cpp
#include <iostream.h>
#include <fstream.h>
#include <string.h>
#define O cout
#define I cin
#define P prn
#define PRINT_IT ofstream prn("PRN")
PRINT_IT;

main()
{
	char Type[20];
	float USDollars, ConvertedMoney;
	int Choice;

	O << "\nHow much do you want converted to foreign currency? $";
	I >> USDollars;
	O << "\nWhat kind of currency do you want? ";
	O << "\n1-Pounds";
	O << "\n2-Guilders";
	O << "\n3-Marks";
	O << "\n4-Canadian Dollars";
	O << "\n? ";
	I >> Choice;
	
	switch(Choice)
	{
	case 1:
		ConvertedMoney = USDollars * 1.492;
		strcpy(Type, "Pounds");
		break;
	case 2:
		ConvertedMoney = USDollars * 1.5754;
		strcpy(Type, "Guilders");
		break;
	case 3:
		ConvertedMoney = USDollars * 1.4505;
		strcpy(Type, "Marks");
		break;
	case 4:
		ConvertedMoney = USDollars * 1.3757;
		strcpy(Type, "Canadian Dollars");
		break;
	}
	
	O << "\n$" << USDollars << " is worth " << ConvertedMoney << " " << Type;
	
	//Printing
	P << "\nHow much do you want converted to foreign currency? $";
	P << USDollars;
	P << "\nWhat kind of currency do you want? ";
	P << "\n1-Pounds";
	P << "\n2-Guilders";
	P << "\n3-Marks";
	P << "\n4-Canadian Dollars";
	P << "\n? ";
	P << Choice;
	P << "\n$" << USDollars << " is worth " << ConvertedMoney << " " << Type;

	return 0;
}
