//Paul Lyon
//Chapter 10 Test
//chap10test.cpp

#include<iostream.h>
#include<fstream.h>
#define PRINT_IT ofstream prn("PRN")
PRINT_IT;

struct score
{
	float worst, average, best;
};

int main()
{
	score GAME;
	score GAME2;

	GAME.worst = 74.5;
	GAME.average = 82.34;
	GAME.best = 91.6;
	GAME2.average = 0;

	cout << "\nThe previous game's status was: ";
	cout << "\nWorst: ";
	cout << GAME.worst;
	cout << "\nBest: ";
	cout << GAME.best;
	cout << "\nAverage: ";
	cout << GAME.average;

	cout << "\Enter the new games status: ";
	cout << "\nWorst: ";
	cin >> GAME2.worst;
	cout << "\nBest: ";
	cin >> GAME2.best;
	GAME2.average = (GAME2.best + GAME2.worst) / 2;

	cout << "\nThe new game's status has been recorded as: ";
	cout << "\nWorst: ";
	cout << GAME2.worst;
	cout << "\nBest: ";
	cout << GAME2.best;
	cout << "\n The average is: ";
	cout << GAME2.average;

	////////Printing////////////
	prn << "\nThe previous game's status was: ";
	prn << "\nWorst: ";
	prn << GAME.worst;
	prn << "\nBest: ";
	prn << GAME.best;
	prn << "\nAverage: ";
	prn << GAME.average;

	prn << "\Enter the new games status: ";
	prn << "\nWorst: ";
	prn << GAME2.worst;
	prn << "\nBest: ";
	prn << GAME2.best;

	prn << "\nThe new game's status has been recorded as: ";
	prn << "\nWorst: ";
	prn << GAME2.worst;
	prn << "\nBest: ";
	prn << GAME2.best;
	prn << "\n The average is: ";
	prn << GAME2.average;

	return 0;
}
