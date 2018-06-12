#include<iostream.h>
#include<fstream.h>
#include<ctype.h>
#include<string.h>
#define PRINT_IT ofstream prn("PRN")
PRINT_IT;

int main()
{
	char FULL[60], F[20], M[20], L[20], ch;
	ofstream Ofull, Osfull;
	ifstream Ifull, Isfull;
	int len, ctr=0;

	//Get User's FULL name
	cout << "\nEnter your full name: ";
	prn <<  "\nEnter your full name: ";
	cin.get(FULL,60);
	cin.ignore(80,'\n');
	prn << FULL;
	len = strlen(FULL);

	//Opens files for input/output
	Ofull.open("FULL.DAT",ios::out); //Holds the FULL name
	Ifull.open("FULL.DAT",ios::in);  //Holds the FULL name for ch
	Osfull.open("FULLS.DAT",ios::out); //Holds the FULL name w/'\n'
	Isfull.open("FULLS.DAT",ios::in);  //Holds the FULL name for output

	Ofull << FULL;
	Ofull.close();
	
	Ifull.unsetf(ios::skipws);
	
	do
	{
		Ifull >> ch;
		
		
		if (ch == ' ')
		{
			Osfull << '\n';
		}
		if (ch != ' ')
		{
			Osfull << ch;
		}
		ctr++;
	}while(len != ctr);
	Osfull.close();

	Isfull >> F;
	Isfull >> M;
	Isfull >> L;

	F[0]=toupper(F[0]);
	M[0]=toupper(M[0]);
	L[0]=toupper(L[0]);

	cout << L << ", " << F << ' ' << M;
	prn << '\n' << L << ", " << F << ' ' << M;

	return 0;
}