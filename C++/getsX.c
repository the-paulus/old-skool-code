/*
 *	gets() exploit test
 *
 *	test the system for the gets whole
 */

#include<stdio.h>

int main( void )
{
	char test_string[20];

	printf("Enter a bunch of garbage to test the system: ");
	gets(test_string);
	printf("\n%s", test_string);

	return 0;
}