//Paul Lyon
//Exercise 15-1
//e15-1.cpp

#include<iostream.h>
#include<fstream.h>
#include<iomanip.h>
#define PRINT_IT ofstream prn("PRN")
PRINT_IT;

int main()
{
	float US[10] = { 264.32, 264.11, 264.03, 263.39, 262.79, 262.65, 262.04, 262.38, 261.87, 261.93 };
	float Jap[10] = { 24.23, 24.23, 24.23, 24.23, 24.23, 24.23, 24.23, 24.23, 24.23, 24.23};
	float Germ[10] = { 95.18, 95.18, 95.18, 95.18, 95.18, 95.18, 95.18, 95.18, 95.18, 95.18};
	float UK[10] = { 18.84, 19.03, 19.01, 19.01, 19.03, 19.03, 19.01, 19.01, 19.00, 18.99};
	int index;
	cout.setf(ios::showpoint);
	for(index = 0; index <= 9; index++)
	{
		cout << '\t' << 1980 + index 
			 << setw(10) << US[index]
			 << setw(10) << Jap[index]
			 << setw(10) << Germ[index]
			 << setw(10) << UK[index] << '\n';
		prn << '\t' << 1980 + index 
			 << setw(10) << US[index]
			 << setw(10) << Jap[index]
			 << setw(10) << Germ[index]
			 << setw(10) << UK[index] << '\n';
	}

	return 0;
}