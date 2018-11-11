import java.awt.Graphics;
import javax.swing.JApplet;

public class MyFirstApplet extends JApplet 
{
   public void paint( Graphics g )
   {
      super.paint(g);
      g.drawString("Welcome to my first Applet", 25, 25);
   }
}