//Paul Lyon
//Project 11-4
//pjc11-4.cpp

#include<iostream.h>
#include<fstream.h>
#include<ctype.h>
#define PRINT_IT ofstream prn("PRN")
PRINT_IT;

int main()
{
  int spctr, i, j, k;
  bool isAspace, isup;
  char fullname[40];
  char lastfirstmid[40];

  cout << "\nEnter your FULL name (First, Middle and Last): ";
  cin.get(fullname,40);
  cin.ignore(80,'\n');

  ////////////Variable Assignning//////////

  spctr = 0;
  i = 0;
  isup = isupper(fullname[0]);
  j = 0;
  k = 0;

  //////////////End of Assignning/////////

  /////////////Capitializing///////////

  if (isupper(fullname[0]) == 0)
    {
      fullname[0] = fullname[0] - 32;
    }

  do
    {

      isAspace = isspace(fullname[i]);

      if (isAspace == 1)
	{
	  
	  if ((isAspace == 1) && (spctr == 1))
	    {
	      for(j = 0; j = i + 1; j++)
		{
		  lastfirstmid[j] = fullname[i];
		}
	    }
	  
	  if ((isAspace == 1) && (spctr == 2))
	    {
	      lastfirstmid[j++] = 'n';
	      lastfirstmid[j++] = ' ';
	  i++;
	  spctr++;

	  fullname[i] = fullname[i] - 32;



