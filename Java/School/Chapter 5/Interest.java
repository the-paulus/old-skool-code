// Paul Lyon
// Exercise 5.9 and 5.13 - I combined the two.
// 2/16/03

// Java core packages
import java.text.NumberFormat;
import java.util.Locale;
import java.awt.*;

// Java extension packages
import javax.swing.*;

public class Interest {

   // main method begins execution of Java application
   public static void main( String args[] )
   {
     //Stored as pennies
      long amount, principal = 1000, rate = 5;
      String cents = null;

      // create DecimalFormat to format floating-point numbers
      // with two digits to the right of the decimal point
      //NumberFormat moneyFormat = NumberFormat.getCurrencyInstance( Locale.US );

      // create JTextArea to display output
      JTextArea outputTextArea = new JTextArea();
      JScrollPane sPane = new JScrollPane(outputTextArea);
      sPane.setPreferredSize(new Dimension(200, 300));

      // set first line of text in outputTextArea
      outputTextArea.setText( "Year\tAmount on deposit\n" );

      // calculate amount on deposit for each of ten years
      for ( int year = 1; year <= 10; year++ ) {

         // calculate new amount for specified year
         amount = (long) (principal*Math.pow((double)1+(rate/(double)100), year));
         cents = "" + (amount %100);
         if(cents.length() == 1)
           cents = "0"+cents;

         // append one line of text to outputTextArea
         outputTextArea.append( year + "\t" + "$" + amount + "." + cents + "\n");

      }  // end for structure

      outputTextArea.append("\n\t6% interest rate\n");

      //6% Interest
      for ( int year = 1; year <= 10; year++ ) {

         // calculate new amount for specified year
         amount = (long) (principal*Math.pow((double)1+(6/(double)100), year));
         cents = "" + (amount %100);
         if(cents.length() == 1)
           cents = "0"+cents;

         // append one line of text to outputTextArea
         outputTextArea.append( year + "\t" + "$" + amount + "." + cents + "\n");

      }  // end for structure

      //7% Interest
      outputTextArea.append("\n\t7% interest rate\n");

      for ( int year = 1; year <= 10; year++ ) {

         // calculate new amount for specified year
         amount = (long) (principal*Math.pow((double)1+(7/(double)100), year));
         cents = "" + (amount %100);
         if(cents.length() == 1)
           cents = "0"+cents;

         // append one line of text to outputTextArea
         outputTextArea.append( year + "\t" + "$" + amount + "." + cents + "\n");

      }  // end for structure

      //8% Interest
      outputTextArea.append("\n\t8% interest rate\n");

      for ( int year = 1; year <= 10; year++ ) {

         // calculate new amount for specified year
         amount = (long) (principal*Math.pow((double)1+(8/(double)100), year));
         cents = "" + (amount %100);
         if(cents.length() == 1)
           cents = "0"+cents;

         // append one line of text to outputTextArea
         outputTextArea.append( year + "\t" + "$" + amount + "." + cents + "\n");

      }  // end for structure

      //9% Interest
      outputTextArea.append("\n\t9% interest rate\n");

      for ( int year = 1; year <= 10; year++ ) {

         // calculate new amount for specified year
         amount = (long) (principal*Math.pow((double)1+(9/(double)100), year));
         cents = "" + (amount %100);
         if(cents.length() == 1)
           cents = "0"+cents;

         // append one line of text to outputTextArea
         outputTextArea.append( year + "\t" + "$" + amount + "." + cents + "\n");

      }  // end for structure

      //10% interest
      outputTextArea.append("\n\t10% interest rate\n");

      for ( int year = 1; year <= 10; year++ ) {

         // calculate new amount for specified year
         amount = (long) (principal*Math.pow((double)1+(10/(double)100), year));
         cents = "" + (amount %100);
         if(cents.length() == 1)
           cents = "0"+cents;

         // append one line of text to outputTextArea
         outputTextArea.append( year + "\t" + "$" + amount + "." + cents + "\n");

      }  // end for structure


      // display results
      JOptionPane.showMessageDialog( null, sPane,
         "Compound Interest", JOptionPane.INFORMATION_MESSAGE );

      System.exit( 0 );  // terminate the application

   }  // end method main

}  // end class Interest


/**************************************************************************
 * (C) Copyright 2002 by Deitel & Associates, Inc. and Prentice Hall.     *
 * All Rights Reserved.                                                   *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
