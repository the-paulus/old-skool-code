//imports files
import java.lang.StringBuffer; //for string
import java.io.IOException;

public class NewMethod
{
	public static void main(String[] args) throws java.io.IOException
	{
		//Displays "Please Enter a word: "
		System.out.print("Please Enter a word: ");
		
		//Declares InputString as a String.
		String InputString = GetString();	//assigns a value w/getstring() function
		
		//Displays what was typed
		System.out.println("You Entered: " + InputString);
		
		//Pauses the program.
		System.out.println("Paused... Hit any key to continue.");
		
		//Gets input w/getstring() function
		InputString = GetString();
	}
	
	//New String Function
	public static String GetString()
	{
		//Declares Varaibles
		int NoMoreInput = -1;
		int InputChar;
		char EnterKey = '\n';
		StringBuffer InputBuffer = new StringBuffer(30);
		
		//tries this
		try
		{
			//Gets input
			InputChar = System.in.read();
			
			//Begin of loop
			while(InputChar != NoMoreInput)
			{
				//checks to make sure InputChar doesnt equal '\n'
				if((char) InputChar != EnterKey)
				{
					//appends InputChar to the array
					InputBuffer.append((char) InputChar);
				}
				else
				{
					//Gets length and reserves a place for the null zero
					InputBuffer.setLength(InputBuffer.length() - 1);
					
					//Breaks out of the loop
					break;
				}
				//Sets the InputChar to the Input form the keybord
				InputChar = System.in.read();
			}
		}
		
		//Looks for errors
		catch(IOException IOX)
		{
			System.err.println(IOX);
		}
		
		//Returns the value of InputBuffer
		return InputBuffer.toString();
	}
}
