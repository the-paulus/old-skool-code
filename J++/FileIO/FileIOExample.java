import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.*;
import java.io.*;
import java.awt.*;

class FileIOExamplePanel extends Panel implements ActionListener
{
	Label lbl1, lbl2;
	Button btn1, btn2;
	TextField txtf1, txtf2;
	public FileIOExamplePanel()
	{
		lbl1 = new Label("Enter Some text: ");
		lbl2 = new Label("Enter the save file: ");
		btn1 = new Button("Save");
		btn2 = new Button("Recall");
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		txtf1 = new TextField(45);
		txtf2 = new TextField(45);
		
		Container c1;
		Container c2;
			
		c1.add(lbl1);
		c1.add(txtf1);
		c1.add(btn1);
		
		c2.add(lbl2);
		c2.add(btn2);
		c2.add(txtf2);
		
		add(c1);
		add(c2);
	}
	
	public void actionPerformed(ActionEvent evt)
	{
		Object event_p = evt.getSource();
		if(event_p == btn1)
		{
			try
			{
				String TEXT = txtf1.getText();
				String SAVEFILE = txtf2.getText();
				
				FileOutputStream out = new FileOutputStream(SAVEFILE);
				out.write();
				out.close();
			}
			catch(java.io.IOException e)
			{
				System.out.println("Error saving file!");
			}
		}
		else if(event_p == btn2)
		{
			try
			{
				FileInputStream inFile = new FileInputStream(txtf2);
				//byte bt[] = new byte[(int)inFile.
				String s = inFile.read();
				inFile.close();
			}
			catch(java.io.IOException e)
			{
				System.out.println("Can not read file!");
			}
			
			txtf1.setText("");
			txtf1.setText(s);
		}
	}
}

			class FileIOExampleFrame extends Frame
			{
				FileIOExampleFrame()
				{
					setSize(300,200);
					setTitle("File IO Example");
					add(c1);
					add(c2);
				}
			}
				
public class FileIOExample
{
	public static void main(String[] args)
	{
		Frame f = new FileIOExampleFrame();
			f.show();
	}
}
