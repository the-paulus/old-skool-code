//Paul Lyon
//Exercise 15.2
//e15-2.cpp

#include<iostream.h>
#include<fstream.h>
#include<iomanip.h>
#define PRINT_IT ofstream prn("PRN")
PRINT_IT;

int main()
{
	float DISTANCE[6] = { 50, 100, 200, 400, 800, 1000 };
	float TIME[6] = { 7.39, 13.44, 27.67,69.82, 160.68, 230.13 };
	int i=0;
	
	cout.setf(ios::showpoint);
	cout.setf(ios::fixed);

	cout << "Distance" << setw(10) << "Time" << endl;
	cout << "--------" << setw(10) << "----" << endl;
	prn << "Distance" << setw(10) << "Time" << endl;
	prn << "--------" << setw(10) << "----" << endl;

	for(i=0; i<=6; i++)
	{
		cout << setprecision(2) << DISTANCE[i] << setw(15) << TIME[i] << endl;
		prn << setprecision(2) << DISTANCE[i] << setw(15) << TIME[i] << endl;
	}

	return 0;
}