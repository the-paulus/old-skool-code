//Paul Lyon
//Exercise 15-1
//e15-1.cpp

#include<iostream.h>
#include<fstream.h>
#include<iomanip.h>
#include "vector.h"
#define PRINT_IT ofstream prn("PRN")
PRINT_IT;

int main()
{
	vector <float> US[10] = { 264.32, 264.11, 264.03, 263.39, 262.79, 262.65, 262.04, 262.38, 261.87, 261.93 };
	vector <float> Jap[10] = { 24.23, 24.23, 24.23, 24.23, 24.23, 24.23, 24.23, 24.23, 24.23, 24.23 };
	vector <float> Germ[10] = { 95.18, 95.18, 95.18, 95.18, 95.18, 95.18, 95.18, 95.18, 95.18, 95.18 };
	float UK[10] = { 18.84, 19.03, 19.01, 19.01, 19.03, 19.03, 19.01, 19.01, 19.00, 18.99 };
	int index;
	cout.setf(ios::showpoint);
	
	for(index = 0; index <= 9; index++)
	{
		cout << setprecision(2) <<'\t' << 1980 + index 
			 << setw(10) << US[index]
			 << setw(10) << Jap[index]
			 << setw(10) << Germ[index]
			 << setw(10) << UK[index] << '\n';
		prn << setprecision(2) <<'\t' << 1980 + index 
			 << setw(10) << US[index]
			 << setw(10) << Jap[index]
			 << setw(10) << Germ[index]
			 << setw(10) << UK[index] << '\n';
	}
	
	cout << "\nUnited States:" << endl;
	prn << "\nUnited States:" << endl;
	for(index =0; index <=9; index++)
	{
		cout << setprecision(2) << "\n\t" << 1980+index << "\t\t"<< US[index] - US[index+1];
		prn << setprecision(2) << "\n\t" << 1980+index << "\t\t"<< US[index] - US[index+1];
	}

	cout << "\nJapan:" << endl;
	prn << "\nJapan:" << endl;
	for(index =0; index <=9; index++)
	{
		cout << setprecision(2) << "\n\t" << 1980+index << "\t\t"<< Jap[index] - Jap[index+1];
		prn << setprecision(2) << "\n\t" << 1980+index << "\t\t"<< Jap[index] - Jap[index+1];
	}

	cout << "\nGermany:" << endl;
	prn << "\nGermany:" << endl;
	for(index =0; index <=9; index++)
	{
		cout << setprecision(2) << "\n\t" << 1980+index << "\t\t"<< Germ[index] - Germ[index+1];
		prn << setprecision(2) << "\n\t" << 1980+index << "\t\t"<< Germ[index] - Germ[index+1];
	}

	cout << "\nUnited Kingdom:" << endl;
	prn << "\nUnited Kingdom:" << endl;
	for(index =0; index <=9; index++)
	{
		cout << setprecision(2) << "\n\t" << 1980+index << "\t\t"<< UK[index] - UK[index+1];
		prn << setprecision(2) << "\n\t" << 1980+index << "\t\t"<< UK[index] - UK[index+1];
	}
	return 0;
}