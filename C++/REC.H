#ifndef _REC_H
#define _REC_H


class REC
{
public:
rec();
//squar(const squar & objec

void SetSide(int IncomingSideOne, int IncomingSideTwo);
int Area();
int Vol();

private:
int Side, Side2;
};

//Constructor
REC::rec()
{
Side = 0;
Side2 = 0;
}

void REC::SetSide(int InComingSideOne, int InComingSideTwo)
{
Side = InComingSideOne;
Side2 = InComingSideTwo;
}
//Get the area
int REC::Area()
{
return Side*Side2;
}

#endif
