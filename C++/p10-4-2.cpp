//Paul Lyon
//midpoint.cpp

#include <iostream.h>
#include <fstream.h>
#define PRINT_IT ofstream prn("PRN")
PRINT_IT;

struct midline
{
	float p1x, p2x, p1y, p2y, mx, my;
};

int main()
{
	midline point; //declares variable

	cout << "\nWhere is the first point located? ";
	cout << "\nX: ";
	cin >> point.p1x;
	cout << "\nY: ";
	cin >> point.p1y;

	cout << "\nWhere is the second point located? ";
	cout << "\nX: ";
	cin >> point.p2x;
	cout << "\nY: ";
	cin >> point.p2y;

	point.mx = (point.p1x + point.p2x) / 2;
	point.my = (point.p1y + point.p2y) / 2;

	cout << "\nThe middle point of this line is (" << point.mx << ", " << point.my << ").";


	//Printing
	prn << "\nWhere is the first point located? ";
	prn << "\nX: ";
	prn <<  point.p1x;
	prn << "\nY: ";
	prn << point.p1y;

	prn << "\nWhere is the second point located? ";
	prn << "\nX: ";
	prn << point.p2x;
	prn << "\nY: ";
	prn << point.p2y;

	prn << "\nThe middle point of this line is (" << point.mx << ", " << point.my << ").";

	return 0;

}