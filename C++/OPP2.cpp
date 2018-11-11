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

 cout << "\nWhat is the radius of the the first circle? ";
 prn << "\nWhat is the radius of the the first circle? "; 
 cin  >> User_Radius;
 prn << User_Radius;

 Circle_One.SetRadius(User_Radius);  //Sets the private variable to what the user wants it to be
 R1 = Circle_One.R_Radius();				     

 cout << "\nWhat is the radius of the second circle? ";
 prn << "\nWhat is the radius of the second circle? ";
 cin >> User_Radius;
 prn << User_Radius;

 Circle_Two.SetRadius(User_Radius);  
 R2 = Circle_Two.R_Radius();				     

 Area = Circle_One.Area();      //Sets the area variable     
				     
 cout.setf(ios::fixed);	//prevents scienctific notetation
 cout << "\nThe area of the first circle that has a radius of " << setprecision(2) << R1 << " is " << Area << ".\n";
 prn << "\nThe area of the first circle that has a radius of " << setprecision(2) << R1 << " is " << Area << ".\n";
 
 Area = Circle_Two.Area();           
				     

 cout << "\nThe area of the second circle that has a radius of " << setprecision(2) << R2 << " is " << Area << ".\n";
 prn <<  "\nThe area of the second circle that has a radius of " << setprecision(2) << R2 << " is " << Area << ".\n";
 cout.unsetf(ios::fixed);
 return(0);
}