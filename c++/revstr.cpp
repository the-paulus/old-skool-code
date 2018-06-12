//Paul Lyon
//project 10-4.cpp
//10-4p.cpp

#include<iostream.h>
#include<string.h>

char *String[20];
char Rev_str(char *temp[20]);

int main()
{
	cout << "\nEnter a string: ";
	cin.get(*String,20);
	cin.ignore(80,'\n');

	cout << "\nThe string " << String << " backwords is " << Rev_str(String);

	return 0;
}

char *Rev_str(char *temp)
{
	char *R[20];
	int	i = 0;
	int	j = 19;
	do
	{
		*(R + i) = *(temp + j);
		i++;
		j--;

	}while(i<20);

	
}
