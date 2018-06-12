#include<iostream.h>
#include<fstream.h>
#include<string.h>

ofstream OUTFILE;
ifstream INFILE;
char StudentName[25], ch;
int main()
{
	OUTFILE.open("OUT.DAT",ios::out);

	do
	{
		cout << "\nEnter student's name and hit 'END' when finished: ";
		cin.get(StudentName,25);
		cin.ignore(80,'\n');

		OUTFILE << StudentName << '\n';
	}while(strcmp(StudentName,"END")==true);

	OUTFILE.close();

	
	INFILE.open("OUT.DAT",ios::in);
	INFILE.unsetf(ios::skipws);

	while(!INFILE.eof())
	{
		INFILE >> StudentName;
		if(!INFILE.eof())
		{
			cout << StudentName << endl;
		}
	}
	
	INFILE.close();
	OUTFILE.open("OUT.DAT",ios::app);
	cout << "\nEnter one more student: ";
	cin.get(StudentName,25);
	cin.ignore(80,'\n');
	OUTFILE << StudentName << '\n';
	OUTFILE.close();

	INFILE.open("OUT.DAT",ios::in);

	while(!INFILE.eof())
	{
		INFILE >> StudentName;
		cout << StudentName << '\n';
	}

	INFILE.close();
	
	return 0;
}