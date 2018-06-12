#include<iostream.h>
//Creates new data type
enum CHOICE { DrawRect = 1, GetArea, GetPerim, ChangeDimensions, Quit };

//Creates new class type
class Rectangle
{
  //Declares Public functions
  public:
  Rectangle(int width, int height);
  ~Rectangle();  //Deconstuctor

  int GetHeight() const { return itsHeight; }
  int GetWidth() const { return itsHeight; }
  int GetArea() const { return itsheight * itsWidth; }
  int GetPerim() const { return (2 * itsHeight) + (2 * itsWidth; }
  void SetSize(int NewWidth, int NewHeight);

  private:
  int itsWidth;
  int itsHeight;
  }; //End of class

  void Rectangle::SetSize(int NewWidth, int NewHeight) //Rectangle.SetSize function
    {
