//Paul Lyon

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