//Paul Lyon
//Exercise 15-4
//e15-4.cpp

#include<iostream.h>
#include<fstream.h>
#define PRINT_IT ofstream prn("PRN")
PRINT_IT;

int main()
{
	float A = 5.46;
	double B = 2.342311;
	long double C = 3.46647483;

	cout << "\nThe variable A is sucking up " << sizeof(A) << " bytes." << endl;
	cout << "\nThe variable B is sucking up " << sizeof(B) << " bytes." << endl;
	cout << "\nThe variable C is sucking up " << sizeof(C) << " bytes." << endl;

	prn << "\nThe variable A is sucking up " << sizeof(A) << " bytes." << endl;
	prn << "\nThe variable B is sucking up " << sizeof(B) << " bytes." << endl;
	prn << "\nThe variable C is sucking up " << sizeof(C) << " bytes." << endl;

	return 0;
}