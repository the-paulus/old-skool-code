import com.ms.wfc.app.*;
import com.ms.wfc.core.*;
import com.ms.wfc.ui.*;
import com.ms.wfc.html.*;

/**
 * This class can take a variable number of parameters on the command
 * line. Program execution begins with the main() method. The class
 * constructor is not invoked unless an object of type 'Form2'
 * created in the main() method.
 */
public class Form2 extends Form
{
	public Form2()
	{
		super();

		// Required for Visual J++ Form Designer support
		initForm();		

		// TODO: Add any constructor code after initForm call
	}

	/**
	 * Form2 overrides dispose so it can clean up the
	 * component list.
	 */
	public void dispose()
	{
		super.dispose();
		components.dispose();
	}

	private void label1_click(Object source, Event e)
	{
		label1.ClassInfo.text("khlk");
	}

	/**
	 * NOTE: The following code is required by the Visual J++ form
	 * designer.  It can be modified using the form editor.  Do not
	 * modify it using the code editor.
	 */
	Container components = new Container();
	Label label1 = new Label();

	private void initForm()
	{
		this.setText("Form2");
		this.setAutoScaleBaseSize(new Point(5, 13));
		this.setClientSize(new Point(300, 300));

		label1.setLocation(new Point(88, 72));
		label1.setSize(new Point(144, 64));
		label1.setTabIndex(0);
		label1.setTabStop(false);
		label1.setText("label1");
		label1.addOnClick(new EventHandler(this.label1_click));

		this.setNewControls(new Control[] {
							label1});
	}

	/**
	 * The main entry point for the application. 
	 *
	 * @param args Array of parameters passed to the application
	 * via the command line.
	 */
	public static void main(String args[])
	{
		Application.run(new Form2());
	}
}
