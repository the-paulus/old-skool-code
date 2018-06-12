//Paul Lyon

#include<iostream.h>
#include<fstream.h>
#include<string.h>

int main()
{
	ofstream OUTFILE;
	ifstream INFILE;
	char StudentName[25];
	char ch;
	

	OUTFILE.open("TEMP.DAT",ios::out);
		
	cout << "\nType 'end' when done.";

	do 
	{
		cout << "\nEnter a student's name: ";
		cin.get(StudentName,25);
		cin.ignore(80,'\n');
		if (strcmp(StudentName,"end")==1)
		{
			OUTFILE.close();
			INFILE.open("TEMP.DAT",ios::in);
			INFILE.unsetf(ios::skipws);
			goto OUTLOOP;
		}
		
			OUTFILE << StudentName;
	} 
OUTLOOP:
		
	
	

	while(!INFILE.eof()); 
	{
		
		INFILE >> ch;
		cout << ch;
	}

	INFILE.close();

	OUTFILE.open("TEMP.DAT",ios::app);

	cout << "\nEnter one more name: ";
	cin.get(StudentName,25);
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