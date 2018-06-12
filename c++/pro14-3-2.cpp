//Paul Lyon
//problem 14.3.2
//pro.14.3.2.cpp

#include <iostream.h>
#include <iomanip.h>
#include <fstream.h>
#include "vector.h"
#define PRINT_IT ofstream prn("PRN")
PRINT_IT;

int main()
{
  vector <int> Days(10,0);	//declare template
  int num_values;           //Temp
  int index;                //counter
  float average_high;       //average
  int total = 0;            //total

  do  // loop
  {
    cout << "Enter the number of days for which you have data: ";	//ask for input
    prn <<"Enter the number of days for which you have data: ";	
	cin >> num_values;	//get input
	prn <<num_values;
	
	//checks to see if user entered a number greated than 0
    if (num_values < 1)
     {
      cout << "\nThe number of days must be in the range 1 to " << Days.length() - 1 << endl;	//tell the user to enter a number from 1 to the length of days
	  prn << "\nThe number of days must be in the range 1 to " << Days.length() - 1 << endl;
     }
  } while (num_values < 1);	//end of loop

  
  if(num_values > Days.length())	//checks to see if the template needs resizing
  {
	  Days.resize(num_values);	//resizes to the number of entries
  }
  
  for(index = 1; index <= num_values; index++)	//begin of loop
   {
    cout << "\nEnter the high temperature for day " << index << ": ";	//get input
    cin >> Days[index];  // input value into array
	prn << "\nEnter the high temperature for day " << index << ": ";	//get input
    prn << Days[index];
   }

  // Print the values in the array to the screen.
  cout << "\nThe array contains high temperatures for " << num_values << " days.\n";
  prn << "\nThe array contains high temperatures for " << num_values << " days.\n";
  cout << "\nThe values are as follows.\n";
  prn << "\nThe values are as follows.\n";

  for(index = 1; index <= num_values; index++)
   {
    cout << "\nDay " << index << ": " << Days[index] << endl;
	prn << "\nDay " << index << ": " << Days[index] << endl;
    total += Days[index]; // update total for averaging
   }

	//convers the total and num_values to floats
  average_high = (float) total / (float) num_values;

  // Print the results to the screen.
  cout << "\nThe average high temperature during the " << num_values << "-day period was " << setprecision(2) << average_high << " degrees.\n";
  prn << "\nThe average high temperature during the " << num_values << "-day period was " << setprecision(2) << average_high << " degrees.\n";

  return 0;
}
