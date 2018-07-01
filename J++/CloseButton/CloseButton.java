import java.awt.*;
import java.awt.event.*;

public class CloseButton extends Frame
{
	Frame _frame;
	Panel _panel;
	Button _button;
	Panel _panel1;
	boolean button_clicked = true;
	Frame NewWindow;
	
	CloseButton()
	{
		_frame = new Frame();
		_panel = new Panel();
		_button = new Button("Close Me!");
		_panel.setLayout(new BorderLayout());
		_panel.setBackground(Color.green);
		_panel1 = new Panel();
		_button.setSize(20,20);
		//_panel1.setSize(20,20);
		//_panel1.add(_button);
		//_button.addActionListener(this);
		//_panel.add(BorderLayout.CENTER, _panel1);
	}
	
	public void actionPreformed(ActionEvent e)
	{
		Object Object_Source = e.getSource();
		
		if(Object_Source == _button)
		{
			if(button_clicked)
			{
				System.exit(0);
			}
		}
	}
		
	public static void main(String[] args)
	{
		CloseButton NewWindow = new CloseButton();
		NewWindow.pack();
		NewWindow.add(NewWindow._button);
		NewWindow._button.setVisible(true);
		NewWindow._button.setSize(20,20);
		NewWindow.setVisible(true);
	}
}
