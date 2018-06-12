import java.awt.event.*;
import java.awt.*;
import java.awt.BorderLayout;

class JavaFrame extends Frame
{
	Frame java_Frame;
	Label java_label;
	Button java_button;
	Panel java_panel;
	private boolean _clickMeMode = true;
	public JavaFrame()
	{
		java_label = new Label("Click the button to close this.");
		java_label.setLocation(250,250);
  		//java_button.setLabel("Close");
		java_button = new Button("Close");
		java_panel = new Panel();
		java_panel.setLayout(new BorderLayout());
		java_panel.setBackground(Color.green);
		//getContentPane().add(java_panel);
		java_Frame = new Frame();
		java_Frame.setTitle("Title of Frame");
		java_Frame.setSize(500,500);
		java_panel.add(BorderLayout.CENTER, java_label);
	}
	
	public void actionPreformed(ActionEvent e)
	{
		Object source = e.getSource();
		if(source == java_button)
		{
			String s = null;
			if(_clickMeMode)
			{
				System.exit(0);
				_clickMeMode = false;
			}
			else
			{
				_clickMeMode = true;
			}
		}
	}				
}

public class FrameExample
{	
	public static void main(String[] args)
	{
		JavaFrame NewJavaFrame = new JavaFrame();
		WindowListener l = new WindowAdapter()
		{
			public void WindowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		};
		NewJavaFrame.addWindowListener(l);
		NewJavaFrame.pack();
		NewJavaFrame.setVisible(true);
		NewJavaFrame.setSize(500,500);
		NewJavaFrame.java_button.setVisible(true);
		NewJavaFrame.java_label.setVisible(true);
	}
}
