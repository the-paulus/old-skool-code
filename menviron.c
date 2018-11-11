#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <unistd.h>

extern char *environ;

int main(int argc, char **argv[])
{
   printf("\n----------------------------");
   printf("\n-   Environment Variables  -");
   printf("\n----------------------------");
   
   printf("\nUSER == %s", (const char*)getenv("USER"));
   printf("\nLOGNAME == %s", (const char*)getenv("LOGNAME"));
   printf("\nHOME == %s", (const char*)getenv("HOME"));
   printf("\nLANG == %s", (const char*)getenv("LANG"));
   printf("\nPATH == %s", (const char*)getenv("PATH"));
   printf("\nPWD == %s", (const char*)getenv("PWD"));
   printf("\nSHELL == %s", (const char*)getenv("SHELL"));
   printf("\nTERM == %s", (const char*)getenv("TERM"));
   printf("\nPAGER == %s", (const char*)getenv("PAGER"));
   printf("\nEDITOR == %s\n", (const char*)getenv("EDITOR"));
   printf("JDKHOME == %s", (const char*)getenv("JDKHOME"));
   return 0;
}
