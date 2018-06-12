#include <stdio.h>
#include <stdlib.h>
#include <share.h>

int main( void )
{
	//char buffer[256];
	FILE *dirOUT;
	dirOUT = _fsopen("dir","wt", _SH_DENYWR);

	fprintf(dirOUT, system("dir m:"));
	fclose(dirOUT);

	return 0;
}