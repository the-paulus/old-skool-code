import com.ms.wfc.app.*;
import com.ms.wfc.core.*;
import com.ms.wfc.ui.*;
import com.ms.wfc.html.*;
import java.net.*;

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

	private void Form1_click(Object source, Event e)
	{
		
	}

	private void button1_click(Object source, Event e)
	{
		String ADDRESS = txtAddress.getText();
		
		Socket s = new Socket(ADDRESS, 23, true);
		
		txtReceive.setText("\nConnecting to: " + ADDRESS + " on port " + PORT + "\n");
	}

	/**
	 * NOTE: The following code is required by the Visual J++ form
	 * designer.  It can be modified using the form editor.  Do not
	 * modify it using the code editor.
	 */
	Container components = new Container();
	GroupBox groupBox1 = new GroupBox();
	Label label1 = new Label();
	Label label2 = new Label();
	Edit txtAddress = new Edit();
	Edit txtPort = new Edit();
	GroupBox groupBox2 = new GroupBox();
	Edit txtReceive = new Edit();
	Label label3 = new Label();
	Edit txtSend = new Edit();
	Button btnSend = new Button();
	Button button1 = new Button();

	private void initForm()
	{
		this.setText("Form1");
		this.setAutoScaleBaseSize(new Point(5, 13));
		this.setClientSize(new Point(354, 290));
		this.addOnClick(new EventHandler(this.Form1_click));

		groupBox1.setLocation(new Point(8, 8));
		groupBox1.setSize(new Point(336, 40));
		groupBox1.setTabIndex(0);
		groupBox1.setTabStop(false);
		groupBox1.setText("Location: ");

		label1.setLocation(new Point(8, 16));
		label1.setSize(new Point(72, 16));
		label1.setTabIndex(0);
		label1.setTabStop(false);
		label1.setText("Address:");

		label2.setLocation(new Point(176, 16));
		label2.setSize(new Point(32, 16));
		label2.setTabIndex(1);
		label2.setTabStop(false);
		label2.setText("Port: ");

		txtAddress.setLocation(new Point(56, 16));
		txtAddress.setSize(new Point(104, 20));
		txtAddress.setTabIndex(2);
		txtAddress.setText("127.0.0.1");

		txtPort.setLocation(new Point(208, 16));
		txtPort.setSize(new Point(24, 20));
		txtPort.setTabIndex(3);
		txtPort.setText("23");

		groupBox2.setLocation(new Point(8, 56));
		groupBox2.setSize(new Point(336, 224));
		groupBox2.setTabIndex(1);
		groupBox2.setTabStop(false);
		groupBox2.setText("Data: ");

		txtReceive.setLocation(new Point(16, 24));
		txtReceive.setSize(new Point(304, 160));
		txtReceive.setTabIndex(0);
		txtReceive.setText("");
		txtReceive.setMultiline(true);

		label3.setLocation(new Point(16, 192));
		label3.setSize(new Point(72, 16));
		label3.setTabIndex(1);
		label3.setTabStop(false);
		label3.setText("Command: ");

		txtSend.setLocation(new Point(72, 192));
		txtSend.setSize(new Point(208, 20));
		txtSend.setTabIndex(2);
		txtSend.setText("");

		btnSend.setLocation(new Point(288, 192));
		btnSend.setSize(new Point(32, 16));
		btnSend.setTabIndex(3);
		btnSend.setText("Send");

		button1.setLocation(new Point(248, 16));
		button1.setSize(new Point(80, 16));
		button1.setTabIndex(4);
		button1.setText("(Dis)Connect");
		button1.addOnClick(new EventHandler(this.button1_click));

		this.setNewControls(new Control[] {
							groupBox2, 
							groupBox1});
		groupBox1.setNewControls(new Control[] {
								 button1, 
								 txtPort, 
								 txtAddress, 
								 label2, 
								 label1});
		groupBox2.setNewControls(new Control[] {
								 btnSend, 
								 txtSend, 
								 label3, 
								 txtReceive});
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
