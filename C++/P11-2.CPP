//Paul Lyon
//Project 11-2
//p11-2.cpp

#include<iostream.h>
#include<fstream.h>

int main()
{
char ch,PATH;
int length;

ifstream FILE;

cout << "\nEnter a file path so I can count its characters: ";
cin.get(PATH,50);
cin.ignore(80,'\n');

if (FILE)
{
FILE >> ch;

length = strlen(ch);

cout << "\nThe length of " << PATH << " is " << length;
}
else
{
cout << "\nError opening file! Check the path and try again.";
return 0;
}
return 0;