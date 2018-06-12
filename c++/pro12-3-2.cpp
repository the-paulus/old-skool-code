//Paul Lyon
//Problem 12.3.1
//pro12-3-1.cpp

#include<iostream.h>
#include "rec.h"

int main()
{
REC Rec_One;
int side1, side2;
int area, vol;
 cout << "\nWhat is the length of the rectangle? ";
 cin >> side1;
 cout << "\nWhat is the width of the rectangle? ";
 cin >> side2;

Rec_One.SetSide(side1, side2);
area = Rec_One.Area();

 cout << "\nThe area of the rectangle is: " << area;

return 0;
}
































