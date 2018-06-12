//Paul Lyon
//problem 11.3.2
//p11-3-2.cpp

#include<iostream.h>
#include<fstream.h>
#define PRINT_IT ofstream prn("PRN")
PRINT_IT;

char Name[20], address[40], city[20], state[20], zip[10];

int main()
{
ifstream FILE;

FILE.open("Address.dat",ios::in);

if (FILE)
{
FILE.get(Name, 20);
FILE.ignore(80,'\n');
FILE.get(address, 40);
FILE.ignore(80, '\n');
FILE.get(city, 20);
FILE.ignore(80, '\n');
FILE.get(state, 20);
FILE.ignore(80, '\n');
FILE.get(zip, 10);

cout << Name << '\n' << address << '\n' << city << ", " << state << ' ' << zip;
prn << Name << '\n' << address << '\n' << city << ", " << state << ' ' << zip;
}
else
{
cout << "\nError opening file. Check the file path and try again";
prn << "\nError opening file. Check the file path and try again";
return 0;
}

return 0;
}
