//Paul Lyon
//exercise 11-2
//e11-2.cpp

#include<iostream.h>
#include<fstream.h>
#define PRINT_IT ofstream prn("PRN")
PRINT_IT;

int main()
{
	float x;
	ofstream FILE;

	FILE.open("FLOATS.TXT",ios::out);

	if (FILE)
	{

		cout << "\nEnter a series of floating point numbers.\n";
		cout << "\nEnter a zero to end the series.\n";
		prn << "\nEnter a series of floating point numbers.\n";
		prn << "\nEnter a zero to end the series.\n";

		do
		{

			cout << "\nNumber: ";
			prn << "\nNumber: ";
			cin >> x;
			prn << x;

			FILE << x << endl;
		}while(x != 0.0);

	}
	else
	{
		cout << "\nAn error has occured, due to the fact you're using Windows.";
		prn << "\nAn error has occured, due to the fact you're using Windows.";
	}

	return 0;
}
