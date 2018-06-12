//Paul Lyon
//Chapter 19 test

#include<iostream.h>
#include<fstream.h>

#define PRINT_IT ofstream prn("PRN")
PRINT_IT;

void bubble_sort(int array[], int size);
int variables[10] = { 10, 4, 12, 42, 6, 4, 29, 93, 90 };
int array_in[10];

int main()
{
	int a;

	cout << "Before: ";
	prn << "Before: ";
	for(a=0;a<10;a++)
	{
		cout << variables[a] << ", ";
		prn << variables[a] << ", ";
	}

	cout << "\n\n";
	prn << "\n\n";

	bubble_sort(variables, 9);


	return 0;

}

void bubble_sort(int array[], int size)
{
	int i, j, count = 1;
	int temp;

	for(i = 1; (i <= size) && count; i++)
	{
		count = 0;
		for(j = 0; j < (size - i); j++)
		{
			if (array[j + 1] > array[j])
			{
				temp = array[j + 1];
				array[j + 1] = array[j];
				array[j] = temp;
				count = 1;
			}
		}
	}
	cout << "After: ";
	prn << "After: ";
	for(int z=0;z<=size;z++)
	{
		cout << array[z] << ", ";
		prn << array[z] << ", ";
	}
}