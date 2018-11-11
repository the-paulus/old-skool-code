//Paul Lyon
//Exercise 12-1
//circle.h

#ifndef _SQUAR_H
#define _SQUAR_H


class SQUAR
{
 public:
	  // constructors
	  squar();                         // default constructor
	  squar(int side);           // copy constructor

	  // member functions
	  void   SetSide(int);
	  int Area();
	  int Vol();

 private:
	  // data
	  int Side;
};

// default constructor
SQUAR::squar()
{
	Side = 0;
}

// copy constructor
SQUAR::squar(int side)
{
  Side = side;
}

// Method to set the radius of the circle
void SQUAR::SetSide(int IncomingSide)
{
  Side = IncomingSide;
}

// Method to find the area of the circle
int SQUAR::Area()
{
 return(Side*Side);
}

//Return Volume
int SQUAR::Vol()
{
	return (Side)^3;
}

#endif
