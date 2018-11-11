//Paul Lyon
//Exercise 13-4
//e13-4.cpp

#include<iostream.h>
#include<string.h>

int main()
{
char first[15], last[20], full[35];

 cout << "\nEnter your first name: ";
cin.get(first,14);
cin.ignore(80,'\n');
 cout << "\nEnter your last name: ";
cin.get(last,14);
cin.ignore(80,'\n');

strcpy(full,first);
strcat(full," ");
strcat(full,last);

 cout << "\nYour full name is " << full << ".\n";

return 0;
}
