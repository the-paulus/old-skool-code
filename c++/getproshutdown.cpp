#include <winbase.h>
#include <iostream.h>

int main()
{

	cout << "are you sure you want to shutdown? ";
	cin >> int YN;

	if (YN == 1)
	{
		GetProcessShutdownParameters(SHUTDOWN_NORETRY);
	}
	else
	{
		return 0;
	}

	return 0;
}
	