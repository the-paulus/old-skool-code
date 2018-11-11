//Paul Lyon
//problem 11.2.1
//addfile.cpp

#include<iostream.h>
#include<fstream.h>

int main()
{
	char name[25], address[30], city[20], st[3];
	int zip;

	ofstream wfile;

	wfile.open("DATA.txt",ios::out);

	cout << "\nWhats your name? ";
	cin.get(name,25);
	cin.ignore(80,'\n');
	cout << "\nWhat's your street address? ";
	cin.get(address,30);
	cin.ignore(80,'\n');
	cout << "\nWhat city do you live in? ";
	cin.get(city,20);
	cin.ignore(80,'\n');
	cout << "\nWhat State do you live in? ";
	cin.get(st, 3);
	cin.ignore(80,'\n');
	cout << "\nWhat's you zip code? ";
	cin >> zip;

	wfile << name << '\n' << address << '\n' << city << ", " << st << " " << zip;

	return 0;
}

