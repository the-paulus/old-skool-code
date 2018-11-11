
#include<iostream.h>
#include<fstream.h>

int main()
{
char Name[20], stadd[30], city[20], state[20];
int zip.
ofstream FILE;

FILE.open("Address.dat",ios::app);

if (FILE)
{
cout << "\nEnter your..";
cout << "\nName: ";
cin.get(Name,20);
cin.ignore(80,'\n');

cout << "\nStreet address: ";
cin.get(stadd,30);
cin.ignore(80,'\n');

cout << "\nCity: ";
cin.get(city,20);
cin.ignore(80,'\n');

cout << "\nState: ";
cin.get(state,20);
cin.ignore(80,'\n');

cout << "\nZip code: ";
cin >> zip;

FILE << Name << endl << stadd << endl << city << ", " << state << zip;
}
else
{
cout << "\nError opening file! Please make sure the correct path of the file is specified.";
return 0;
}

FILE.close();

return 0;
}

Mark set
Canceled
Minibuffer window is not active
Minibuffer window is not active
