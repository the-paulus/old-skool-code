import java.awt.Graphics;

public class MyLine {
   private int x1, x2, y1, y2;

   public MyLine()
   {
      x1 = x2 = y1 = y2 = 0;
   }

   public MyLine(int p_x1, int p_y1, int p_x2, int p_y2)
   {
     x1 = p_x1;
     y1 = p_y1;
     x2 = p_x2;
     y2 = p_y2;
   }

   public int getXOne()
   {
      return x1;
   }

   public int getXTwo()
   {
      return x2;
   }

   public int getYOne()
   {
      return y1;
   }

   public int getYTwo()
   {
      return y2;
   }

   public void setXOne(int px1)
   {
      x1 = px1;
   }

   public void setXTwo(int px2)
   {
      x2 = px2;
   }

   public void setYOne(int py1)
   {
      y1 = py1;
   }

   public void setYTwo(int py2)
   {
      y2 = py2;
   }

   public void draw( Graphics g )
   {
      g.drawLine(x1, y1, x2, y2);
   }

   /*public void toString()
   {
      return "(" + x1 + ", " + y1 + ")" + " - (" + x2 + ", " + y2 + ")";
   }*/
}