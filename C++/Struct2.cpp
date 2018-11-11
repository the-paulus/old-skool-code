//Paul Lyon
//struct2.cpp

#include<iostream.h>
#include<iomanip.h>
#include<string.h>
#include<fstream.h>
#define PRINT_IT ofstream prn("PRN")
PRINT_IT;

  struct inventory_item
    {
      char item_ID[11];
      char description[31];
      int quantity_on_hand;
      int reorder_point;
      double cost;
      double retail_price;
    };

int main()
{
  inventory_item todays_special;
  int customer;

  strcpy(todays_special.item_ID, "RGG456-299");
  strcpy(todays_special.description, "Remote Control Monster Truck");
  todays_special.quantity_on_hand = 19;
  todays_special.reorder_point = 3;
  todays_special.cost = 47.80;
  todays_special.retail_price = 98.99;

  cout << "Today's Special:\n";
  cout << "      Item ID: " << todays_special.item_ID << endl;
  cout << "  Description: " << todays_special.description << endl;
  cout << "     Quantity: " << todays_special.quantity_on_hand << endl;
  cout << "Regular Price: " << setprecision(2) << todays_special.retail_price << endl;
  cout << "   Sale Price: " << todays_special.retail_price * .8 << endl;
  cout << "\n------------------------";
  cout << "\nHow many customers do you expect? ";
  cin >> customer;

  if (customer > todays_special.quantity_on_hand)
  {
	  cout << "\nYour going to have some trouble today..";
	  prn << "\nYour going to have some trouble today..";
  }
  else
  {
	  cout << "\nYou should have enough.";
	  prn << "\nYou should have enough.";
  }
  
  prn << "Today's Special:\n";
  prn << "      Item ID: " << todays_special.item_ID << endl;
  prn << "  Description: " << todays_special.description << endl;
  prn << "     Quantity: " << todays_special.quantity_on_hand << endl;
  prn << "Regular Price: " << setprecision(2) << todays_special.retail_price << endl;
  prn << "   Sale Price: " << todays_special.retail_price * .8 << endl;
  prn << "\n------------------------";
  prn << "\nHow many customers do you expect? ";
  prn << customer;

  return 0;
}
