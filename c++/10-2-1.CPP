//Paul Lyon
//10-2-1.cpp

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
	char alphabet[27] = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	int i=0;

	
	do
	{
		alphabet[i] = CLow(alphabet[i]);
		O << alphabet << '\n';
		

		i++;
	} while (i != 26);

	return 0;
}


//Convert from uppercase to lower case function
char CLow(char ch)
{
	ch = ch + 32;
	return ch;
}