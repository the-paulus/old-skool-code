//Paul Lyon
//Project 13-2
//P13-2.cpp

#include<iostream.h>
#include<fstream.h>
#include<string.h>
#define PRINT_IT ofstream prn("PRN")
PRINT_IT;

char StringCAT(char *S1, char *S2);
char *Rtrn;
int main()
{
	char STRING1[20];
	char STRING2[20];
	
	//as and get input for STRIN1
	cout << "\nEnter a string: ";
	prn << "\nEnter a string: ";
	cin.get(STRING1,20);
	cin.ignore(80,'\n');
	prn << STRING1;

	//ask and get input for STRING2
	cout << "\nEnter another string: ";
	cin.get(STRING2,20);
	cin.ignore(80,'\n');
	prn << "\nEnter another string: ";
	prn << STRING2;

	//Combine strings into Rtrn
	StringCAT(STRING1,STRING2);
    
	//Displays resualts
	cout << "\nThe combined string is " << Rtrn;
	prn << "\nThe combined string is " << Rtrn;

	//exits
	return 0;
}

char StringCAT(char *S1, char *S2)
{
	int inS;	//string counter
	int rsout=0;	//Rtrn counter
	Rtrn = new char[];	//create new character array named Rtrn
	char ch;	//character holder
	
	
	for(inS=0; inS<20;inS++)	//string 1
	{
		ch = S1[inS];	//assigns ch the element of S1[]
		if(ch == '\0')	//breaks if null zero
		{
			break;
		}
		Rtrn[rsout] = (char)ch;	//Rtrn is assigned the character to element [rsout]
		rsout++;	//add 1
	}

	for(inS=0;inS<20;inS++)		//string 2
	{
		ch = S2[inS];	//assigns ch the element of S2[]
		if(ch == '\0')
		{
			break;
		}
		Rtrn[rsout] = (char)ch;
		rsout++;	//add 1
	}
	
	return(*Rtrn);	//retrun resault
}