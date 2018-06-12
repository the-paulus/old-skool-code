//Paul Lyon
//Exercise 13-8
//e13-8.cpp

#include <iostream.h>
#include <fstream.h>
#include "oostring.h"
#include "oostring.cpp"
#define PRINT_IT ofstream prn("PRN")
PRINT_IT;

int main()
{
	oostring IntegerString("100");
	oostring FloatString("99.99");

	cout << "\nThe numeric value of IntegerString is " << IntegerString.converttoint() << endl;
	cout << "\nThe numeric value of FloatString is " << FloatString.converttofloat() << endl;

	prn << "\nThe numeric value of IntegerString is " << IntegerString.converttoint() << endl;
	prn << "\nThe numeric value of FloatString is " << FloatString.converttofloat() << endl;

	return 0;
}