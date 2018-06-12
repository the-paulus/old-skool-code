#include<string.h>
#include<time.h>
#include<stdio.h>
#include <afx.h>
#include<winbase.h>

/*typedef struct _SYSTEMTIME 
{  
	WORD wYear;     
	WORD wMonth; 
    WORD wDayOfWeek;     
	WORD wDay;     
	WORD wHour;     
	WORD wMinute; 
    WORD wSecond;     
	WORD wMilliseconds; 
} SYSTEMTIME;*/
 
int main()
{
	_SYSTEMTIME *t;
	printf(GetSystemTime(*t));

	return 0;
}
