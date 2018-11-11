//Paul Lyon
//WORDPLAY.cpp

#include <iostream.h>
#include <fstream.h>
#define O cout
#define I cin
#define P prn
#define PRINT_IT of stream prn("PRN")
PRINT_IT;

int main()
{
	char my_word[5] = "Book";

	O << my_word << '\n';
	P << my_word << '\n';

	my_word[3] = 't';

	O << my_word << '\n';
	P << my_word << '\n';

	return 0;
}