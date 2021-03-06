//Paul Lyon
//Exercise 3.7
//2/3/03

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exercise37 extends JApplet implements ActionListener {
   double sum;
   double numberOne;
   double numberTwo;
   int fc = 12;
   Color[] c = { Color.black, Color.blue, Color.cyan, Color.darkGray, Color.gray, Color.green, Color.lightGray, Color.magenta, Color.orange, Color.pink, Color.red, Color.yellow, Color.white };
   Timer t;
   
   public void actionPerformed(ActionEvent e) {
      
      repaint();
      fc--;
      if(fc <= 0) {
         fc=12;
      }
      System.out.println(fc);
   } 
   
   public void init()
   {
      String firstNumber = null;
      String secondNumber = null;
     
      t = new Timer(100,this);
      t.setInitialDelay(0);
      t.setCoalesce(true); 
            
      while(firstNumber == null) {
         firstNumber = JOptionPane.showInputDialog("Enter first floating-point value:");
      } //close while(firstNumber == null)
      
      while(secondNumber == null) {
         secondNumber = JOptionPane.showInputDialog("Enter second floating-point value:");
      } //close while(secondNumber == null)
      
      try {
         numberOne = Double.parseDouble(firstNumber);
      } catch (NumberFormatException nfe) {
         JOptionPane.showMessageDialog(null, "alert", "Error converting input to float!", JOptionPane.ERROR_MESSAGE);
      } //close catch
      
      try {
         numberTwo = Double.parseDouble(secondNumber);
      } catch (NumberFormatException nfe) {
         JOptionPane.showMessageDialog(null, "alert", "Error converting input to float!", JOptionPane.ERROR_MESSAGE);
      }
   }
   
   public void paint( Graphics g ) {
      super.paint ( g );
      
      t.start();
      
      g.drawRect(15, 10, 270, 20);
      g.setColor(c[fc]);
      g.setFont(new Font("Arial", Font.BOLD, 12));
      
      if(numberOne < numberTwo) {
         g.drawString(numberOne + " is less than " + numberTwo, 25, 25);
      }
      
      if(numberOne == numberTwo) {
         g.drawString("These numbers are equal", 25,25);
      }
      
      if(numberOne > numberTwo) {
         g.drawString(numberOne + " is greater than " + numberTwo, 25,25);
      }
   }
}
