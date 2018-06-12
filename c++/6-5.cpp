//Paul Lyon
//6-4.cpp
#include <iostream.h>
#include <fstream.h>
#define O cout
#define I cin
#define P prn
#define PRINT_IT ofstream prn("PRN")
PRINT_IT;

main()
{
	float height, width, FrameMaterial, MattingMaterial, TotalCostFrame, TotalCostMatt;

	O << "\nEnter the height of the picture: ";
	I >> height;
	O << "\nEnter the width of the picture: ";
	I >> width;

	FrameMaterial = (height+1) * (width+1)-(height*width);
	TotalCostFrame = (FrameMaterial *.25)*(FrameMaterial *.25);
	MattingMaterial = (height+1) * (width+1)-(height*width);
	TotalCostMatt = MattingMaterial * .1;

	O << "\nThe price to frame a picture " << height << "x" << width << " would cost $" << TotalCostFrame;
	O << "\nThe price to matt a picture " << height << "x" << width << " would cost $" << TotalCostMatt;

	//Printing
	P << "\nEnter the height of the picture: ";
	P << height;
	P << "\nEnter the width of the picture: ";
	P << width;
	P << "\nThe price to frame a picture " << height << "x" << width << " would cost $" << TotalCostFrame;
	P << "\nThe price to matt a picture " << height << "x" << width << " would cost $" << TotalCostMatt;

	return 0;

}