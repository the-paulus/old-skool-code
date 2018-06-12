//Paul Lyon
//Problem 12.3.1
//pro12-3-1.cpp

#include<iostream.h>
#include<fstream.h>
#include "squar.h"
#define PRINT_IT ofstream prn("PRN")
PRINT_IT;

int main()
{
SQUAR Squar_One;
int TSIDE;
int area, vol;
 cout << "\nWhat is the length of the squars side? ";
 prn << "\nWhat is the length of the squars side? ";
 cin >> TSIDE;

Squar_One.SetSide(TSIDE);
area = Squar_One.Area();
vol = Squar_One.Vol();

 cout << "\nThe area of the squar is: " << area << ".\nThe volume is: " << vol;
 prn << "\nThe area of the squar is: " << area << ".\nThe volume is: " << vol;

return 0;
}
































