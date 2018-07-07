import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.io.*;
import java.util.*;

public class Test extends JFrame
{
   private JScrollPane scrollview;
   private TableColumn colAmount = new TableColumn();
   private TableColumn colDate = new TableColumn();
   private TableColumn colDescription = new TableColumn();
   private Vector data = new Vector();
   private Vector column = new Vector();
   //private JTable table = new JTable();
   
   public Test() 
   {
      DefaultTableModel model = new DefaultTableModel();
      model.addColumn(new String("A"));
      model.addColumn(new String("B"));
      model.addRow(new Object[]{"a","b"});
       
      JTable table = new JTable(model);
      scrollview = new JScrollPane(table);
      getContentPane().add(scrollview, BorderLayout.CENTER);
   }
   
   public static void main(String[] args) 
   {
      Test frame = new Test();
      frame.pack();
      frame.setVisible(true);
   } //end public static void main(String[] args)
}