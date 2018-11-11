//Paul Lyon
//e10-2.cpp

#include <iostream.h>
#include <fstream.h>
#define O cout
#define I cin
#define P prn
#define PRINT_IT ofstream prn("PRN")
PRINT_IT;

int main()
{
	int i, j, k;
	int *int_ptr;

	i = 1;
	j = 2;
	k = 3;
	int_ptr = &i;

	O << "i = " << i << '\n';
	O << "j = " << j << '\n';
	O << "k = " << k << '\n';
	O << "int_ptr = " << int_ptr << '\n';
	O << "&i = " << &i << '\n';
	P << "i = " << i << '\n';
	P << "j = " << j << '\n';
	P << "k = " << k << '\n';
	P << "int_ptr = " << int_ptr << '\n';
	P << "&i = " << &i << '\n';


	return 0;

}
