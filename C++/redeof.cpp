//Paul Lyon
//Exercise 11-6
//e11-6.cpp

#include<iostream.h>
#include<fstream.h>
#include<iomanip.h>

int main()
{
	float x;
	ifstream FILE;

	FILE.open("PRICES.DAT",ios::in);

	if (FILE)
	{
		cout << "The prices in the file are: \n" << setprecision(2);

		do
		{
			FILE >> x;
			if (!FILE.eof())
			{
				cout << x << endl;
			}
		}while(!FILE.eof());
	}
	else
	{
		cout << "An error occurred while opening the file.\n";
	}
	FILE.close();
	
	return 0;
}
