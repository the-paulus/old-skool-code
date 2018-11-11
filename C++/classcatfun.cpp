#include <iostream.h>

class Cat	   //Sets a new type of variable
{
public:	   //sets GetAge() function, SetAge() function, Meow Function as public functions.
	int GetAge();	  //Returns the cats age
	void SetAge (int age); //sets the cat's age with a number in the prentisies
	void Meow();
private:		    //sets int itsAge as a private integer
	int itsAge;
};

int Cat::GetAge()	 //tells that the "GetAge()" function belongs to the Cat data type.
{
	return itsAge;	 //displays the cats age
}

void Cat::SetAge(int age)   //tells that the "SetAge()" function belongs to the Cat data type.	 
{					   //'int age' is the number that will be assigned to the itsAge private variable
	itsAge = age;
}

void Cat::Meow()		  //tells that the "Meow()" function belongs to the cat data type.
{
	cout << "Meow.\n";	  //when the "Meow()" function is used it will display "Meow" on the screen
}

int main()
{					 
	Cat Frisky;		 //defines Frisky as a Cat data type
	Frisky.SetAge(5);	 //makes the cat 5 years old
	Frisky.Meow();		 //displays "Meow" on the screen

	cout << "Frisky is a cat who is ";
	cout << Frisky.GetAge() << " years old.\n";
	Frisky.Meow();

	return 0;
}
