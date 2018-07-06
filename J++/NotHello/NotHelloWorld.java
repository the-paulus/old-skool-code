/**
 * @version 1.20 25 Mar 1998
 * @author Cay Horstmann
 */

import java.awt.*;
import java.awt.event.*;
//import javax.swing.*;

class NotHelloWorldPanel extends Panel
{  public void paintComponent(Graphics g)
   {  super.paintComponent(g);
      g.drawString("Not a Hello, World program", 75, 100);
   }
}

class NotHelloWorldFrame extends Frame
{  public NotHelloWorldFrame()
   {  setTitle("NotHelloWorld");
      setSize(300, 200);
      addWindowListener(new WindowAdapter()
         {  public void windowClosing(WindowEvent e)
            {  System.exit(0);
            }
         } );

      Container contentPane = getContentPane();
      contentPane.add(new NotHelloWorldPanel());
   }
}

public class NotHelloWorld
{  public static void main(String[] args)
   {  Frame frame = new NotHelloWorldFrame();
      frame.show();  
   }
}




