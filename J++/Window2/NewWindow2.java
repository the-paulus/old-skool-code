import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.*;
import java.awt.*;

public class NewWindow2 extends Frame implements ActionListener 
{
	Button WButton;
	Frame WFrame;
	Panel WPanel;
	private boolean _clickMeMode;
	
	public NewWindow2()
	{
		WButton = new Button("Close me!");
		WButton.addActionListener(this);
		WPanel = new Panel(new BorderLayout());
		WPanel.setBackground(Color.blue);
		WPanel.add(BorderLayout.CENTER, WButton);
	};
	
	public void actionPreformed(ActionEvent e)
	{
		Object source = e.getSource();
		if(source == WButton)
		{
			if(_clickMeMode)
			{
				WButton.setLabel("Closing..");
				System.exit(0);
				_clickMeMode = false;
			}
			else
			{
				WButton.setLabel("Close me");
				_clickMeMode = true;
			}
		}
	}
	
	public static void main(String[] args)
	{
		NewWindow2 frame = new NewWindow2();
		frame.setTitle("Title");
		WindowListener l = new WindowAdapter() {
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
			};
		
		frame.addWindowListener(l);
		frame.pack();
		frame.setVisible(true);
	}
}
