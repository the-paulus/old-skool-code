import java.awt.*;
import java.awt.event.*;

public class GUI
{
	Button button1;
	Frame frame1;
	Window window1;
	Panel panel1;
	Dialog dialog;
	boolean _ClickedMode;
	
	GUI() //begin of constructor
	{
		button1 = new Button("Button1");
		button1.addActionListener(this);
		panel1 = new Panel();
		panel1 = setLayout(new BorderLayout());
		panel1 = setBackground(Color.cyan);
		getContentPane().add(panel);
		panel.add(BorderLayout.CENTER, button1);
	};
	
	public void actionPerformed(ActionEvent event)
	{
		Object source = event.getSource();
		if(source==button)
		{
			if(_clickMeMode)
			{
				button1.setLabel("Clicked!");
				_clickMeMode = false;
			}
			else
			{
				button1.setLabel("Not Clicked!");
				_clickMeMode = true;
			}
				
	public static void main(String[] args)
	{
		frame = new GUI();
		window = new Window(frame);
	}
}
