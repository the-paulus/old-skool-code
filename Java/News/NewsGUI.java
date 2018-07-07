/*
 * NewsGUI.java
 *
 * Created on November 1, 2003, 8:27 PM
 */

/**
 *
 * @author  paulus
 */
 
 import java.util.*;
 import javax.swing.*;
 import java.awt.*;
 import java.awt.event.*;
 import java.text.*;
 
public class NewsGUI extends javax.swing.JFrame implements java.awt.event.WindowListener {

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_date;
    private javax.swing.JLabel lbl_headline;
    private javax.swing.JLabel lbl_body;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea ta_body;
    private javax.swing.JTextArea ta_output;
    private javax.swing.JTextField tf_id;
    private javax.swing.JTextField tf_date;
    private javax.swing.JTextField tf_headline;
	private javax.swing.JButton btn_edit, btn_del;
    // End of variables declaration//GEN-END:variables
    private MasterController newsdb = new MasterController();
    private Date current_date = new Date();
    
    /** Creates new form NewsGUI */
    public NewsGUI() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents() {//GEN-BEGIN:initComponents
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta_output = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        lbl_id = new javax.swing.JLabel();
        tf_id = new javax.swing.JTextField("123");
        lbl_date = new javax.swing.JLabel();
        tf_date = new javax.swing.JTextField("Oct 31, 2003 11:30:00 PM");
        lbl_headline = new javax.swing.JLabel();
        tf_headline = new javax.swing.JTextField("Extra!");
        lbl_body = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_body = new javax.swing.JTextArea("This is the body, blah!");
        btn_add = new javax.swing.JButton();
		btn_del = new javax.swing.JButton();
		btn_edit = new javax.swing.JButton();

		tf_id.addKeyListener(new java.awt.event.KeyAdapter() { 
			public void keyPressed(java.awt.event.KeyEvent evt) {
				Retrieve(evt);
			}
		});
		
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        jScrollPane2.setMinimumSize(new java.awt.Dimension(400, 400));
        jScrollPane2.setPreferredSize(new java.awt.Dimension(400, 300));
        jScrollPane2.setViewportView(ta_output);

        jPanel1.add(jScrollPane2);

        getContentPane().add(jPanel1, java.awt.BorderLayout.SOUTH);

        jPanel2.setLayout(new java.awt.GridLayout(4, 2));

        lbl_id.setText("News ID:");
        jPanel2.add(lbl_id);

        jPanel2.add(tf_id);

        lbl_date.setText("Date:");
        jPanel2.add(lbl_date);

        jPanel2.add(tf_date);

        lbl_headline.setText("Headline:");
        jPanel2.add(lbl_headline);

        jPanel2.add(tf_headline);

        lbl_body.setText("Body:");
        jPanel2.add(lbl_body);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(3, 20));
        jScrollPane1.setViewportView(ta_body);

        jPanel2.add(jScrollPane1);

        getContentPane().add(jPanel2, java.awt.BorderLayout.NORTH);

        btn_add.setText("add");
        btn_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Add(evt);
            }
        });
		
		btn_edit.setText("edit");
		btn_edit.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				Edit(evt);
			}
		});
		
		btn_del.setText("Delete");
		btn_del.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				Delete(evt);
			}
		});			
		
        getContentPane().add(btn_add, java.awt.BorderLayout.WEST);
		getContentPane().add(btn_edit, java.awt.BorderLayout.CENTER);
		getContentPane().add(btn_del, java.awt.BorderLayout.EAST);
        pack();
    }//GEN-END:initComponents

    private void Add(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Add
          ArrayList al;
		  ArrayList data = new ArrayList();
		  data.add(tf_id.getText());
		  data.add(tf_headline.getText());
		  data.add(tf_date.getText());
		  data.add(ta_body.getText());
		//newsdb.addEntry(tf_id.getText(), tf_headline.getText(), tf_date.getText(), ta_body.getText());
		Object pevt = newsdb.processEvent(NewsConstants.ADD_EVENT, data);
		al = newsdb.processEvent(NewsConstants.RETRIEVE_EVENT, data);
		ta_output.append("ID:\t\t"+al.get(0)+"\nHEADLINE:\t\t"+al.get(1)+"\nBODY:\t\t"+al.get(2)+"\nDATE:\t\t"+al.get(3)+"\n\n");   
		tf_id.setText("");
		tf_headline.setText("");
		ta_body.setText("");
		tf_date.setText("");
		// Add your handling code here:
		
    }//GEN-LAST:event_Add
	
	private  void Delete(java.awt.event.MouseEvent evt) {
		ArrayList data = new ArrayList();
		data.add(tf_id.getText());
		data.add(tf_headline.getText());
		data.add(tf_date.getText());
		data.add(ta_body.getText());
		Object pevt = newsdb.processEvent(NewsConstants.DELETE_EVENT, data);
		//System.out.println("ActinoCommand: " + evt.getActionCommand());
		//newsdb.deleteEntry(tf_id.getText());
		tf_id.setText("");
		tf_headline.setText("");
		ta_body.setText("");
		tf_date.setText("");
	}
	
	private void Retrieve(java.awt.event.KeyEvent evt)
	{
		ArrayList al = null;
		ArrayList data = new ArrayList();
		data.add(tf_id.getText());
		data.add(tf_headline.getText());
		data.add(tf_date.getText());
		data.add(ta_body.getText());
		
		if( evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER)
		{
			al = newsdb.processEvent(NewsConstants.RETRIEVE_EVENT, data);
		
			if( al != null )
			{
				tf_id.setText((String)al.get(NewsDB.ID));
				tf_date.setText(al.get(NewsDB.DATE).toString());
				tf_headline.setText((String)al.get(NewsDB.HEADLINE));
				ta_body.setText((String)al.get(NewsDB.BODY));
			}
			else
			{
			}
		}
	} 				
				
	
	private void Edit(java.awt.event.MouseEvent evt)
	{
		ArrayList al = null;
		ArrayList data = new ArrayList();
		data.add(tf_id.getText());
		data.add(tf_headline.getText());
		data.add(tf_date.getText());
		data.add(ta_body.getText());
		
		al = (ArrayList)newsdb.processEvent(NewsConstants.EDIT_EVENT, data);
		System.out.println("GUI, EDIT -2");
		ta_output.append("\n\n***** EDIT ****\nID:\t\t" + al.get(NewsConstants.ID_FIELD) + "\nHeadline:\t\t" + al.get(NewsConstants.HEADLINE_FIELD) + "\nDate:\t\t" + al.get(NewsConstants.DATE_FIELD) + "\nBody:\t\t" + al.get(NewsConstants.BODY_FIELD) + "\n");
		
		/*String id = tf_id.getText();
		String headline = tf_headline.getText();
		String date = tf_date.getText();
		String body = ta_body.getText();
		ArrayList al;
		newsdb.editEntry(id, headline, date, body);*/
		/*System.out.println("GUI, EDIT -1, id = " + id);
		newsdb.editNewsItem(id, headline,body,date);
		System.out.println("GUI, EDIT -2");
		al = newsdb.getNewsItemByID(id);
		System.out.println("GUI, EDIT -2");
		ta_output.append("\n\n***** EDIT ****\nID:\t\t" + al.get(NewsDB.ID) + "\nHeadline:\t\t" + al.get(NewsDB.HEADLINE) + "\nDate:\t\t" + al.get(NewsDB.DATE) + "\nBody:\t\t" + al.get(NewsDB.BODY) + "\n");*/
	}

    private void tf_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_dateActionPerformed
        // Add your handling code here:
    }//GEN-LAST:event_tf_dateActionPerformed
    public void windowClosing(WindowEvent e)
    {
    }
    public void windowDeactivated(WindowEvent e)
    {
    }
    public void windowDeiconified(WindowEvent e) 
    {}
    
    public void windowActivated(WindowEvent e)
    {
    }
    public void windowOpened(WindowEvent e)
    {
    }
    public void windowClosed(WindowEvent e)
    {
    }
    public void windowIconified(WindowEvent e) 
    {
    }     
        
    /** Exit the Application */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm
    

    
    
}
