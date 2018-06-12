//Paul Lyon
//problem 13.3.1
//pro13-3-1.cpp

#include<iostream.h>
#include<fstream.h>
#include<stdlib.h>
#include "oostring.h"
#include "oostring.cpp"
#define PRINT_IT ofstream prn("PRN")
PRINT_IT;

int main()
{
	oostring number, number2;
	float num1, num2, ans;

	cout << "\nEnter a number: ";
	prn << "\nEnter a number: ";
	cin >> number;
	prn << number;

	cout << "\nEnter another number: ";
	prn << "\nEnter another number: ";
	cin >> number2;
	prn << number2;

	num1 = number.converttoint();
	num2= number2.converttoint();
	ans = num1 * num2;

	cout << '\n' << num1 << " times " << num2 << " equals: " << ans;
	prn << '\n' << num1 << " times " << num2 << " equals: " << ans;

	return 0;
}