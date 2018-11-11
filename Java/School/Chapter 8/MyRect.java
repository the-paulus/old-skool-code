import java.awt.Graphics;

public class MyRect {
  private int length, width, x, y;

  public MyRect() {
    length = 0;
    width = 0;
    x = 0;
    y = 0;
  }

  public MyRect(int p_x, int p_y, int p_width, int p_length) {
    x = p_x;
    y = p_y;
    width = p_width;
    length = p_length;
  }

public int getX() {
   return x;
}

public int getY() {
   return y;
}

public int getLength() {
   return length;
}

public int getWidth() {
   return width;
}

public void setX(int px) {
   x = px;
}

public void setY(int py) {
   y = py;
}

public void setLength(int p_length) {
   length = p_length;
}

public void setWidth(int p_width) {
   width = p_width;
}

public void draw( Graphics g )
{
   g.drawRect( x, y, length, width );
}

public String toString() {
  return "(" + x + ", " + y + ")" + "Length = " + length + " Width = " + width;
  }
}