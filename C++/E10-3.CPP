//Paul Lyon
//e10-3.cpp

#include <iostream.h>
#include <fstream.h>
#define O cout
#define I cin
#define P prn
#define PRINT_IT ofstream prn("PRN")
PRINT_IT;

int main()
{
	float a, b, *float_ptr;

	a = 169.8;
	b = 237.5;

	do
	{
		O << "The two numbers are " << a << " and " << b << endl;
		P << "The two numbers are " << a << " and " << b << endl;

		if (a >= b)
		{
			float_ptr = &a;
		}
		else
		{
			float_ptr = &b;
		}

		O << "The largest of the two numbers is " << *float_ptr << endl;
		O << *float_ptr;
		P << "The largest of the two numbers is " << *float_ptr << endl;
		P << *float_ptr;


		*float_ptr = *float_ptr / 2;
		
		O << " divided by 2 is " << *float_ptr;
		P << " divided by 2 is " << *float_ptr;

	} while((a > 1.0) && (b > 1.0));

	return 0;

}
