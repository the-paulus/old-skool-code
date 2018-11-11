//Paul Lyon
//10-8.cpp

#include <iostream.h>
#include <fstream.h>
#define O cout
#define I cin
#define P prn
#define PRINT_IT of stream prn("PRN")
PRINT_IT;

enum blood_type { unkown, A, B, AB, O };
enum rh_factor { negative, positive };

struct blood_pressure
{
	int systolic;
	int diastolic;
};

struct donor_info
{
	blood_type type;
	rh_factor rh;
	blood_pressure bp;
	int heart_rate;
};

int main()
{
	donor_info current_donor;

	current_donor.type = A;
	current_donor.rh = positive;
	current_donor.bp.systolic = 130;
	current_donor.bp.diasolic = 74;
	current_donor.heart_rate = 69;

	cout << "\nThe donor's blood pressure is " << current_donor.bp.diasolic << " over " << current_donor.bp.systolic << ".\n";

	return 0;
}


