import java.awt.*;
import java.awt.event.*;

public class FrameButton
{
	Frame frame;
	Button button;
	Panel panel;
	private boolean Button_clicked;
	
	FrameButton()
	{
		frame = new Frame("Close Button Example");
		button = new Button("Close Me!");
		//button.addActionListener(void);
		panel = new Panel();
		panel.setLayout(new BorderLayout());
		panel.setBackground(Color.gray);
		//getContentPane().add(panel);
		panel.add(BorderLayout.CENTER, button);
	};
	
	public void actionPreformed(ActionEvent event)
	{
		Object source = event.getSource();
		if(source == button)
		{
			if(Button_clicked)
			{
				button.setLabel("Closing..");
				Button_clicked = false;
				System.exit(0);
			}
			else
			{
				button.setLabel("Close Me!");
				Button_clicked = true;
			}
		}
	}
		
	public static void main(String[] args)
	{
		FrameButton frame1 = new FrameButton();
		//WindowListener l = new WindowAdapter();
		
		//frame1.addWindowListener(1);
		//frame1.pack();
		//ame1.setVisible(true);											   
	}
}
