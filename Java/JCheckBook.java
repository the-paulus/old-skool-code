/********************************************************
 *
 * JCheckBook
 * Paul Lyon (paulus@wi.rr.com)
 *
 * This program is a simple program to balance your check 
 * book
 *
 */

/******************************************
 *          TODO
 *
 * 1) Allow user to edit past entries and update.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.io.*;
import javax.swing.filechooser.*;
import java.util.*;

/****************
 * Name: JCheckPane
 * Desc: This is the layout for the program.
 */

class JCheckPane extends JPanel implements ActionListener
{
   private JScrollPane scrollview;
   private JLabel lblDate, lblDescription, lblAmount, lblBalance;
   private JTextField txtDate, txtDescription, txtAmount;
   private JButton btnCalc, btnAE;
   private DefaultTableModel dtm;
   private JTable table; 
   private double balance;
   
   /************
    * Name: JCheckPane
    * Return: void
    * Arguments: none
    * Desc: This is a constructor that will initiate 
    *       variables and objects within this class.
    */
   public JCheckPane() 
   {
      //initiate Objects and variables
      dtm = new DefaultTableModel();
      table = new JTable(dtm);
      scrollview = new JScrollPane(table);
      txtDate = new JTextField();
      txtDescription = new JTextField();
      txtAmount = new JTextField();
      lblBalance = new JLabel();
      btnCalc = new JButton("Calculate");
      GridLayout grid = new GridLayout(2,3);
      balance = 0;
      setLayout(new BorderLayout());
      
      //Configure Table
      dtm.addColumn(new String("Date"));
      dtm.addColumn(new String("Description"));
      dtm.addColumn(new String("Amount"));
      table.setPreferredScrollableViewportSize(new Dimension(500, 70));
      
      Panel p1 = new Panel(new GridLayout());
      p1.add(txtDate);
      p1.add(txtDescription);
      p1.add(txtAmount);
      p1.add(lblBalance);
      p1.add(btnAE = new JButton("Add / Edit"));
      
      btnAE.addActionListener(this);
      /*table.addTableModelListener(new TableModelListener() { public void tableChanged(TableModelEvent e) {
        int row = e.getFirstRow();
        int column = e.getColumn();
        String columnName = model.getColumnName(column);
        Object data = model.getValueAt(row, column);
        
        if( column == 3 )
        {
            balance = 0.0;
            for(int x = 0; i < table.getRowCount(); i++)
                balance += table.getTableModel().getValueAt(x,3); 
	}
	 } }  );*/
  
      Panel p2 = new Panel(new GridLayout(1,2));
      p2.add(lblBalance);
      p2.add(btnCalc);

      add(scrollview, BorderLayout.NORTH);
      add(p1, BorderLayout.CENTER);
      add(p2, BorderLayout.SOUTH);
   } //close constructor
   
   /************
    * Name: getDefaultTableModel
    * Return: DefaultTableModel
    * Arguments: none
    * Desc: returns the table model for the table. 
    */
   public DefaultTableModel getDefaultTableModel()
   {
	   return dtm;
   } //close function
   
   /************
    * Name: getTable
    * Return: JTable
    * Arguments: none
    * Desc: returns a JTable for manipulation.
    */
   public JTable getTable()
   {
	   return table;
   }
   
   public void actionPerformed(ActionEvent e)
   {
	   Object source = e.getSource();
	   Vector rowdata = new Vector();
	   String space = " ";
	   String nostring = "";
	   
	   if ( source == btnAE )
	   {
	      //Makes sure that there is data in the Date field.
		   if( ( nostring.compareTo(txtDate.getText()) == 0) || (space.compareTo(txtDate.getText()) == 0) )
		   		JOptionPane.showMessageDialog(this, "There must be a date.", "No Date?", JOptionPane.ERROR_MESSAGE);
		   //Makes sure that there is data in the description field
		   if( ( nostring.compareTo(txtDescription.getText()) == 0 ) || (space.compareTo(txtDescription.getText()) == 0) )
		   		JOptionPane.showMessageDialog(this, "There must be a description.", "No Description?", JOptionPane.ERROR_MESSAGE);
		   //Makes sure that there is data in the amount field
		   if( ( nostring.compareTo(txtAmount.getText()) == 0 ) || (space.compareTo(txtAmount.getText()) == 0) )
		   		JOptionPane.showMessageDialog(this, "There must be an amount.", "Free?", JOptionPane.ERROR_MESSAGE);
		   
		   //If there is data in all the fields then it will modify the table.
		   if( ( nostring.compareTo(txtDate.getText()) != 0) & 
		       ( space.compareTo(txtDate.getText()) != 0) &  
		       ( nostring.compareTo(txtDescription.getText()) != 0 ) & 
		       ( space.compareTo(txtDescription.getText()) != 0) &
		       ( nostring.compareTo(txtAmount.getText()) != 0 ) & 
		       (space.compareTo(txtAmount.getText()) != 0) )
		   {
                      
                      rowdata.add(txtDate.getText());
                      rowdata.add(txtDescription.getText());
                      try
                      {
                        balance += Double.parseDouble(txtAmount.getText());
                        System.out.println("Balance is $" + balance);
                        rowdata.add(txtAmount.getText());
                        dtm.addRow(rowdata);
                      }
                      catch(NumberFormatException nfe)
                      {
                          JOptionPane.showMessageDialog(this, "There must be a numerical value in the amount field!", "Number Format Eexpected", JOptionPane.ERROR_MESSAGE);
                          return;
                      }
		   } //end if(nostring.compareTo(txtDate.getText()) != 0) & ...
		}//end if(source == btnAE)
	}//end of method
   
   /*public void tableChanged(TableModelEvent e) 
   {
        int row = e.getFirstRow();
        int column = e.getColumn();
        String columnName = model.getColumnName(column);
        Object data = model.getValueAt(row, column);
        
        if( column == 3 )
        {
            balance = 0.0;
            for(int x = 0; i < table.getRowCount(); i++)
                balance += table.getTableModel().getValueAt(x,3);
        }
   }*/
	
	/************
    * Name: getEditButton
    * Return: JButton
    * Arguments: none
    * Desc: returns a JButton for manipulation.
    */
	public JButton getEditButton()
        {
	   String val = null;
	   for(int x = 0; x < table.getModel().getRowCount(); x++)
	   {
	      val = (String)table.getValueAt(x, 3);
              Double.parseDouble(val);
           }
          return btnAE;
	} //close method
        
        public void setBalance(double bal)
        {
            balance = bal;
            lblBalance.setText(Double.parseString(bal));
        }
	
	public double getBalance()
	{
	   return balance;
	}
}  //close class
         

public class JCheckBook extends JFrame implements ActionListener 
{
   private JMenuBar appBar; //= new JMenuBar();
   private JMenu menuFile; //= new JMenu("File");
   private JMenuItem mnuNew; //= new JMenuItem("New");
   private JMenuItem mnuSave; //= new JMenuItem("Save");
   private JMenuItem mnuOpen; //= new JMenuItem("Open");
   private JMenuItem mnuExit; // = new JMenuItem("Exit");
   private  final JFileChooser fc = new JFileChooser();    
   private int fcRetVal; // = 0;  
   private File account;
   private BufferedReader in;
   //private Writer out;
   private JCheckPane jp = new JCheckPane();
   private int response = 0;
   private boolean isSaved = false;
   private DefaultTableModel defTableModel = jp.getDefaultTableModel();
      
   public JCheckBook() 
   {
      //Create Objects and initialize variables
      appBar = new JMenuBar();
      menuFile = new JMenu("File");
      mnuNew = new JMenuItem("New");
      mnuSave = new JMenuItem("Save");
      mnuOpen = new JMenuItem("Open");
      mnuExit = new JMenuItem("Exit");
      //jp = new JCheckPane();
      fcRetVal = 0; 
      
      //Add actionlisteners
      mnuNew.addActionListener(this);
      mnuSave.addActionListener(this);
      mnuOpen.addActionListener(this);
      mnuExit.addActionListener(this);
	  
	   //add menu options to the menu
      menuFile.add(mnuNew);
      menuFile.add(mnuSave);
      menuFile.add(mnuOpen);
      menuFile.addSeparator();
      menuFile.add(mnuExit);
      
      //add submenus to the menu bar
      appBar.add(menuFile);
      
      setJMenuBar(appBar);      
      
      getContentPane().add(jp, BorderLayout.CENTER);
      
      addWindowListener(new WindowAdapter() { public void windowClosing(WindowEvent e) { System.exit(0); } });
      
   } //close public JCheckBook()
   
   public void actionPerformed(ActionEvent e) 
   {
      Object source = e.getSource();
	   System.out.println(e.getSource().getClass().getName());
	   
	   //Open
      if(source == mnuOpen) 
      {
         fcRetVal = fc.showOpenDialog(JCheckBook.this);
         
         if( fcRetVal == JFileChooser.APPROVE_OPTION ) 
         {
	         System.out.println("fcRetVal == " + JFileChooser.APPROVE_OPTION);
             try 
             {
	             System.out.println("Opening file: " + fc.getSelectedFile());
	             in = new BufferedReader(new FileReader(account = fc.getSelectedFile()));
             } //end try
             catch(FileNotFoundException fn)
             {
                System.out.println("File not Found!");
             } //end catch
             
           
            try 
            {
	            String s = in.readLine();
	            System.out.println(s);
	            if(s.compareTo("#JCheckBook Data File") != 0)
	            {
		        JOptionPane.showMessageDialog(this, "This is not a valid file.", "Error", JOptionPane.ERROR_MESSAGE);
	            	return;
                    }//end if
            	
                    s = in.readLine();
                    if(s.indexOf("BALANCE") > 0)
                    {
                        jp.setBalance(String.copyValueOf(s, s.indexOf("="), s.length()));
                    }   
	            String s2[];
	            	            
               while(s != null) 
               {
	              //create row
	          s = in.readLine();
                  s2 = s.split(":");
                  defTableModel.addRow(s2);
                  isSaved = true;
                  
               } //end while*/
            }//end try 
            catch(IOException eio) 
            {
               System.out.println("EOF!");
            } //end catch(IOException eio)
         } //end if( fcRetVal == JFileChooser.APPROVE_OPTION )
      } //end if(source == mnuOpen)
      
         //Exit Program
         if( source == mnuExit ) 
         {
	        if( isSaved == false )
	        {
		        //response = JOptionPane.showMessageDialog(null, "File not saved, Save now?", "Save now?", JOptionPane.YES_NO_OPTION);
		        if( response == JOptionPane.YES_OPTION )
		        {
            		saveFile();
            		//response = JOptionPane.showMessageDialog(this, "Are you sure you want to quit?", "Really Quit?", JOptionPane.YES_NO_OPTION);
            		if( response == JOptionPane.YES_OPTION )
            			System.exit(0);
            	}//end if
            	else
            		System.exit(0);
            }//end if
         } //end if 
         
         //New File
         if ( source == mnuNew ) 
         {
	     	isSaved = false;
         } //endif
         
         if ( source == mnuSave ) 
         { 
	         saveFile();
         }//endif
         if( fcRetVal == JFileChooser.CANCEL_OPTION ) { }
      
   } //end public void actionPerformed(ActionEvent e)
   
   /******************************************
    * Name: saveFile()
    * return: void
    * arguments: none
    * Desc: This function does all of the output to the file.
    *******************************************/
   private void saveFile()
   {
	   //File temp = new File(fc.getSelectedFile()+".txt");
	   fc.showSaveDialog(this);
	   String data = "";
	   JTable tt = jp.getTable();
	   
	  try
	   {
            FileWriter out = new FileWriter(fc.getSelectedFile());
	   		out.write("#JCheckBook Data File\n");
            out.write("BALANCE=" + jp.getBalance() + "\n");
	         System.out.println("Row count = " + tt.getModel().getRowCount());
				for(int x = 0; x < tt.getModel().getRowCount(); x++)
				{
				   System.out.println("x = " + x);
		   			for(int y = 0; y < 3; y++)
		   			{
		   			   if( y < tt.getColumnCount()-1 )
		   			      out.write((String)tt.getModel().getValueAt(x,y) + ":");
		   			   else
		   			      out.write((String)tt.getModel().getValueAt(x,y) );			   		   
			   		}//close for(int y=0...
			   		out.write("\n");
  				}//close for(int x=0...
  				out.flush();
  				out.close();
   		}//close try
   		catch (IOException io)
   		{
	   		System.out.println("IO Error in saveFile()!");
   		}//close catch
   		isSaved = true;
   }//close saveFile()
    
  public static void main(String[] args) 
  {
      JFrame frame = new JCheckBook();
      frame.pack();
      frame.setVisible(true);
  } //end public static void main(String[] args)
}