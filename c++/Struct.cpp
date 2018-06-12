#include<iostream.h>
#include<iomanip.h>
#include<string.h>

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

  strcpy(todays_special.item_ID, "RGG456-299");
  strcpy(todays_special.description, "Remote Control Monster Truck");
  todays_special.quantity_on_hand = 19;
  todays_special.reorder_point = 3;
  todays_special.cost = 47.80;
  todays_special.retail_price = 98.99;

  cout << "Today's Special\n";
  cout << "       Item ID: " << todays_special.item_ID << endl;
  cout << "   Description: " << todays_special.description << endl;
  cout << "      Quantity: " << todays_special.quantity_on_hand << endl;
  cout << " Regular Price: " << setprecision(2) << todays_special.retail_price << endl;
  cout << "    Sale Price: " << todays_special.retail_price * .8 << endl;

  return 0;
}
