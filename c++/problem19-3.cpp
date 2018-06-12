//Paul Lyon
//Problem 19-3
//problem19-3.cpp

#include<iostream.h>
#include<fstream.h>
#define PRINT_IT ofstream prn("PRN")
PRINT_IT;

void selection_sort(int input_array[], int input_size);
void display_array(int input_array[], int input_size);

int main()
{
	int nums[5];
	int nums_length = 5;
	cout << "\nEnter 5 integers: ";
	prn << "\nEnter 5 integers: ";

	for(int i=0; i<5; i++)
	{
		cout << "\nInteger #" << i+1 << ' ';
		prn << "\nInteger #" << i+1 << ' ';
		cin >> nums[i];
		prn << nums[i];
	}

	cout << "Unsorted Array:\n";
	prn << "Unsorted Array:\n";
	display_array(nums, nums_length);

	selection_sort(nums, nums_length);

	cout << "Sorted Array:\n";
	prn << "Sorted Array:\n";
	display_array(nums, nums_length);
  
	return 0;
}

void selection_sort(int input_array[], int input_size)
{
	int i, j;
	int Large, temp;
  
	for (i = input_size - 1; i > 0; i--)
	{
		Large = 0;  // Initialize Large to first element.
    
		// Find the Largeest element between the positions 1 and i.
		for (j = 1; j <= i; j++)	
		{
			if (input_array[j] > input_array[Large])	
			{
				Large = j;
			}
		}
    // Swap the Largeest element found with element in position i.
		temp = input_array[Large];
		input_array[Large] = input_array[i];
		input_array[i] = temp;
	}
}

// Function that simply displays each element of input_array.
void display_array(int input_array[], int input_size)
{
	int i;
  
	for (i = 0; i < input_size; i++)
	{
		cout << input_array[i] << ' ';
		prn << input_array[i] << ' ';
	}
	cout << "\n\n";
	prn << "\n\n";
}
