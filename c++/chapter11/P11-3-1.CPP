//Problem 11.2.1
//p11-3-1.cpp

#include<iostream.h>
#include<fstream.h>
#define PRINT_IT ofstream prn("PRN")
PRINT_IT;

int main()
{
char Name[20], stadd[30], city[20], state[20];
int zip;
ofstream FILE;

FILE.open("Address.dat",ios::app);

if (FILE)
{
cout << "\nEnter your..";
cout << "\nName: ";
prn << "\nEnter your..";
prn << "\nName: ";
cin.get(Name,20);
cin.ignore(80,'\n');
prn << Name;

cout << "\nStreet address: ";
prn << "\nStreet address: ";
cin.get(stadd,30);
cin.ignore(80,'\n');
prn << stadd;

cout << "\nCity: ";
prn << "\nCity: ";
cin.get(city,20);
cin.ignore(80,'\n');
prn << city;

cout << "\nState: ";
prn << "\nState: ";
cin.get(state,20);
cin.ignore(80,'\n');
prn << state;

cout << "\nZip code: ";
cin >> zip;
prn << "\nZip code: ";
prn << zip;

FILE << Name << endl << stadd << endl << city << ", " << state << zip;
}
else
{
cout << "\nError opening file! Please make sure the correct path of the file is specified.";
prn << "\nError opening file! Please make sure the correct path of the file is specified.";
return 0;
}

FILE.close();

return 0;
}

