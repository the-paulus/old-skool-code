import java.awt.*;
import java.awt.event.*;

public class GUI12 extends Panel implements ActionListener
{
	public GUI12()
	{
		yellowbutton = new Button("Yellow");
		bluebutton = new Button("Blue");
		redbutton = new Button("Red");
		
		add(yellowbutton);
		add(bluebutton);
		add(redbutton);
		
		yellowButton.addActionListener(this); 
		blueButton.addActionListener(this); 
		redButton.addActionListener(this);
	}
	
	public void actionPreformed(ActionEvent evt)
	{
		Object src = evt.getSource();
		Color colr = getBackground();
		if(src==yellowbutton) colr = Color.yellow;
		else if (src == blueButton) colr = Color.blue;
		else if (src == redButton) colr = Color.red;
		setBackground(colr);
		repaint();
	}
	
	private Button yellowButton;
	private Button blueButton;
	private Button redButton; 
	
}

class GUI11 extends Frame
{
	public GUI11()
	{
		setTitle("Title");
		setSize(300,300);
		addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent e)
				{
			System.exit(0);
			}
			});
		
	Container contentPane = getContentPane();
		contentPane.add(new GUI11());
	}
}

public class GUI1
{  public static void main(String[] args)
   {  Frame frame = new GUI12();
      frame.show();  
   }
}