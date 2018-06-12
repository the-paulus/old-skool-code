import com.ms.wfc.app.*;
import com.ms.wfc.core.*;
import com.ms.wfc.ui.*;
import com.ms.wfc.html.*;

/**
 * This class can take a variable number of parameters on the command
 * line. Program execution begins with the main() method. The class
 * constructor is not invoked unless an object of type 'Form1'
 * created in the main() method.
 */
public class Form1 extends Form
{
	public Form1()
	{
		super();

		// Required for Visual J++ Form Designer support
		initForm();		

		// TODO: Add any constructor code after initForm call
	}

	/**
	 * Form1 overrides dispose so it can clean up the
	 * component list.
	 */
	public void dispose()
	{
		super.dispose();
		components.dispose();
	}

	private void pictureBox1_click(Object source, Event e)
	{
		
	}

	private void Form1_click(Object source, Event e)
	{
		
		
		
	}

	private void button1_click(Object source, Event e)
	{
		label1.setText("Arn't I good?");
		button1.setText("hi");
		Form2.HideMe();
		
	}

	/**
	 * NOTE: The following code is required by the Visual J++ form
	 * designer.  It can be modified using the form editor.  Do not
	 * modify it using the code editor.
	 */
	Container components = new Container();
	Button button1 = new Button();
	Label label1 = new Label();

	private void initForm()
	{
		this.setText("Form1");
		this.setAutoScaleBaseSize(new Point(5, 13));
		this.setClientSize(new Point(300, 300));
		this.addOnClick(new EventHandler(this.Form1_click));

		button1.setLocation(new Point(112, 136));
		button1.setSize(new Point(75, 23));
		button1.setTabIndex(0);
		button1.setText("button1");
		button1.addOnClick(new EventHandler(this.button1_click));

		label1.setLocation(new Point(160, 56));
		label1.setSize(new Point(100, 23));
		label1.setTabIndex(1);
		label1.setTabStop(false);
		label1.setText("label1");

		this.setNewControls(new Control[] {
							label1, 
							button1});
	}

	/**
	 * The main entry point for the application. 
	 *
	 * @param args Array of parameters passed to the application
	 * via the command line.
	 */
	public static void main(String args[])
	{
		Application.run(new Form1());
	}
}
