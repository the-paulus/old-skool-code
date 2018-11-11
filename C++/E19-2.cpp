//Paul Lyon
//Exercise 19-2
//E19-2.cpp

// compiler directives
#include<iostream.h>
#include<fstream.h>
#define PRINT_IT ofstream prn("PRN")
PRINT_IT;

// function prototypes
void insertion_sort(int array[], int arrayLength);
void display_array(int input_array[], int input_size);

int main()
{
  int nums[8] = {20, 31, 17, 47, 14, 35, -10, 35};
  int nums_length = 8;

  cout << "Unsorted Array:\n";
  prn << "Unsorted Array:\n";
  display_array(nums, nums_length);

  insertion_sort(nums, nums_length);

  cout << "Sorted Array:\n";
  prn << "Sorted Array:\n";
  display_array(nums, nums_length);
  return 0;
}

// Insertion sort function. Sorts an array of ints in descending order.
void insertion_sort(int array[], int array_length)
{
  int j, i, key;

  for (j = 1; j < array_length; j++)
   {
     key = array[j];

     // Move all values smaller then key up one position.
     for (i = j - 1; (i >= 0) && (array[i] < key); i--)
	 {
	array[i + 1] = array[i];
	 }
     array[i + 1] = key;  // insert key into proper position
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
