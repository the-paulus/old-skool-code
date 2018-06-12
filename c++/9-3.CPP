//Paul Lyon
//9-3.cpp

#include <iostream.h>
#include <fstream.h>
#include <math.h>
#define O cout
#define I cin
#define P prn
#define PRINT_IT ofstream prn("PRN")
PRINT_IT;

int main()
{
	char Input[3];
	int cost;

	do
	{
#include <c:\mydocu~1\cpp\9-3menu.cpp>
		I.get(Input, 3);
		
		switch(Input)
		{
		case 'S':
			cost = cost + 2;
			break;
		case C:
			cost = cost + 1;
			break;
		case B:
			cost = cost + 1;
			break;
		case R:
			cost = cost + 1;
			break;
		case L:
			cost = cost + 2;
			break;
		case X:
			cost = 0;
			break;
		case T:
			O << "\nThe total is $" << cost;
			break;
		}
	} while (Input != 'T');

	return 0;
}