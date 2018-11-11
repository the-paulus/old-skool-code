import javax.swing.JOptionPane;

public class Exercise218
{
    public static void main(String args[])
    {
	String input1 = null;
	String input2 = null;
	String input3 = null;
	int num1 = 0;
	int num2 = 0;
	int num3 = 0;
	
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

	try {
	    input3 = JOptionPane.showInputDialog("Please enter one more number.");
	    num3 = Integer.parseInt(input2);
	} catch(NumberFormatException x) {
	    JOptionPane.showMessageDialog(null, "The value that you gave was invalid.", "Error!", JOptionPane.ERROR_MESSAGE);
	    System.exit(-1);
	}

	int avg = (num1 + num2 + num3) / 3;
       
        JOptionPane.showMessageDialog(null, "The Average of " 
            
        System.exit(0);
    }
}