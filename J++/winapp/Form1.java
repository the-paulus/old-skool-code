import com.ms.wfc.app.*;
import com.ms.wfc.core.*;
import com.ms.wfc.ui.*;
import com.ms.wfc.html.*;

/**
 * This class can take a variable number of parameters on the command
 * line. Program execution begins with the main() method. The class
 * constructor is not invoked unless an object of type 'Form1' is
 * created in the main() method.
 */
public class Form1 extends Form
{
	public Form1()
	{
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

	/**
	 * NOTE: The following code is required by the Visual J++ form
	 * designer.  It can be modified using the form editor.  Do not
	 * modify it using the code editor.
	 */
	Container components = new Container();

	private void initForm()
	{
		this.setSize (new Point(300,300));
		this.setText ("Form1");
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
