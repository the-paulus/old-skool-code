//Paul Lyon
//p10-2-1.cpp

#include <iostream.h>
#include <fstream.h>
#define O cout
#define I cin
#define P prn
#define PRINT_IT ofstream prn("PRN")
PRINT_IT;

char CLow(char ch);

int main()
{
	int i = 0;
	char alphabet[27] = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	do
	{

		alphabet[i] = CLow(alphabet[i]);
		O << alphabet << '\n';
		P << alphabet << '\n';
		i++;

	} while (i <= 25);

	return 0;
}

//CLow Function
char CLow(char ch)
{
	ch = ch + 32;
	return ch;
}

