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
	int Answer;
	/////////////////First Question/////////////////
	O << "\nLinux is better than Windows.";
	P << "\nLinux is better than Windows.";
	O << "\n(1)True or (2)False? ";
	P << "\n(1)True or (2)False? ";
	I >> Answer;
	P << Answer;

	if (Answer == 1) 
	{
			O << "\nHey good job... What are you waiting for?! Get Linux now!";
			P << "\nHey good job... What are you waiting for?! Get Linux now!";
	}
	
	else
	{	
			O << "\nI see that Windows has corrupted your mind... Get Linux the best medicine!"; 
			P << "\nI see that Windows has corrupted your mind... Get Linux the best medicine!"; 
	}
	
	
	/////////////////Second Question/////////////////
	O << "\nNovell has better security than Linux.";
	P << "\nNovell has better security than Linux.";
	O << "\n(1)True or (2)False? ";
	P << "\n(1)True or (2)False? ";
	I >> Answer;
	P << Answer;

	if (Answer == 2)
	{
		O << "\nHey good job... What are you waiting for?! Get Linux now!";
		P << "\nHey good job... What are you waiting for?! Get Linux now!";
	}
	else
	{
		O << "\nI see that Windows has corrupted your mind... Get Linux the best medicine!";
		P << "\nI see that Windows has corrupted your mind... Get Linux the best medicine!";
	}
	/////////////////Third Question/////////////////
	O << "\nBill Gates has to much money.";
	P << "\nBill Gates has to much money.";
	O << "\n(1)True or (2)False? ";
	P << "\n(1)True or (2)False? ";
	I >> Answer;
	P << Answer;

	if (Answer == 1)
	{
		O << "\nHey good job... What are you waiting for?! Get Linux now!";
		P << "\nHey good job... What are you waiting for?! Get Linux now!";
	}
	else
	{
		O << "\nI see that Windows has corrupted your mind... Get Linux the best medicine!";
		P << "\nI see that Windows has corrupted your mind... Get Linux the best medicine!";
	}
	

	return 0;
}