//Paul Lyon
//Problem 14.1.2
//pro14-1-2.cpp

#include<iostream.h>
#include<iomanip.h>
#include<fstream.h>
#define PRINT_IT ofstream prn("PRN")
PRINT_IT;

int main()
{
	int const array_size = 32;
	int daily_temp[array_size];
	int num_values;
	int index;
	int total = 0;
	int tempTemp;
	int High_Temp;
	int Low_Temp;
	float average_high; 
	
	//Loop asking for number of days
	do  
	{
		
		//Ask for how many days that data was collected for.
		cout << "Enter the number of days for which you have data for: ";
		prn <<  "Enter the number of days for which you have data for: ";
		cin >> num_values;
		prn << num_values;

		//If the number of days are too small
		if ((num_values < 1) || (num_values > array_size - 1))
		{
			cout << "The number of days must be in the range 1 to " << array_size - 1 << endl;
			prn << "The number of days must be in the range 1 to " << array_size - 1 << endl;
		}
	} while ((num_values < 1) || (num_values > array_size - 1));

	//loop asking for data.
	for(index = 1; index <= num_values; index++)
    {
		cout << "Enter the high temperature for day " << index << ": ";
		prn << "Enter the high temperature for day " << index << ": "; 
		cin >> daily_temp[index];  
		prn << daily_temp[index];
    }

	cout << "The array contains high temperatures for " << num_values << " days.\n";
	prn << "The array contains high temperatures for " << num_values << " days.\n";
	cout << "The values are as follows.\n";
	prn <<  "The values are as follows.\n";

	//loop for getting temps
	for(index = 1; index <= num_values; index++)
	{
		cout << "Day " << index << ": " << daily_temp[index] << endl;
		prn << "Day " << index << ": " << daily_temp[index] << endl;
		total = total + daily_temp[index]; 
	}

	High_Temp = 0;
	Low_Temp = 1000;

	//Hight Temp
	for(index = 1; index <= num_values; index++)
	{
		tempTemp = daily_temp[index];

		if(tempTemp > High_Temp)
		{
			High_Temp = tempTemp;
		}
	}

	tempTemp = 0;

	//Low temp
	for(index = 1; index <= num_values; index++)
	{
		tempTemp = daily_temp[index];

		if(tempTemp < Low_Temp)
		{
			Low_Temp = tempTemp;
		}
	}

	//gets average
	average_high = (float) total / (float) num_values;

	cout << "The average high temperature during the " << num_values << "-day period was " << setprecision(2) << average_high << " degrees.\n";
	prn << "The average high temperature during the " << num_values << "-day period was " << setprecision(2) << average_high << " degrees.\n";
	cout << "\nThe high is " << High_Temp;
	prn << "\nThe high is " << High_Temp;
	cout << "\nThe low is " << Low_Temp;
	prn << "\nThe low is " << Low_Temp;

	return 0;
}
