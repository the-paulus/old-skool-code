import java.awt.*;
import java.awt.event.*;

class SImpleFrame extends Frame
{
	Frame _frame;
	Button _button;
	Panel _panel;
	
	SImpleFrame()
	{
		_panel = new Panel();
		_panel.setLayout(new BorderLayout());
		_panel.setBackground(Color.black);
		_button = new Button("Close");
	}
	
	public static void main(String[] args)
	{
		SImpleFrame _frame = new SImpleFrame();
		Button button1 = new Button("Close Me!");
		_frame.pack();
		_frame.setVisible(true);
		_frame.add(button1);
		button1.setSize(20,20);
		_frame.setBackground(Color.green);
	}
}
