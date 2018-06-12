//Paul Lyon
//e10-6.cpp

#include <iostream.h>
#include <fstream.h>
#define O cout
#define I cin
#define P prn
#define PRINT_IT ofstream prn("PRN")
PRINT_IT;

int main()
{
	enum size { small, medium, large, jumbo };
	size drink, popcorn;

	drink = large;
	popcorn = jumbo;

	if (drink == large)
	{
		O << "You could have a jumbo for another quarter.\n";
		P << "You could have a jumbo for another quarter.\n";
	}
	
	if ((drink == large) && (popcorn == jumbo))
	{
		O << "You need more soda to wash a jumbo popcorn down.\n";
		P << "You need more soda to wash a jumbo popcorn down.\n";
	}

	return 0;
}
		
