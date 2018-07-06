import java.awt.*;
import java.awt.event.*;

class btPanel extends Panel implements ActionListener
{
	public btPanel()
	{
		y = new Button("Yellow");
		b = new Button("Blue");
		r = new Button("Red");
		
		add(y);
		add(b);
		add(r);
		
		y.addActionListener(this);
		b.addActionListener(this);
		r.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent evt)
	{  
		Object source = evt.getSource();
		Color color = getBackground();
		if (source == y) color = Color.yellow;
		else if (source == b) color = Color.blue;
		else if (source == r) color = Color.red;
		setBackground(color);
		repaint();
	}
	
	private Button y;
	private Button b;
	private Button r; 
}

class btFrame extends Frame
{  public btFrame()
   {  setTitle("ButtonTest");
      setSize(300, 200);
      addWindowListener(new WindowAdapter()
         {  public void windowClosing(WindowEvent e)
            {  System.exit(0);
            }
         } );
	  
	  add(new btPanel());
	}
}

public class bt
{  public static void main(String[] args)
   {  Frame frame = new btFrame();
      frame.show();  
   }
}
