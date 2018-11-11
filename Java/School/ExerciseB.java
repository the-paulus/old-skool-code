// Paul Lyon
// Exercise B
// 1/22/03

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExerciseB extends JFrame implements ActionListener{
   private JPanel p, p2;
   private JRadioButton rC;
   private JRadioButton rF;
   private JLabel l;
   private ButtonGroup bg;
   private JTextField txt;
   private JButton bOk, bCancel;
   private BorderLayout lo;
   final int CELCIUS = 1;
   final int FAHRENHEIT = 2;
   private int t;

   ExerciseB() {
      p = new JPanel(new GridLayout(5,1));
      p2 = new JPanel(new GridLayout(1,2));
      rC = new JRadioButton("Celcius -> Fahrenheit");
      rF = new JRadioButton("Fahrenheit -> Celcius");
      l = new JLabel("How to you want me to convert the Temperature?");
      bg = new ButtonGroup();
      txt = new JTextField(4);
      bOk = new JButton("Ok");
      bCancel = new JButton("Cancel");

      //Set Mnemonics for Radio Buttons
      rC.setMnemonic(KeyEvent.VK_C);
      rF.setMnemonic(KeyEvent.VK_F);

      //Add action listeners
      rF.addActionListener(this);
      rC.addActionListener(this);
      bOk.addActionListener(this);
      bCancel.addActionListener(this);

      //Add radio buttons to button group.
      bg.add(rC);
      bg.add(rF);

      //add buttons to their own panel.
      p2.add(bOk);
      p2.add(bCancel);

      //add components to main panel.
      p.add(l);
      p.add(rC);
      p.add(rF);
      p.add(txt);
      p.add(p2);

      getContentPane().add(p);
      addWindowListener(new WindowAdapter(){public void windowClosting(WindowEvent e){System.exit(0);} } );
      setSize(300,200);

    } //close ExerciseB()

    public void convert(int cw)
    {
      int temp = 0;

      if(cw == FAHRENHEIT) {
         temp = (Integer.parseInt(txt.getText()) - 32) * 5/9;
         JOptionPane.showMessageDialog(this, "The temperature you entered in Celcius is " + temp, "Fahrenheit -> Celcius", JOptionPane.INFORMATION_MESSAGE);
      } //end if(cw == FAHRENHEIT)

      if(cw == CELCIUS) {
         temp = (9/5 * Integer.parseInt(txt.getText())) + 32;
         JOptionPane.showMessageDialog(this, "The temperature you entered in Fahrenheit is " + temp, "Fahrenheit -> Celcius", JOptionPane.INFORMATION_MESSAGE);
      } //end if(cw == CELCIUS)
    } //end public void convert(int cw)

    public void actionPerformed(ActionEvent e)
    {

      Object src = e.getSource();

      if( src == null )
         JOptionPane.showMessageDialog(null, "The value that you gave was invalid.", "Error!", JOptionPane.ERROR_MESSAGE);
      else if( src == rC)
         t = CELCIUS;
      else if( src == rF)
         t = FAHRENHEIT;
      else if( src == bOk)
         convert(t);
      else if( src == bCancel)
         System.exit(0);
    } //end public void actionPerformed(ActionEvent e)

   public static void main(String args[]) {
      JFrame f = new ExerciseB();
      f.show();

     } //end static void main(String args[])
} //end public class ExerciseB extends JFrame implements ActionListener