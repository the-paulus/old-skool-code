#include "matrix.h"
#include <fstream.h>
#define PRINT_IT ofstream prn("PRN");
PRINT_IT;

int main()
{
	int Matrix[4][4];
	int row, col;
	int in;

  for(row = 0; row < 4; row++)
  {
    for(col = 0; col < 4; col++)
    {
      cout << "\nPlease enter an integer for position (" << row << ", " << col << ") :";
	  prn << "\nPlease enter a character for matrix position (" << row << ", " << col << ") :";
      cin >> in;
	  prn << in << endl;
      Matrix[row][col] = in;
    } 
  }
  
 
  for(row = 0; row < 4; row++)
  {
    for(col = 0; col < 4; col++)
    {
      cout << Matrix[row][col] << ' ';
	  prn << Matrix[row][col] << ' ';
    }
	cout << endl;
	prn << endl;
  }

  return 0;
}