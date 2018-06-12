import java.awt.*;
import java.awt.event.*;

class MenuPanel extends Panel implements ActionListener
{
	public MenuPanel()
	{
		m = new MenuBar();
		mu = new Menu();
		nw_m = new MenuItem("New Window");
		div_m = new MenuItem("-");
		mnuBlue = new MenuItem("Blue");
		mnuRed = new MenuItem("Red");
		mnuGreen = new MenuItem("Green");
		
		mu.add(nw_m);
		mu.add(div_m);
		mu.add(mnuBlue);
		mu.add(mnuRed);
		mu.add(mnuGreen);
		
		m.add(mu);
		
		/*, new Object[]{
					   "New Window",
					   nw_m,
					   null,
					   "-",
					   div_m,
					   null,
					   "Blue",
					   mnuBlue,
					   null,
					   "Red",
					   mnuRed,
					   null,
					   "Green",
					   mnuGreen,
					   null
					   }, this);*/
		
		nw_m.addActionListener(this);
		mnuBlue.addActionListener(this);
		mnuRed.addActionListener(this);
		mnuGreen.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent evt)
	{
		Object src = evt.getSource();
		Color clr = getBackground();
		
		if(src == mnuBlue) clr = Color.blue;
		
		setBackground(clr);
		repaint();
	}
	
	private MenuBar m;
	private Menu mu;
	private MenuItem nw_m, div_m, mnuBlue, mnuRed, mnuGreen;
}

class MenuFrame extends Frame
{
	public MenuFrame()
	{
		setSize(300,200);
		setTitle("Menu Color");
		add(new MenuPanel());
		//addActionListener(new WindowAdapter() { public void windowClosing(WindowEvent e) { System.exit(0); } } );
	}
}

public class MenuColor
{
	public static void main(String[] args)
	{
		Frame f = new MenuFrame();
		f.show();
	}
}
