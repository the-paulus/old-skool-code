//Paul Lyon
//Exercise 11-5
//e11-5.cpp

#include<iostream.h>
#include<fstream.h>

int main()
{
char username[25];
int age;
ofstream FILE;

cout << "\nEnter your name: ";
cin.get(username,25);
cin.ignore(80,'\n');

cout << "\nEnter your age: ";
cin >> age;

FILE.open("NAMEAGE.DAT",ios::app);

if (FILE)
{
FILE << username << endl;
FILE << age << endl;
FILE.close();
{
else
{
cout << "\nError opening file! Check the path of that file.";
}
return 0;
}
Command attempted to use minibuffer while in minibuffer
