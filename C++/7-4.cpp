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
	int UsrInput, UsrWeight;
	float WeightPlanet;

	O << "\nHow much do you weigh? (Dont lie either)";
	I >> UsrWeight;
	O << "\nWhat would you want calculated, your weight on..";
	O << "\n(1) Mercury \t (2) Staurn \t (3) Venus";
	O << "\n(4) Uranus \t (5) Mars \t (6) Neptune";
	O << "\n(7) Jupiter \t (8) Pluto";
	O << "\n? ";
	I >> UsrInput;

	switch(UsrInput)
	{
	case 1:
		WeightPlanet = UsrWeight * .37;
		break;
	case 2:
		WeightPlanet = UsrWeight * 1.15;
		break;
	case 3:
		WeightPlanet = UsrWeight * .88;
		break;
	case 4:
		WeightPlanet = UsrWeight * 1.15;
		break;
	case 5:
		WeightPlanet = UsrWeight * .38;
		break;
	case 6:
		WeightPlanet = UsrWeight * 1.12;
		break;
	case 7:
		WeightPlanet = UsrWeight * 2.64;
		break;
	case 8:
		WeightPlanet = UsrWeight * .04;
		break;
	}

	O << "\n\nYour weight on that planet is " << WeightPlanet << " lbs.";
	
	//Printing
	P << "\nHow much do you weigh? (Dont lie either)";
	P << UsrWeight;
	P << "\nWhat would you want calculated, your weight on..";
	P << "\n(1) Mercury \t (2) Staurn \t (3) Venus";
	P << "\n(4) Uranus \t (5) Mars \t (6) Neptune";
	P << "\n(7) Jupiter \t (8) Pluto";
	P << "\n? ";
	P << UsrInput;
	P << "\n\nYour weight on that planet is " << WeightPlanet << " lbs.";

	return 0;
}