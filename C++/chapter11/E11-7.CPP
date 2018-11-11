//Paul Lyon
//Exercise 11-7
//e11-7.cpp

#include<fstream.h>  
#include<iostream.h>
#define PRINT_IT ofstream prn("PRN")
PRINT_IT;

int main()
{
 char ch;            
 ifstream infile;    
 ofstream outfile;   

 infile.open("LOWER.TXT",ios::in);   
 outfile.open("UPPER.TXT",ios::out); 

 if ((!infile) || (!outfile))  
  {                            
    cout << "Error opening file.\n";
    return 0;
  }

 infile.unsetf(ios::skipws); 

 while (!infile.eof())  
  {
   infile >> ch;        
   if (!infile.eof())
    {
     if ((ch > 96) && (ch < 123))  
      {                            
       ch = ch - 32;
      }
	 cout << ch;
	 prn << ch;
     outfile << ch;     
    }
  }

 infile.close();  
 outfile.close(); 

 return 0;

}
