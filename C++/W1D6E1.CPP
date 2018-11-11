#include <iostream.h>

class Employee
{
public:
	int age;
	int Years;
	float salary;
};

int main()
{
	Employee One;
	Employee Two;

	cout << "\nHow old is the first employee? ";
	cin >> One.age;
	cout << "\nHow many years has he been working for you? ";
	cin >> One.Years;
	cout << "\nHow much does he make a year? ";
	cin >> One.salary;

	cout << "\n\n\nHow old is the second employee? ";
	cin >> One.age;
	cout << "\nHow many years has he been working for you? ";
	cin >> One.Years;
	cout << "\nHow much does he make a year? ";
	cin >> One.salary;

	cout << "\n\n\n\nThe First Employee is " << One.age << "\nHe has been working for " << One.Years << "\nHe makes $" << One.salary << " a year";
	cout << "\n\n\n\nThe Second Employee is " << Two.age << "\nHe has been working for " << Two.Years << "\nHe makes $" << Two.salary << " a year";

	return 0;
}

