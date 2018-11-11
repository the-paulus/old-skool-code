#include<iostream.h>
#include<string.h>
#include<fstream.h>
#define PRINT_IT ofstream prn("PRN")
PRINT_IT;

int main()
{
  char string1[51];
  char string2[51];

  cout << "You will be asked to enter two strings. The program will then\n";
  prn << "You will be asked to enter two strings. The program will then\n";

  cout << "compare the strings to see if they are the same.\n\n";
 prn << "compare the strings to see if they are the same.\n\n";
  
cout << "Enter string 1: ";
 prn << "Enter string 1: ";

  cin.get(string1,50);
  cin.ignore(80, '\n');
  prn << string1;

  cout << "Enter string 2: ";
  prn << "Enter string 2: ";  

cin.get(string2,50);
  cin.ignore(80,'\n');
  prn << string2;

  if (!strcmp(string1, string2))
   {
    cout << "The strings are the same.\n";
    prn << "The strings are the same.\n";
   }
  else
   {
    cout << "The strings are different.\n";
    prn << "The strings are different.\n";
   }
  return 0;
}
