//Paul Lyon
//exercise 11-1
//e11-1.cpp

#include<iostream.h>
#include<fstream.h>
#define PRINT_IT ofstream prn("PRN")
PRINT_IT;

int main()
{
	char username[25];
	int age;
	ofstream FILE;

	cout << "\nEnter your name: ";
	prn << "\nEnter your name: ";
	cin.get(username,25);
	cin.ignore(80,'\n');
	prn << username;

	cout << "\nEnter your age: ";
	prn << "\nEnter your age: ";
	cin >> age;
	prn << age;

	FILE.open("NAMEAGE.TXT",ios::out);

	if (FILE)
	{
		FILE << username << endl;
		FILE << age << endl;
		FILE.close();
	}
	else
	{
		cout << "\nAn error occured.. The most likely problem is that your using Windows.";
		prn << "\nAn error occured.. The most likely problem is that your using Windows.";
	}

	return 0;

}
