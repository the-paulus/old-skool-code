//Paul Lyon
//p10-1-1.cpp

#include <iostream.h>
#include <fstream.h>
#define O cout
#define I cin
#define P prn
#define PRINT_IT ofstream prn("PRN")
PRINT_IT;

int main()
{
	float first, second, *typefloat;
	
	first = 1.25;
	second = 2.5;

	typefloat = &first;
	O << "\nThe value of \"first\" is " << typefloat;
	P << "\nThe value of \"first\" is " << typefloat;

	typefloat = &second;
	O << "\nThe value of \"second\" is " << typefloat;
	P << "\nThe value of \"second\" is " << typefloat;

	return 0;

}