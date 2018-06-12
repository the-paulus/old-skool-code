//Paul Lyon
//Problem 12.2.2
//pro12-2-2.cpp

#include<iostream.h>
#include<fstream.h>
#include<iomanip.h>
#include"bucket.h"
#define PRINT_IT ofstream prn("PRN")
PRINT_IT;

int main()
{
	bucket mybucket;
	float fill, weight;

	mybucket.SetGallonSize(5.0);
	mybucket.FillBucket(3.2);
	weight = mybucket.GetWeight();

	cout << "\nThe weight of the bucket is " << setprecision(2) << weight;
	prn << "\nThe weight of the bucket is " << setprecision(2) << weight;
	
	return 0;
}