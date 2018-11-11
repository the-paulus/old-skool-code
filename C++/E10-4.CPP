//Paul Lyon
//e10-4.cpp

#include <iostream.h>
#include <fstream.h>
#define O cout
#define I cin
#define P prn
#define PRINT_IT ofstream prn("PRN")
PRINT_IT;

int main()
{
	char my_word[5] = "book";

	O << my_word << '\n\';
	P<< my_word << '\n\';

	my_word[3]
