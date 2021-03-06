// Paul Lyon
// Exercise 12-1
// OOP.cpp

#include "circle2.h"                  
#include <iostream.h>
#include <fstream.h>
#include <iomanip.h>
#define PRINT_IT ofstream prn("PRN")
PRINT_IT;

int main()
{
 circle Circle_One;    //Declares Circle 1 and 2 as circles              
 circle Circle_Two;                  
 float User_Radius, R1, R2;
 double Area;


 Circle_One.SetRadius(1.5);  //Sets the private variable to what the user wants it to be
 R1 = Circle_One.R_Radius();				     

 Circle_Two.SetRadius(1.5);  
 R2 = Circle_Two.R_Radius();				     

 Area = Circle_One.Area();      //Sets the area variable     
				     
 cout.setf(ios::fixed);	//prevents scienctific notetation
 cout << "\nThe area of a circle that has a radius of " << setprecision(2) << R1 << " is " << Area << ".\n";
 prn << "\nThe area of a circle that has a radius of " << setprecision(2) << R1 << " is " << Area << ".\n";
 
 cout.unsetf(ios::fixed);
 return(0);
}