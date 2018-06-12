//Paul Lyon
//Problem 14.1.1
//pro14-1-1.cpp

#include<iostream.h>
#include<fstream.h>
#define PRINT_IT ofstream prn("PRN")
PRINT_IT;

int main()
{
	int num[5];

	num[0] = 12;
	num[1] = 16;
	num[2] = 32;
	num[3] = 38;
	num[4] = 44;

	cout << num[0] << ' ' << num[1] << ' ' << num[2] << ' ' << num[3] << ' ' << num[4] <<endl;
	prn << num[0] << ' ' << num[1] << ' ' << num[2] << ' ' << num[3] << ' ' << num[4] <<endl;

	return 0;
}