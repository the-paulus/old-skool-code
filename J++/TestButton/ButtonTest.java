/**
 * @version 1.10 25 Mar 1997
 * @author Cay Horstmann
 */

import java.awt.*;
import java.awt.event.*;
//import javax.swing.*;

class ButtonPanel extends Panel 
   implements ActionListener
{  public ButtonPanel()
   {  yellowButton = new Button("Yellow");
      blueButton = new Button("Blue");
      redButton = new Button("Red");

      add(yellowButton);
      add(blueButton);
      add(redButton);

      yellowButton.addActionListener(this); 
      blueButton.addActionListener(this); 
      redButton.addActionListener(this); 
   }

   public void actionPerformed(ActionEvent evt)
   {  Object source = evt.getSource();
      Color color = getBackground();
      if (source == yellowButton) color = Color.yellow;
      else if (source == blueButton) color = Color.blue;
      else if (source == redButton) color = Color.red;
      setBackground(color);
      repaint();
   }

   private Button yellowButton;
   private Button blueButton;
   private Button redButton; 
}


class ButtonFrame extends Frame
{  public ButtonFrame()
   {  setTitle("ButtonTest");
      setSize(300, 200);
      addWindowListener(new WindowAdapter()
         {  public void windowClosing(WindowEvent e)
            {  System.exit(0);
            }
         } );

      //Container contentPane = getContentPane();
      //contentPane.add(new ButtonPanel());
   }
}

public class ButtonTest
{  public static void main(String[] args)
   {  Frame frame = new ButtonFrame();
      frame.show();  
   }
}
