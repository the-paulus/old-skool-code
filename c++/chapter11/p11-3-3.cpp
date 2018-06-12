//Paul Lyon
//Problem 11.3.3
//p11-3-3.cpp

#include <iostream.h>
#include <fstream.h>
#define PRINT_IT ofstream prn("PRN")
PRINT_IT;

char INLO[40], OLO[40], ch;
int YN;
ifstream INFILE;
ofstream OUTFILE;
void LU_CON(ifstream INFILE, ofstream OUTFILE);

int main()
{
	cout << "\nEnter the path of the file that you want edited: ";
	prn << "\nEnter the path of the file that you want edited: ";
	cin.get(INLO,40);
	cin.ignore(80,'\n');
	prn << INLO;

	cout << "\nEnter the path of the file that you want the edited file to be written to: ";
	prn << "\nEnter the path of the file that you want the edited file to be written to: ";
	cin.get(OLO,40);
	cin.ignore(80,'\n');
	prn << OLO;

	cout << "\nDo you want the output file appened to? ((1)Yes (2)No): ";
	prn << "\nDo you want the output file appened to? ((1)Yes (2)No): ";
	cin >> YN;
	prn << YN;

	if (YN == 1)
	{
		INFILE.open(INLO,ios::in);
		OUTFILE.open(OLO,ios::app);
		if ((!INFILE) || (!OUTFILE))
		{
			cout << "\nError opening file, please check the file agian.";
			prn << "\nError opening file, please check the file agian.";
			return 0;
		}
		else
		{
			LU_CON(INFILE, OUTFILE);
		}
	}
	else
	{
		INFILE.open(INLO,ios::in);
		OUTFILE.open(OLO,ios::out);
		if ((!INFILE) || (!OUTFILE))
		{
			cout << "\nError opening file, please check the file agian.";
			prn << "\nError opening file, please check the file agian.";
			return 0;
		}
		else
		{
			LU_CON(INFILE, OUTFILE);
		}
	}

	return 0;
}

void LU_CON(ifstream INFILE, ofstream OUTFILE)
{
	INFILE.unsetf(ios::skipws); 
	while (!INFILE.eof())  
	{
		INFILE >> ch;        
		if (!INFILE.eof())
		{
			if ((ch > 96) && (ch < 123))  
			{                            
				ch = ch - 32;
			}
			OUTFILE << ch;     
		}
	}
}