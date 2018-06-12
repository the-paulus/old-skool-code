// QUIKSORT.CPP
// An implementation of a quicksort algorithm.

// compiler directive

// function prototypes
#include<iostream.h>
#include<fstream.h>

void display_array(int input_array[], int input_size);
void quicksort(int input_array[], int top, int bottom);
void partition(int input_array[], int top, int bottom);

int main()
{

	ifstream FILE;
	char FILElo[50];
	int num[50];

  cout << "Unsorted Array:\n";
  cout << "\nEnter file which holds integers to be sorted: ";
  cin.get(FILElo,50);
  cin.ignore(80, '\n');
  FILE.open(FILElo, ios::in);
  if(!FILE)
  {
	  cout << "\nError! aborting...";
	  return 0;
  }
  else
  {
	  for(int i = 0; i<50;i++)
	  {
		  
	  display_array(FILElo, 49);
	  quicksort(nums, 0, 49);
		FILE.close();
	display_array(nums, nums_length);
  }
  return 0;
}

// Quicksort procedure. Sorts an array of ints in descending order.
void quicksort(int input_array[], int top, int bottom)
{
  int middle;
  
  if (top < bottom)
   {
    middle = partition(input_array, top, bottom);
    quicksort(input_array, top, middle);	// sort top partition
    quicksort(input_array, middle + 1, bottom); // sort bottom partition
   }
}

// partitions input_array, returning middle index. Used by procedure quicksort.
int partition(int input_array[], int top, int bottom)
{
  int x = input_array[top];
  int i = top - 1;
  int j = bottom + 1;
  int temp;

  do
   {
    // move j towards top to the next element less than or equal to x.
    do
     {
      j--;
     } while(x > input_array[j]);

    // move j towards bottom to the next element greater than or equal to x.
    do
     {
      i++;
     } while(x < input_array[i]);

    if (i < j)
     {
      // switch elements at positions i and j.
      temp = input_array[i];
      input_array[i] = input_array[j];
      input_array[j] = temp;
     }
   } while(i < j);	// loop ends when i and j have met in the middle.

   return j;	// j and above represents top partition, below j is bottom partition.
}

// Function that simply displays each element of input_array.
void display_array(int input_array[], int input_size)
{
  int i;
  
  for (i = 0; i < input_size; i++)
   {
    cout << input_array[i] << ' ';
   }
  cout << "\n\n";
}
