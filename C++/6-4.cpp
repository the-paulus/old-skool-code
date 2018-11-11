//Paul Lyon
//6-4.cpp
#include <iostream.h>
#include <fstream.h>
#define O cout
#define I cin
#define P prn
#define PRINT_IT ofstream prn("PRN")
PRINT_IT;

main()
{
	int Shares;
	char StockName[30];
	float OpenValue, CloseValue, Resualt;

	O << "\nEnter the name of the stock: ";
	I.get(StockName, 30);
	
	O << "\nEnter the opening value for the stock: ";
	I >> OpenValue;

	O << "\nEnter the closing value for the stock: ";
	I >> CloseValue;

	O << "\nEnter the number of shares owned: ";
	I >> Shares;

	Resualt = OpenValue-CloseValue * Shares;

	O << "\nThe final resualt is " << Resualt;


	//Printing
	P << "\nEnter the name of the stock: ";
	P << StockName;
	P << "\nEnter the opening value for the stock: ";
	P << OpenValue;
	P << "\nEnter the closing value for the stock: ";
	P << CloseValue;
	P << "\nEnter the number of shares owned: ";
	P << Shares;
	P << "\nThe final resualt is " << Resualt << " difference";

	return 0;

}