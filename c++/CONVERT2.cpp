//Paul Lyon
//Project 11-1
//p11-1.cpp

#include<iostream.h>
#include<fstream.h>

int main()
{
char ch, filein[40], newfile[40];
ifstream IN;
ofstream OUT;

 cout << "\nEnter the path of the file that you want edited: ";
cin.get(filein,40);
cin.ignore(80,'\n');

 cout << "\nEnter the path of the file that will contain the edited file: ";
cin.get(newfile,40);
cin.ignore(80,'\n');

 IN.open(filein,ios::in);
 OUT.open(newfile,ios::out);

if ((IN) || (OUT))
  {
    OUT << IN;
  }
else
  {
    cout << "\nError opening file! Make sure the correct path was entered.";
return 0;
  }

OUT.close();
IN.close();

return 0;

}
