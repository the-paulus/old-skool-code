import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.io.*;

class MyFrame extends Frame implements ActionListener
{
	Frame Java_Frame;
	Button Java_Button;
	Panel Java_Panel;
	Label Java_Label;
	private boolean _clickMeMode = true;
									  
	public MyFrame()
	{
		Java_Label = new Frame("Click the button to close the window");
		Java_Button = new Button();
		Java_Panel = new Panel();
		Java_Panel.setLayout(new BorderLayout());
		Java_Panel.setBackground(Color.black);
		getContentPane().add(panel);
		Java_Panel.add(BorderLayout.NORTH, Java_Label);
	}
	
	public void actionPerformed(ActionEvent event)
	{
		Object source = event.getSource();
		if(source==Java_Button)
		{
			String s = null;
			if(_clickMeMode)
			{
				_clickMeMode = false;
			}
			else
			{
				_clickMeMode = true;
			}
		}
}

public class Button
{	
	public static void main(String[] args)
	{
		MyFrame Frame1 = new MyFrame();
		/*WindowListener l = new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
			};*/
	Frame1.addWindowListener(l);
	Frame1.pack();
	Frame1.setVisible(true);				  
	}
}