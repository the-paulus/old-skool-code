//Paul Lyon
//ENUMTEST.cpp

#include <iostream.h>
#include <fstream.h>
#define O cout
#define I cin
#define P prn
#define PRINT_IT ofstream prn("PRN")
PRINT_IT;

int main()
{
	enum sizes {small, medium, large, jumbo};
	sizes drink_size, popcorn_size;

	drink_size = large;
	popcorn_size = jumbo;

	if (drink_size == large)
	{
		O << "You could have a jumbo for another quarter.\n";
	}
	if ((popcorn_size == jumbo) && (drink_size != jumbo))
	{
		O << "You need more drink to wash down a jumbo popcorn.\n";
	}

	return 0;
}
