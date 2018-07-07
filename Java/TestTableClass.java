import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.util.*;

public class TestTableClass extends JFrame
{
   public TestTableClass()
   {
      JPanel p = new JPanel();
      Vector columnNames = new Vector();
      columnNames.add(new String("A"));
      columnNames.add(new String("B"));
      Vector data = new Vector();
      data.add(new Integer(100));
      JTable jt = new JTable(data, columnNames);
      
      JScrollPane scroll = new JScrollPane();
      
      scroll.getViewport().add(jt);
     
      p.add(scroll, BorderLayout.CENTER);
      getContentPane().add(p,BorderLayout.CENTER);
   }
   
   public static void main( String[] args) {
      JFrame f = new TestTableClass();
      f.show();
   }
}