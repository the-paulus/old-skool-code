//Paul Lyon
//Project 14-1
//proj14-1.cpp

#include<iostream.h>
#include<fstream.h>
#include"vector.h"
#define PRINT_IT ofstream prn("PRN")
PRINT_IT;

int main()
{
	vector <float> Floats(10,0);	//declare template
	int num_values;           //Temp
	int index = 0, a = 0;                //counter
	int total = 0;            //total

	cout << "\nHow many floats would you like to enter? ";
	prn << "\nHow many floats would you like to enter? ";
	cin >> num_values;
	prn << num_values;

	if (num_values < 1)
	{
		do
		{
			cout << "\nHey I don't think so. Try again!" << endl;
			prn << "\nHey I don't think so. Try again!" << endl;
			cin >> num_values;
			prn << num_values;

		}while (num_values < 1);
	}

	if (num_values > Floats.length())
	{
		Floats.resize(num_values);
	}

	for(index = 1; index <= num_values; index++)	//begin of loop
	{
		cout << "\nEnter float number " << index << ": ";	//get input
		prn << "\nEnter float number " << index << ": ";
		cin >> Floats[index];  // input value into array
		prn << Floats[index];
	}

	cout << "\nThe array contains " << num_values << " floats total.\n";
	prn << "\nThe array contains " << num_values << " floats total.\n";

	cout << "\nThe values are as follows.\n";
	prn << "\nThe values are as follows.\n";

	for(index = 1; index <= num_values; index++)
	{
		if(Floats[1] > Floats[index])
		{
			a++;
		}
	}

	cout << "\nThere were " << a << " numbers less than " << Floats[1];
	prn << "\nThere were " << a << " numbers less than " << Floats[1];

	return 0;
}