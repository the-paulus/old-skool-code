#include<windows.h>
int SetDateTime( int nYear, int nMonth, int nDay, int nHour, int nMin, int nSec );
bool main()
{
	SetDateTime( 2000, 1, 1, 0, 00, 00);
	return false;
}