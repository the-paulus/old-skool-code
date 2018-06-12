//Paul Lyon
//8-3.cpp

#include <iostream.h>
#include <fstream.h>
#define O cout
#define I cin
#define P prn
#define PRINT_IT ofstream prn("PRN")
PRINT_IT;

int main()
{
	int i = 50, YesNo, HL;

	O << "\n(1)Yes (2)No";
	O << "\nPick a number between 1 and 100.";
	O << "\nIs 50 the number you're thinking of? ";
	I >> YesNo;

	P << "\n(1)Yes (2)No";
	P << "\nPick a number between 1 and 100.";
	P << "\nIs 50 the number you're thinking of? ";
	P << YesNo;


	//if the number is 50
	if (YesNo == 1)				
	{
		O << "\nYay! I'm Good!";
		P << "\nYay! I'm Good!";
	}

	//if the number is not 50 ask if its higher or lower.
	else						    
	{
		O << "\n(1) Higher (2) Lower";
		O << "\nIs it Higher or lower? ";
		I >> HL;

		P << "\n(1) Higher (2) Lower";
		P << "\nIs it Higher or lower? ";
		P << HL;

		//clears YesNo
		YesNo = 0; 

		//if the number is higher then increase the number by 1 everytime its wrong
		if (HL == 1)			  
		{
			do
			{
				++i;
				O << "\nIs the number " << i << "?";
				I >> YesNo;

				P << "\nIs the number " << i << "?";
				P << YesNo;

			} 
			while (YesNo == 2);

			//if its right
			if (YesNo == 1)
			{
				O << "\nYay! I'm Good!";
				P << "\nYay! I'm Good!";
			}
		}

		//if the number is lower than 50 it is decreased by 1 until it gets it right
		else
		{
			do
			{
				--i;
				O << "\nIs the number " << i << "?";
				I >> YesNo;

				P << "\nIs the number " << i << "?";
				P << YesNo;

			}while (YesNo == 2);

			if (YesNo == 1)
			{
				O << "\nYay! I'm good!";
				P << "\nYay! I'm good!";
			}
		}
		}
	

	return 0;
}
