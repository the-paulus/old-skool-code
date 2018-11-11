//Paul Lyon

#include<iostream.h>
#include<fstream.h>
#include<string.h>
#define PRINT_IT ofstream prn("PRN")
PRINT_IT;

ifstream INFILE;
ofstream OUTFILE;
char student_name[25];

int main()
{

	OUTFILE.open("OUT.DAT",ios::out);

	if (OUTFILE)
	{
		do
		{
			cout << "\nEnter a student's name and type 'END' when done: ";
			prn << "\nEnter a student's name and type 'END' when done: ";
			cin.get(student_name,25);
			cin.ignore(80,'\n');
			prn << student_name;

			if(strcmp(student_name,"END")!=0)
			{
				OUTFILE << student_name << endl;
			}
		}while(strcmp(student_name,"END") != 0);
	}
	else
	{
		cout << "\n***************ERROR************";
		cout << "\nConnot open specified file!";
		prn << "\n***************ERROR************";
		prn << "\nConnot open specified file!";
		return 0;
	}

	OUTFILE.close();

	INFILE.open("OUT.DAT",ios::in);

	if (INFILE)
	{
		cout << "\nThe names contained in the file are as followed: ";
		prn << "\nThe names contained in the file are as followed: ";

		do
		{
			INFILE.get(student_name,25);
			INFILE.ignore(80,'\n');

			if(!INFILE.eof())
			{
				cout << '\n' << student_name;
				prn << '\n' << student_name;
			}
		}while(!INFILE.eof());
	}
	else
	{
		cout << "\n***************ERROR************";
		cout << "\nConnot open specified file!";
		prn << "\n***************ERROR************";
		prn << "\nConnot open specified file!";

		return 0;
	}

	INFILE.close();

	OUTFILE.open("OUT.DAT",ios::app);

	if(OUTFILE)
	{
		do
		{
			cout << "\nDo you need to enter any more students? (END if not): ";
			prn << "\nDo you need to enter any more students? (END if not): ";
			cin.get(student_name, 25);
			cin.ignore(80,'\n');
			prn << student_name;

			if(strcmp(student_name,"END") != 0)
			{
				continue;
			}
			else
			{
				break;
			}
		}while(strcmp(student_name,"END") != 0);
	}
	else
	{
		cout << "\n***************ERROR************";
		cout << "\nConnot open specified file!";
		prn << "\n***************ERROR************";
		prn << "\nConnot open specified file!";

		return 0;
	}

	OUTFILE.close();

	INFILE.open("OUT.DAT",ios::in);

	if(INFILE)
	{
		do
		{
			INFILE.get(student_name,25);
			INFILE.ignore(80,'\n');

			if(!INFILE.eof())
			{
				cout << student_name << endl;
				prn << student_name << endl;
			}
		}while(!INFILE.eof());
	}
	else
	{
		cout << "\n***************ERROR************";
		cout << "\nConnot open specified file!";
		prn << "\n***************ERROR************";
		prn << "\nConnot open specified file!";

		return 0;
	}

	INFILE.close();

	return 0;
}
	

		