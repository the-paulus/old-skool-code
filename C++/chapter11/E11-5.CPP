//Paul Lyon
//Exercise 11-5
//e11-5.cpp

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

FILE.open("NAMEAGE.DAT",ios::app);

if (FILE)
{
FILE << username << endl;
FILE << age << endl;
FILE.close();
}
else
{
cout << "\nError opening file! Check the path of that file.";
prn << "\nError opening file! Check the path of that file."; 
}
return 0;
}

