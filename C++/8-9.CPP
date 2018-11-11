//Paul Lyon
//8-9.cpp

#include <iostream.h>
#include <fstream.h>
#include <math.h>
#define O cout
#define I cin
#define P prn
#define PRINT_IT ofstream prn("PRN")
PRINT_IT;

int main()
{
	int cents, centsq, centsd, centsn, centsp; 

	O << "\nHow much pocket change do you have? $.";
	P << "\nHow much pocket change do you have? $.";
	I >> cents;
	P << cents;

	/////////////////////Variable assigning//////////////////////////

	centsq = cents / 25;  //divids the total amount by 25
	
	cents = cents - (centsq * 25); //reassigns a vaule to cents

	centsd = cents / 10; //divids whats left over from above

	cents = cents - (centsd * 10); //reassigns a value to cents

	centsn = cents / 5; //divids whats left over by 5

	cents = cents - (centsn * 5); //reassigns a value to cents

	centsp = cents / 1; //divids whats left over.
	///////////////////End of Variable assigning/////////////////////

	O << "\nYou should have " << centsq << " quarters, " << centsd << " dimes, " << centsn << " nickles, and " << centsp << " pennies.";
	P << "\nYou should have " << centsq << " quarters, " << centsd << " dimes, " << centsn << " nickles, and " << centsp << " pennies.";
	return 0;
}