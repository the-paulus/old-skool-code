#include <iostream.h>

class Cat			  //cat is a new data type
{
	int itsAge;
	int itsWeight;
};

int main()
{
	Cat Frisky;	  //defines frisky as the new data type "Cat"
	Frisky.itsAge = 5;	  //assigns the value '5' to Frisky.itsAge

	cout << "Frisky is a cat who is ";
	cout << Frisky.itsAge << " years old.\n";

	return 0;
}