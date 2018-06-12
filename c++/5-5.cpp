//Paul Lyon
//5-5.cpp

#include <iostream.h>
#include <fstream.h>
#define PRINT_IT ofstream prn("PRN")
PRINT_IT;


main()
{
	float money, irate, years, simplein;

	cout << "How much money will be loaned? ";
	prn << "How much money will be loaned? ";
	cin >> money;
	prn << money;

	cout << "\nWhat is the interest rate? ";
	prn << "\nWhat is the interest rate? ";
	cin >> irate;
	prn << irate;

	cout << "\nHow many years will it take to pay off? ";
	prn << "\nHow many years will it take to pay off? ";
	cin >> years;
	prn << years;

	simplein = money * irate * years;

	cout << "\nThe interest is $" << simplein;
	prn << "\nThe interest is $" << simplein;

	return 0;

}