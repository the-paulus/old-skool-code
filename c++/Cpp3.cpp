//Paul Lyon
//page 87 5-9

#include <iostream.h>
#include <fstream.h>
#define PRINT_IT ofstream prn("PRN")
PRINT_IT;

main()
{
	const BaseFine = 5;
	int InputFine, FinalFine;

	cout << "How many miles over the speed limit was the driver going? ";
	prn << "How many miles over the speed limit was the driver going? ";
	cin >> InputFine;
	prn << InputFine;
	
	FinalFine = InputFine * BaseFine;

	cout << "Issue a ticket for $" << FinalFine;
	prn << "Issue a ticket for $" << FinalFine;
	return 0;

}