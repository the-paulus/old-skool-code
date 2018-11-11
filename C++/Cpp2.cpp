//Paul Lyon

#include <iostream.h>

main()
{
	int money, years;
	float intrestrate, intrest;

	cout << "How much money do you want to loan? ";
	cin >> money;

	cout << "What is the intrest rate? ";
	cin >> intrestrate;

	cout << "How many years will it take to pay back? ";
	cin >> years;

	cout << "The intrest will be " << intrest;

	intrest = money * intrestrate / years;

	return 0;

}