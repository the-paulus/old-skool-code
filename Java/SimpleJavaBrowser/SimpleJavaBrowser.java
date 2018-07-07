import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;


public class SimpleJavaBrowswer extends JFrame implements ActionListener {
   public static void main(String[] args) {
      try {
         JFrame simpleJavaBrowser = new SimpleJavaBrowser();
         simpleJavaBrowser.show();
       } catch (Exception je) {                                   //Close try open catch
	      System.err.println("Cannont Execute Program");
	      System.err.println("cause: " + je);
	      System.exit(-1);
      }                                                           //close catch
   }                                                              //end main
   
   SimpleJavabrowser()
   {
      addWindowListener(new WindowAdapter(){public void windowClosting(WindowEvent e){System.exit(0);} } );
      
   }
   
   
   // TODO: Read Config file for home address.
   public void onStartup() {
	   String sURL = null;
	   try {
	      sURL = "http://www.linux.org";
	      linuxURL = new URL(sURL);
	      GoURL(linuxURL);
	   } catch(IOException one) {
	      System.err.println("Error attempting to start." + one);
	   }
    }

    public void GoURL(URL url)
    {
	try {
	    htmlPane.setPage(url);
	} catch(IOException ioe) {
	    System.err.println("Error attempting to read URL: " + ioe);
	}
    }
}                                                                 //end class