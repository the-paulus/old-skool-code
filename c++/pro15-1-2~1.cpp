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

	vector <float> US(10,0);
	vector <float> Jap(10,0);
	vector <float> Germ(10,0);
	vector <float> UK(10,0);
	int i_ctr = 1;

	cout << "\nEnter 10 values for the US:" << endl;
	prn << "\nEnter 10 values for the US:" << endl;

	for(int index = 0; index < 10; index++)
	{	
		cout << '\n' << i_ctr << ": ";
		prn << '\n' << i_ctr << ": ";
		cin >> US[index];
		prn << US[index];
		i_ctr++;
	}

	cout << "\nEnter 10 values for Japan:";
	prn << "\nEnter 10 values for Japan:";
	i_ctr=1;

	for(index = 0; index < 10; index++)
	{
		cout << '\n' << i_ctr << ": ";
		prn << '\n' << i_ctr << ": ";
		cin >> Jap[index];
		prn << Jap[index];
		i_ctr++;
	}

	cout << "\nEnter 10 values for Germany: ";
	prn << "\nEnter 10 values for Germany: ";
	i_ctr = 1;

	for(index = 0; index < 10; index++)
	{
		cout << '\n' << i_ctr << ": ";
		prn << '\n' << i_ctr << ": ";
		cin >> Germ[index];
		prn << Germ[index];
		i_ctr++;
	}
	cout << "\nEnter 10 values for the UK: ";
	prn << "\nEnter 10 values for the UK: ";
	i_ctr = 1;

	for(index = 0; index < 10; index++)
	{
		cout << '\n' << i_ctr << ": ";
		prn << '\n' << i_ctr << ": ";
		cin >> UK[index];
		prn << UK[index];
		i_ctr++;
	}

	cout << "\n\nUSA status:" <<endl;
	prn << "\n\nUSA status:" <<endl;
	i_ctr = 1;

	for(index = 0; index < 10; index++)
	{
		cout << i_ctr << ": " << US[index] << endl;
		prn << i_ctr << ": " << US[index] << endl;
		i_ctr++;
	}


	cout << "\n\nJapan status:" <<endl;
	prn << "\n\nJapan status:" <<endl;
	i_ctr = 1;

	for(index = 0; index < 10; index++)
	{
		cout << i_ctr << ": " << Jap[index] << endl;
		prn << i_ctr << ": " << Jap[index] << endl;
		i_ctr++;
	}

	cout << "\n\nGermany status:" <<endl;
	prn << "\n\nGermany status:" <<endl;

	for(index = 0; index < 10; index++)
	{
		cout << i_ctr << ": " << Germ[index] << endl;
		prn << i_ctr << ": " << Germ[index] << endl;
	}

	cout << "\n\nUnited Kingdom status:" <<endl;
	prn << "\n\nUnited Kingdom status:" <<endl;

	for(index = 0; index < 10; index++)
	{
		cout << i_ctr << ": " << UK[index] << endl;
		prn << i_ctr << ": " << UK[index] << endl;
	}

	return 0;
}