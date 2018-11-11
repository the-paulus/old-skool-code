#include<iostream.h>
#include<fstream.h>
#include<stdlib.h>

void quicksort(int input_array[], int top, int bottom);
int partition(int input_array[], int top, int bottom);
void display_array(int input_array[], int input_size);
int DatNum[50];
ofstream debug;
int input_array[50];
int LookFor;

int main()
{
	int i=0;
	int s = 0;
	ifstream infile;    
	

	infile.open("NUMBERS.DAT.TXT",ios::in);
	debug.open("debug.log",ios::out);

	if (infile)  
	{           
		do
		{
			infile >> DatNum[i];
			debug << '\n' <<i+1 << ": " << DatNum[i];
			i++;
		}while(!infile.eof());
		
		for(int j=0; j<25; j++)
		{
			cout << '\n' << DatNum[j];
		}

		quicksort(DatNum, 0, 50);

		
		cout << "\n\n";
	}
		for(i=0;i<50;i++)
		{
			cout << ' ' << input_array[i];
			debug << '\n' << i+1 << ": " << input_array[i];
		}
	display_array(DatNum, 50);
	cout << "\nEnter a number to look for: ";
	cin >> LookFor;
	for(int L; L <50; L++)
	{
		if(input_array[L]==LookFor)
		{
			cout << "\nFound " << LookFor << "in element " << L << '.';
		}
		else
		{
			cout << "\nOperation Failed! Get Linux!";
		}
	infile.close();
	debug.close();

	return 0;
}

void quicksort(int input_array[], int top, int bottom)
{
  int middle;
  int i;
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

void display_array(int input_array[], int input_size)
{
  int i;
  
  for (i = 0; i < input_size; i++)
   {
    cout << input_array[i] << ' ';
   }
  cout << "\n\n";
}