//Paul Lyon
//problem 11.3.2
//p11-3-2.cpp

#include<iostream.h>
#include<fstream.h>

int main()
{
ifstream FILE

FILE.open("Address.dat",ios::in);

if (FILE)
{
cout << FILE;
}
else
{
cout << "\nError opening file. Check the file path and try again";
return 0;
}

return 0;
}
