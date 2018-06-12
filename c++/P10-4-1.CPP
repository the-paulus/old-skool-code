//Paul Lyon
//p10-4-2.cpp

#include <iostream.h>
#include <fstream.h>
#define PRINT_IT ofstream prn("PRN")
PRINT_IT;

float dbpx(int x1, int x2);
float dbpy(int y1, int y2);

struct point
{
	int p1x;
	int p1y;
	int p2x;
	int p2y;
};

int main()
{
	point line;
	float disx, disy;
	
	cout << "Enter the x cordence for the first point: ";
	cin >> line.p1x;
	
	cout << "Enter the y cordence for the first point: ";
	cin >> line.p1y;

	cout << "Enter the x cordence for the second point: ";
	cin >> line.p2x;

	cout << "Enter the y cordence for the second point: ";
	cin >> line.p2y;

	disx = dbpx(line.p1x, line.p2x);
	disy = dbpy(line.p1y, line.p2y);

	cout << "The distance halfway between these two points is " << disx << ", " << disy;

	return 0;
}

float dbpx(int x1, int x2)
{
	return (x1+x2)/2;
}

float dbpy(int y1, int y2)
{
	return (y1+y2)/2;
}