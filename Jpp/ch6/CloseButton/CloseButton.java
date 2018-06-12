import java.awt.*;
import java.awt.event.*;

class CloseButton extends Frame
{
	Frame _Frame;
	Button _Button;
	Panel _Panel;
	
	private boolean button_clicked = true;
	CloseButton()
	{
		_Frame = new Frame();
		_Button = new Button("Close Me!");
		_Panel = new Panel();
		//_Panel.setLayout(LayoutManager());
		_Button.setSize(20,20);
		_Frame.setSize(200,200);
	}
	
	public void actionPreformed(ActionEvent event)
	{
		Object source = event.getSource();
		if(source == _Button)
		{
			if(button_clicked)
			{
				System.exit(0);
			}
		}
	}
	
			
	public static void main(String[] args)
	{
		CloseButton MyFrame = new CloseButton();
		MyFrame.setVisible(true);
		MyFrame.setSize(200,200);
		Button Button1 = new Button("Close Me!");
		Dimension ButtonSize = new Dimension(20, 20);
		Button1.setSize(ButtonSize);
		MyFrame.add(Button1);
		MouseListener l = new MouseAdapter(
		public void click(MouseEvent e)
										  {
											  System.exit(0);
										  };);
		Button1.addMouseListener(l);
		MyFrame.pack();
	}
}
