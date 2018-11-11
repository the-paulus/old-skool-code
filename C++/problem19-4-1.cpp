//Paul Lyon
//Problem 19-1-4
//problem19-1-4.cpp

#include<iostream.h>
#include<fstream.h>
#define PRINT_IT ofstream prn("prn")
PRINT_IT;

void selection_sort(float input_array[], int input_size);
void display_array(float input_array[], int input_size);

float main()
{
	float nums[5];
	int nums_length = 5;
	cout << "\nEnter 5 floategers: ";
	prn << "\nEnter 5 floategers: ";

	for(int i=0; i<5; i++)
	{
		cout << "\nfloateger #" << i+1 << ' ';
		prn << "\nfloateger #" << i+1 << ' ';
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

void selection_sort(float input_array[], int input_size)
{
	int i, j;
	int small;
	float temp;
  
	for (i = input_size - 1; i > 0; i--)
	{
		small = 0;  // Initialize small to first element.
    
		// Find the smallest element between the positions 1 and i.
		for (j = 1; j <= i; j++)	
		{
			if (input_array[j] < input_array[small])	
			{
				small = (float)j;
			}
		}
    // Swap the smallest element found with element in position i.
		temp = (float)input_array[small];
		input_array[small] = (float)input_array[i];
		input_array[i] = (float)temp;
	}
}

// Function that simply displays each element of input_array.
void display_array(float input_array[], int input_size)
{
	int i;
  
	for (i = 0; i < input_size; i++)
	{
		cout << (float)input_array[i] << ' ';
		prn << input_array[i] << ' ';
	}
	cout << "\n\n";
	prn << "\n\n";
}
