#include<iostream.h>
#include<winuser.h>

int main( void )
{
	WM_GETTEXT wParam = (WPARAM) 128;
	WM_GETTEXT lParam = (LPARAM) FFFD961B;
	cout << WM_GETTEXT;
	return 0;
}