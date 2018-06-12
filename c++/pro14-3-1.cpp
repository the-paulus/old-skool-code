//Paul Lyon
//problem 14.3.1
//pro14-3-1.cpp

#include<iostream.h>
#include"vector.h"
#include<fstream.h>
#define PRINT_IT ofstream prn("PRN")
PRINT_IT;

int main()
{
	vector <int> InputNum(10,0);
	int amount = 0;
	
	cout << "\nHow many numbers do you plan on tormenting me with? ";
	cin >> amount;

	/****************************Printing****************************/
	prn << "\nHow many numbers do you plan on tormenting me with? ";
	prn << amount;
	/****************************End*********************************/

	if(amount > InputNum.length())
	{
		InputNum.resize(amount);
	}

	for(int ctr = 0; ctr < amount; ctr++)
	{
		cout << "\nEnter one of your many numbers: ";
		cin >> InputNum[ctr];

		/****************************Printing****************************/
		prn << "\nEnter one of your many numbers: ";
		prn << InputNum[ctr];
		/****************************End*********************************/
	}

	cout << "\nThe Numbers you have entered are:\n";
	prn <<  "\nThe Numbers you have entered are:\n";

	for(ctr = 0; ctr < amount; ctr++)
	{
		cout << InputNum[ctr] << endl;
		prn << InputNum[ctr] << endl;
	}

	return 0;
}