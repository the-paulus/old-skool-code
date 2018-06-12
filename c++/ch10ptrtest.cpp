//Paul Lyon
//Chapter 10 test Pointer Program
//chap10ptr.cpp

#include<iostream.h>
#include<fstream.h>
#define PRINT_IT ofstream prn("PRN")
PRINT_IT;

int main()
{
	double var1, var2, *var_ptr, *var_ptr2; //step 1

	var_ptr=&var1; 
	var1=4.67;
	var_ptr2=&var2;
	var2=15.965;

	cout << '\n' << *var_ptr;
	cout << '\n' << *var_ptr2;

	prn << '\n' << *var_ptr;
	prn << '\n' << *var_ptr2;
	return 0;
}