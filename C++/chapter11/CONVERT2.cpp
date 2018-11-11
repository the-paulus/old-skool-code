#include<fstream.h>  
#include<iostream.h>

int main()
{
 char inputfile[50], outputfile[50], ch;            
 ifstream infile;    
 ofstream outfile;   

cout << "\nEnter the path of the input file: ";
cin.get(inputfile,50);
cin.ignore(80,'\n');

cout << "\nEnter the path of the output file: ";
cin.get(outputfile,50);
cin.ignore(80,'\n')

 infile.open(inputfile,ios::in);   
 outfile.open(outputfile,ios::out); 

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
     outfile << ch;     
    }
  }

 infile.close();  
 outfile.close(); 

 return 0;

}
Mark set
End of buffer
