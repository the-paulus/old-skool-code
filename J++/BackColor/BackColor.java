import java.awt.*;
import java.awt.event.*;

class BCPanel extends Panel implements ActionListener
{
	public BCPanel()
	{
		lblRed = new Label("Red");
		lblBlue = new Label("Blue");
		lblGreen = new Label("Green");
		CHANGE = new Button("Change Color");
		RED = new TextField(5);
		BLUE = new TextField(5);
		GREEN = new TextField(5);
		
		add(lblRed);
		add(lblBlue);
		add(lblGreen);
		
		add(RED);
		add(BLUE);
		add(GREEN);
	}
	
	public void actionPerformed(ActionEvent evt)
	{
		Object src = evt.getSource();
		if(src == CHANGE)
		{
			
	private TextField RED, BLUE, GREEN;
	private Label lblRed, lblBlue, lblGreen;
	private Button CHANGE;
	
public class BackColor
{
	public static void main(String[] args)
	{
	}
}
