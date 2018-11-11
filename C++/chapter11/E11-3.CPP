//Paul Lyon
//Exercise 11-3
//e11-3.cpp

#include<iostream.h>
#include<fstream.h>
#include<iomanip.h>
#define PRINT_IT ofstream prn("PRN")
PRINT_IT;

int main()
{
float x, sum, average;
int count;
ifstream FILE;

FILE.open("FLOATS.TXT",ios::in);

sum = 0.0;
count = 0;
x = 0.0;
if (FILE)
{
	cout << "\nThe numbers in the data file area as followed: " << setprecision(1);
	prn << "\nThe numbers in the data file area as followed: " << setprecision(1);
	cout.setf(ios::fixed);

	do
	{
	
		FILE >> x;
		cout << x << endl;
		prn << x << endl;
		sum = sum + x;
		count++;
	}while(x!=0.0);

	average = sum / (count - 1);

	cout << "\nThe sum of the numbers is " << sum << endl;
	cout << "\nThe average of the numbers (excluding zero) is " << average << endl;
	prn << "\nThe sum of the numbers is " << sum << endl;
	prn << "\nThe average of the numbers (excluding zero) is " << average << endl;

}
else
{
	cout << "\nError opening file! Check to see if the correct file path is given.";
    prn << "\nError opening file! Check to see if the correct file path is given.";

	return 0;
}

FILE.close();

return 0;
}


