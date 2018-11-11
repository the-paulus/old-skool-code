//Paul Lyon
//page 87 5-9

#include <iostream.h>
#include <fstream.h>
#define PRINT_IT ofstream prn("PRN")
PRINT_IT;

main()
{
	int SpeedLimit, DriverSpeed;
	float InputBaseFine, FinalFine, Pen;

	cout << "Paul Lyon\n5-9.cpp";

	cout << "\nWhat is fine for speeding? $";
	cin >> InputBaseFine;
	cout << "\nHow much do you add for every mile over the speed limit? $";
	cin >> Pen;
	cout << "\nWhat is the speed limit? ";
	cin >> SpeedLimit;
	cout << "\nHow fast was the driver going? ";
	cin >> DriverSpeed;

	FinalFine = InputBaseFine + ((DriverSpeed - SpeedLimit) * Pen);

	cout << "\nIssue a ticket for $" << FinalFine;

	//Printing
	
	prn << "Paul Lyon\n5-9.cpp";
	prn << "\nWhat is fine for speeding? $";
	prn << InputBaseFine;
	prn << "\nHow much do you add for every mile over the speed limit? $";
	prn << Pen;
	prn << "\nWhat is the speed limit? ";
	prn << SpeedLimit;
	prn << "\nHow fast was the driver going? ";
	prn << DriverSpeed;
	prn << "\nIssue a ticket for $" << FinalFine;

	return 0;
}

