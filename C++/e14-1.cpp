//Paul Lyon
//exercise 14-1
//e14-1.cpp

#include<iostream.h>
#include<fstream.h>
#define PRINT_IT ofstream prn("PRN")
PRINT_IT;

int main()
{
	int num[3];

	num[0] = 12;
	num[1] = 16;
	num[2] = 32;

	cout << num[0] << ' ' << num[1] << ' ' << num[2] << endl;
	prn << num[0] << ' ' << num[1] << ' ' << num[2] << endl;

	return 0;
}