#include <iostream.h>
int main()
{
	enum Days { Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday };
	int choice;
	cout << "Enter a day (0-6): ";
	cin >> choice;
	if (choice == Sunday || choice == Saturday)
		cout << "\nYour're already off on weekends!\n";
	else
		cout << "\nOk, I'll put in the vaction day.\n";
	return 0;
}