//Paul Lyon
//Problem 13.1.2
//pro13-1-2.cpp

#include<iostream.h>
#include<fstream.h>

char stringcopy(char str1, char str2);

int main()
{
char s1[5] = "ABCD";
char s2[];

stringcopy(s2,s1);

 cout << '\n' << s2;

return 0;
}

char stringcopy(char str1, char str2)
{
int countlength = 0;

while(str1[countlength] != '\0')
  {
str1[countlength] = str2[countlength];
countlength++;
  }
return str2;
}
