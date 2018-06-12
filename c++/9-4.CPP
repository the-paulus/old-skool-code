//Paul Lyon
//9-4.cpp

#include <iostream.h>
#include <fstream.h>
#define O cout
#define I cin
#define P prn
#define PRINT_IT ofstream prn("PRN")
PRINT_IT;

void Delay();

int main()
{
	Delay();
	O << "\nThe green light means go.";
	P << "\nThe green light means go.";
	Delay();
	O << "\nThe yellow light means slow down.";
	P << "\nThe yellow light means slow down.";
	Delay();
	O << "\nThe red light means stop.";
	P << "\nThe red light means stop.";
	Delay();
	O << "\nThe arrows mean you can or can't go depending on the colour";
	P << "\nThe arrows mean you can or can't go depending on the colour";

	return 0;
}

void Delay()
{
	int i;

	for(i=0; i >=1000000; i++);

}
