import java.awt.*;
import java.awt.event.*;

public class mnuColor extends Frame implements ActionListener
{
	public mnuColor()
	{
		setSize(300,200);
		setTitle("Title");
		addWindowListener(new WindowAdapter() { public void windowClosing(WindowEvent e) { System.exit(0); } } );
		
		MenuBar mnuBar = new MenuBar();
		setMenuBar(mnuBar);
		
		Menu mnuFile = new Menu("File");
		mnuFile.addActionListener(this);
		
		MenuItem mnuNew = new MenuItem("New Window");
		MenuItem mnuBlue = new MenuItem("Blue");
		MenuItem mnuBlack = new MenuItem("Black");
		
		mnuFile.add(mnuNew);
		mnuFile.add(mnuBlue);
		mnuFile.add(mnuBlack);
		
		mnuBar.add(mnuFile);

	}
	
	public void actionPerformed(ActionEvent evt)
	{
		Object o = evt.getSource();
		Color co = getBackground();
		
		if(o == mnuBlue) co = Color.blue;
		if(o == mnuBlack) co = Color.black;
		
		setBackground(co);
		repaint();
	}
	
	private MenuItem mnuBlue, mnuBlack;
	public static void main(String[] args)
	{
		Frame f = new mnuColor();
		f.show();
	}
}
