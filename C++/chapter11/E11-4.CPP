//Paul Lyon
//exercise 11-4
//e11-4.cpp

#include<fstream.h>  
#include<iostream.h>
#include<stdlib.h>  
#define PRINT_IT ofstream prn("PRN")
PRINT_IT;

int main()
{
 char user_name[25];
 char user_age[4];
 int age;
 ifstream infile;    

 infile.open("NAMEAGE.TXT",ios::in);  

 if (infile)  
  {         

   infile.get(user_name,25); 
   infile.ignore(80,'\n');
   infile.get(user_age,4);   
   infile.ignore(80,'\n');
   age = atoi(user_age);
   cout << "The name read from the file is " << user_name << ".\n";
   prn << "The name read from the file is " << user_name << ".\n";
   cout << "The age read from the file is " << age << ".\n";
   prn << "The age read from the file is " << age << ".\n";

  }

 else          

  {
   cout << "Error opening file! Check to see if that is the correct path of the file.\n";
   prn << "Error opening file! Check to see if that is the correct path of the file.\n";
  }

 infile.close(); 

 return 0;
}



