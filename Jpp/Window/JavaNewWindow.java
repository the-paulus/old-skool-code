import java.awt.*;
import java.awt.event.*;
import java.awt.BorderLayout;
			
public class JavaNewWindow
{
		Button button;
		Frame frame;
		Label label;
		Panel panel;
	
		boolean button_clickMeMode;
	
		public JavaNewWindow()
		{
			button = new Button("Close");
			button.addActionListener(this);
			panel = new Panel();
			panel = setLayout(new BorderLayout());
			panel.setBackground(Color.blue);
			panel.add(BorderLayout.CENTER, button);
		};
	
		public void actionPreformed(ActionEvent event)
		{
			Object source = event.getSource();
			if(source == button)
			{
				if(button_clickMeMode)
				{
					button.setLabel("Closing..");
					button_clickMeMode=false;
					System.exit(0);
				}
				else
				{
					button.setLabel("Close");
					button_clickMeMode=true;
				}
			}
		}
	

		public static void main(String[] args)
		{
			frame = new NewWindow();
		}
	}