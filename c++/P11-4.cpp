//Paul Lyon
//project 11-4
//p11-4.cpp

#include<iostream.h>
#include<fstream.h>
#include<ctype.h>

int i = 0, sctr = 0, j = 0;
bool is;
char fullname[40];

int main()
{                                           

  cout << "\nEnter your FULL name: ";
  cin.get(fullname,40);
  cin.ignore(80, '\n');

  fullname[0] = fullname[0] - 32;

  do
  {                                       
    
    is = isspace(fullname[i]);
    
    if (is == 1)
    {
      sctr++;
      i++;
      fullname[i] = fullname[i] - 32;

      if (sctr == 1)
      {
        for(j = 0; j = i; j++)
        {
          cout << fullname[j] << ", " << fullname[i - j];
        }
      }
    }
  i++
  }
  return 0;
}


