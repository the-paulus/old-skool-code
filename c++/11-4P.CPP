//Paul Lyon
//Project 11-4
//11-4p.cpp

#include<iostream.h>
#include<fstream.h>
#include<ctype.h>
#define PRINT_IT ofstream prn("PRN")
PRINT_IT;

int spctr;
bool isAspace, isup;
char fullname[30], first[10], middle[10], last[10], ch;

int main()
{
  cout << "\nEnter your fullname: ";
cin.get(fullname,30);
cin.ignore(80,'\n');

do
  {
    fullname[i] >> firstname[i];
    i++;
  }while(fullname[i] != ' ');
do
  {
i++;
    fullname[i] >> middlename[j];
j++;
  }while(fullname != ' ');
do
  {
i++;
    fullname[i] >> lastname[k];
k++;
  }while(fullname[i] != '/0')

     cout << lastname << ", " << firstname << middlename;
