//Paul Lyon
//ecercise 11-6
//e11-6.cpp

#include<fstream.h>  
#include<iostream.h>
#include<iomanip.h>  
#define PRINT_IT ofstream prn("PRN")
PRINT_IT;

int main()
{
 float x;            
 ifstream infile;    

 infile.open("FLOATS.TXT",ios::in);  

 if (infile) 
  {           
  cout << "The prices in the file are: \n" << setprecision(2);
prn << "The prices in the file are: \n" << setprecision(2);
  do  
  {
     infile >> x;          
     if (!infile.eof())
      {                    
       cout << x << endl; 
	   prn << x << endl;
      }
   } while (!infile.eof());
  }
 else          
  {
   cout << "Error opening file. Please switch to Linux.\n";
   prn << "Error opening file. Please switch to Linux.\n";
  }

 infile.close();
  
 return 0;
}


