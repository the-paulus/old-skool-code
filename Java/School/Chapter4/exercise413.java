//Paul Lyon
//Exercise 4.13
//2/9/03

import javax.swing.*;
import java.text.*;

public class exercise413 {
    public static void main( String srgs[] ) {
	String choice = JOptionPane.showInputDialog(null, "What did you Sell?\n Item\t Value\n1\t 239.99\n2\t 129.75\n3\t 99.95\n4\t 350.89\n\n0 to calculate", "Commision Calculator", JOptionPane.QUESTION_MESSAGE);
;
	double sales = 0;
	DecimalFormat df = new DecimalFormat(".00");	

	while(Integer.parseInt(choice) != 0) {
	    choice = JOptionPane.showInputDialog(null, "What did you sell?\n Item\t Value\n1\t 239.99\n2\t 129.75\n3\t 99.95\n4\t 350.89\n\n0 to calculate", "Commision Calculator", JOptionPane.QUESTION_MESSAGE);

	    if( Integer.parseInt(choice) == 1 )
		sales += 239.99;
	    if( Integer.parseInt(choice) == 2 )
		sales += 129.75;
	    if( Integer.parseInt(choice) == 3 )
		sales += 99.95;
	    if( Integer.parseInt(choice) == 4 )
		sales += 350.89;
	    if( ( Integer.parseInt(choice) > 4 ) || ( Integer.parseInt(choice) < 0 ) )
		continue;
	}

	
	JOptionPane.showMessageDialog(null, "Net pay is $" + df.format((sales * 1.09)), "Net Pay", JOptionPane.INFORMATION_MESSAGE);

	    System.exit(0);
    }
} 
