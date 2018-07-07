import java.awt.*;
import javax.swing.*;
import javax.swing.text.*;/*
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;*/

class NumberField extends JTextField
{
    public NumberField(int cols)
    {
	super(cols);
    }

    protected Document createDefaultModel()
    {
	return new NumberDocument();
    }
    static class NumberDocument extends PlainDocument 
    {
	public void insertString(int offs, String str, AttributeSet a) throws BadLocationException 
	{
	    if (str == null) {
		return;
	    }
	    char[] tmp = str.toCharArray();
	    for (int i = 0; i < tmp.length; i++) 
		{
		    if(Character.getType(tmp[i]) != Character.DECIMAL_DIGIT_NUMBER)
			{
			    for(int ii=0; ii<tmp.length; ii++)
				tmp[ii] = '\0';
			}
                  }
                  super.insertString(offs, new String(tmp), a);
	}
    }
}

class NorthPanel extends JPanel
{
    public NorthPanel()
    {
	mb = new JMenuBar();
	mOptions = new JMenu("Options");
	mQuizBy = new JMenu("Quiz By");

	grp = new ButtonGroup();
	aNum = new JRadioButtonMenuItem("Atomic Number", true);
	symbol  = new JRadioButtonMenuItem("Symbol");
	eName = new JRadioButtonMenuItem("Name");
	grp.add(aNum);
	grp.add(symbol);
	grp.add(eName);

	mQuizBy.add(aNum);
	mQuizBy.add(symbol);
	mQuizBy.add(eName);

	mOptions.add(new JMenuItem("New"));
	mOptions.add(new JMenuItem("Quit"));
	mOptions.add(new JMenuItem("Show Score"));
	mOptions.addSeparator();
	mOptions.add(mQuizBy);
	mOptions.addSeparator();
	mOptions.add(new JMenuItem("Exit"));

	mb.add(mOptions);

	setLayout(new BorderLayout());
	add(mb, BorderLayout.NORTH);

	add(aNumField = new JTextField(5)/*NumberField(5)*/, BorderLayout.WEST);
	add(aMassField = new JTextField(5)/* NumberField(5)*/, BorderLayout.EAST);
    }

    private JTextField /*NumberField*/ aNumField;
    private JTextField /*NumberField*/ aMassField;
    private JMenuBar mb;
    private JMenu mOptions;
    private JMenu mQuizBy;
    private ButtonGroup grp;
    private JRadioButtonMenuItem aNum;
    private JRadioButtonMenuItem symbol;
    private JRadioButtonMenuItem eName;
}


class ElementFrame extends javax.swing.JFrame
{
   public ElementFrame()
    {
	 np = new NorthPanel();
	 getContentPane().setLayout(new BorderLayout());
	 getContentPane().add(np, BorderLayout.NORTH);
	
	 tf = new JTextField(3);
	 tf.setFont(new Font("Times", Font.BOLD, 20));
	 getContentPane().add(tf, BorderLayout.CENTER);
	 getContentPane().add(new JLabel(), BorderLayout.EAST);
	 getContentPane().add(new JLabel(), BorderLayout.WEST);
	 setSize(100,100);
	 setTitle("Suck");
    }
    
    private NorthPanel np;
    private JTextField tf;

}

public class JElementQuiz
{
   public static void main(String[] args)
     {
	ElementFrame f = new ElementFrame();
	f.show();
     }
}
