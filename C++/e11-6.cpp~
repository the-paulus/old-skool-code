//Paul Lyon
//ecercise 11-6
//e11-6.cpp

#include<fstream.h>  
#include<iostream.h>
#include<iomanip.h>  

int main()
{
 float x;            
 ifstream infile;    

 infile.open("PRICES.DAT",ios::in);  

 if (infile) 
  {           
  cout << "The prices in the file are: \n" << setprecision(2);

  do  // Loop while not the end of the file.
   {
     infile >> x;          
     if (!infile.eof())
      {                    
       cout << x << endl;  
      }
   } while (!infile.eof());
  }
 else          
  {
   cout << "Error opening file. Please switch to Linux.\n";
  }

 infile.close();
  
 return 0;
}


