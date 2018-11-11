/*
 * Paul Lyon
 * Java Programming
 * Exercise 2.16
 */

import javax.swing.JOptionPane;
import java.lang.*;

public class Exercise216
{
	public static void main(String args[])
	{
            String input1 = null;
            String input2 = null;
            int num1 = 0;
            int num2 = 0;
		try {
                    input1 = JOptionPane.showInputDialog("Please enter a number.");
                    num1 = Integer.parseInt(input1);
		} catch(NumberFormatException x) {
                    JOptionPane.showMessageDialog(null, "The value that you gave me was invalid.", "Error!", JOptionPane.ERROR_MESSAGE);
                    System.exit(-1);
                }
                
                try {
                    input2 = JOptionPane.showInputDialog("Please enter another number.");
                    num2 = Integer.parseInt(input2);
                } catch(NumberFormatException x) {
                    JOptionPane.showMessageDialog(null, "The value that you gave was invalid.", "Error!", JOptionPane.ERROR_MESSAGE);
                    System.exit(-1);
                }
         
                JOptionPane.showMessageDialog(null, num1 + " + " + num2 + " = " + (num1 + num2) + "\n" +
                                                    num1 + " - " + num2 + " = " + (num1 - num2) + "\n" +
                                                    num1 + " * " + num2 + " = " + (num1 * num2) + "\n" +
                                                    num1 + " / " + num2 + " = " + (num1 / num2) + " R " + (num1 % num2), "Results", JOptionPane.INFORMATION_MESSAGE); 
                System.exit(0);
                                                   
    }
}
