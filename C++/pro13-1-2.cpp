//Paul Lyon
//problem 13.1.2
//pro13-1-2.cpp

#include<iostream.h>
#include<fstream.h>
#define PRINT_IT ofstream prn("PRN")
PRINT_IT;

char strcp(char *string1, char *string2);

int main()
{
char s1[5] = "ABCD", s2[5];

strcp(s2,s1);

 cout << '\n' << s2;
 //prn << '\n' << s2;
return 0;

}

char strcp(char *string1, char *string2)
{
int i=0;
while(string2[i] != '\0')
  {
string1[i] = string2[i];
i++;
  }
return *string2;
}
