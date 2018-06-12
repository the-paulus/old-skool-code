//Paul Lyon
//Chapter 11 Programming Test
//ch11ptest.cpp

#include<iostream.h>
#include<fstream.h>

int main()
{
	ofstream OUTFILE;
	ifstream INFILE;

	OUTFILE.open("TEMP.DAT",ios::out);

	char student_name[25], ch;

	while(student_name[0] != '0') 
	{
		cout << "\nEnter a student name, when finished hit '0': ";
		cin.get(student_name,25);
		cin.ignore(80,'\n');
		OUTFILE << student_name << endl;
	}

	OUTFILE.close();

	INFILE.open("TEMP.DAT",ios::in);

	do while(!INFILE.eof())
	{
		INFILE >> ch;
		cout << ch;

		if (INFILE.eof())
		{
			INFILE.close();
		}
	}

	
	
	//OUTFILE.open("TEMP.DAT",ios::ap);

	cout << "\nEnter another name: ";
	cin.get(student_name,25);
	cin.ignore(80,'\n');

	OUTFILE.close();
	INFILE.open("TEMP.DAT",ios::in);

	while(!INFILE.eof())
	{
		INFILE >> ch;
		cout << ch;
	}

	INFILE.close();

	return 0;
}
