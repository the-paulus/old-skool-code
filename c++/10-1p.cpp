//Paul Lyon

#include<iostream.h>
#include<string.h>

char String1[10];
char String2[10];

char Rev_Str(char String3[10]);

int main()
{
	cout << "\nEnter a word to be rewritten backwords: ";
	cin.get(String1, 10);

	String2 = Rev_Str(String1);

	cout << "\n" << String2;

	return 0;
}

char Rev_Str(char String3)
{
	int i, k;
	i = 0;
	k = 10;

	do
	{
		String3[i] = String1[k];

		i++;
		k--;
	} while (i < 9);

	return String3;
}