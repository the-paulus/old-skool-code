//Paul Lyon
//8-3.cpp

#include <iostream.h>
#include <fstream.h>
#define O cout
#define I cin
#define P prn
#define PRINT_IT ofstream prn("PRN")
PRINT_IT;

main()
{
	int Money, amount, total = 0;

	O << "\nHow much money are you trying to save? $";
	P << "\nHow much money are you trying to save? $";
	I >> Money;
	P << Money;

	do
	{
		O << "\nHow much money are you going to add? $";
		P << "\nHow much money are you going to add? $";
		I >> amount;
		P << amount;

		total = total + amount;

		O << "\nYou have $" << total << " so far";
		P << "\nYou have $" << total << " so far";
	} while (total < Money);

	O << "\nGood job!";		
	P << "\nGood job!";		

	return 0;
}

