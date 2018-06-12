// Paul Lyon
//Problem 14.2.1
//pro14-2-1.cpp

#include<iostream.h>
#include<fstream.h>
#define PRINT_IT ofstream prn("PRN")
PRINT_IT;

template <class DataType>
void swap(DataType & x, DataType & y);

int main()
{
  int a = 1,
      b = 2;

  float c = 1.2345,
	d = 9.8765;

  char String1[] = "p";
  char String2[] = "l";

  cout << "a is " << a << ", b is " << b << endl;
  prn << "a is " << a << ", b is " << b << endl;

  swap(a,b);

  cout << "a is " << a << ", b is " << b << endl << endl;
  prn << "a is " << a << ", b is " << b << endl << endl;

  cout << "c is " << c << ", d is " << d << endl;
  prn << "c is " << c << ", d is " << d << endl;

  swap(c,d);

  cout << "c is " << c << ", d is " << d << endl << endl;
  prn << "c is " << c << ", d is " << d << endl << endl;

  cout << "String1: " << String1 << endl << "String2: " << String2 << endl;
  prn <<  "String1: " << String1 << endl << "String2: " << String2 << endl;

  swap(String1[18],String2[18]);

  cout << "String1: " << String1 << endl << "String2: " << String2 << endl;
  prn <<  "String1: " << String1 << endl << "String2: " << String2 << endl;

  return 0;
}

template <class DataType>
void swap(DataType & x, DataType & y)
{
  DataType temp = x;
  x = y;
  y = temp;
}
