#include <stdio.h>
#include <conio.h>
#include <process.h>

void main()
{   
   char *args[4], prog[80];
   int ch;   
   
   printf( "Enter name of program to exec: " );   
   gets( prog );

   _execl( prog, prog, "_execl", "two", NULL );

   
}