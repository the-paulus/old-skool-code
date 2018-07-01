import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.*;
import java.io.*;
import java.awt.*;

class FileIOFrame extends Frame implements ActionListener
{
	Label text;
	Button button;
	Panel panel;
	TextField textField;
	private boolean _clickMeMode = true;
	
	FileIOFrame()
	{
		text = new Label("Text to save to file: ");
		button = new Button("Click Me");
		button.addActionListener(this);
		textField = new TextField(30);
		panel = new Panel();
		panel.setLayout(new BorderLayout());
		panel.setBackground(Color.white);
		add(panel);
		panel.add(BorderLayout.NORTH, text);
	}
	
	public void actionPerformed(ActionEvent evt)
	{
		Object src = evt.getSource();
		if(src == button)
		{
			String s = null;
			if(_clickMeMode)
			{
				try
				{
					String text = textField.getText();
					byte b[] = text.getBytes();
					String outputFileName = System.getProperty("user.home", File.separatorChar + "home" + File.separatorChar + "zelda") + File.separatorChar + "text.text";
					
					FileOutputStream out = new FileOutputStream(outputFileName);
					out.write(b);
					out.close();
				}
				catch(java.io.IOException e)
				{
					System.out.println("Error can not write to file!");
				}
				
				try
				{
					String inputFileName = System.getProperty("user.home", File.separatorChar + "home" + File.separatorChar + "zelda") + File.separatorChar + "text.txt";
					File inputFile = new File(inputFileName);
					FileInputStream in = new FileInputStream(inputFIle);
					byte bt[] = new byte[(int)inputFile.length()];
					in.read(bt);
					s = new String(bt);
					in.close();
				}
				
				catch(java.ioIOException e)
				{
					System.out.println("Cannot read from text.txt");
				}
				
				//Clear text field
				textField.setText("");
			
				//Display text read from file
				text.setText("Text retrived from file: ");
				textField.setText(s);
				button.setText("Click");
				_clickMeMode = false;
			}
			else
			{
				//save text to file
				text.setText("Text to save to file: ");
				textField.setText("");
				button.setText("Click");
				_clickMeMode = true;
			}
		}
	}
}
	
public class FileIO
{
	public static void main(String[] args)
	{
		FileIOFrame f = new FileIOFrame();
		f.setTitle("File IO");
		f.setSize(300,200);
		f.add(new WindowAdapter() { public void windowClosing(WindowEvent e) { System.exit(0); } });
		f.show();
	}
}
