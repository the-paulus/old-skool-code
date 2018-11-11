//Paul Lyon
//problem 13.3.1
//pro13-3-1.cpp

#include<iostream.h>
#include<fstream.h>
#include<stdlib.h>
#define PRINT_IT ofstream prn("PRN")
PRINT_IT;

int main()
{
	char number[10], number2[10];
	float num1, num2, ans;

	cout << "\nEnter a number: ";
	prn << "\nEnter a number: ";
	cin.get(number,10);
	cin.ignore(80,'\n');
	prn << number;

	cout << "\nEnter another number: ";
	prn << "\nEnter another number: ";
	cin.get(number2,10);
	cin.ignore(80,'\n');
	prn << number2;

	num1 = atoi(number);
	num2= atoi(number2);
	ans = num1 * num2;

	cout << '\n' << num1 << " times " << num2 << " equals: " << ans;
	prn << '\n' << num1 << " times " << num2 << " equals: " << ans;

	return 0;
}