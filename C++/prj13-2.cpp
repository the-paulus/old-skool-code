#include<iostream.h>
#include<fstream.h>
#include<string.h>

void StringCAT(char *S1, char *S2);
char *Rtrn;
int main()
{
	char STRING1[20];
	char STRING2[20];
	
	cout << "\nEnter a string: ";
	cin.get(STRING1,20);
	cin.ignore(80,'\n');

	cout << "\nEnter another string: ";
	cin.get(STRING2,20);
	cin.ignore(80,'\n');

	StringCAT(STRING1,STRING2);
    cout<<&Rtrn<<endl;
	return 0;
}

void StringCAT(char *S1, char *S2)
{
	int stringlength = strlen(S1) + strlen(S2) ;	//add 1 for '\0'
	int inS, rsout=0;
	Rtrn = new char[stringlength];
	char ch;
	
	do
	{
		ch = (char)S1[inS];
		Rtrn[rsout] = (char)ch;
		rsout++;
		inS++;
	}while(ch != '\0');
	
	inS=0;
	do
	{
		ch=(char)S2[inS];
		Rtrn[rsout]=(char)ch;
		rsout++;
		inS++;
	}while(ch != '\0');

	
	cout << Rtrn;
}