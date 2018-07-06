//Gets data neccesary for strings
import java.lang.StringBuffer; //String charater
import java.io.IOException;	//for Input

public class MyInput
{
	public static void main(String[] args)throws java.io.IOException
	{
		int NoMoreInput = -1; //Tells when to stop charater input
		int InputChar;	//Charater that is enter
		char EnterKeyHit = '\n';	//inputs '\n' when the enter key is hit
		
		StringBuffer InputBuffer = new StringBuffer(30); //Creates a charater array with a maximuim size of 30
		
		System.out.println("Please enter a one word name: ");
		
		try //self explainitory
		{
			InputChar = System.in.read(); //reads the data and puts it in "InputChar"
			
			while(InputChar != NoMoreInput) //begin of loop
			{
				if((char) InputChar != EnterKeyHit) //converts InputChar to character array. If the enter key is hit it will exit
				{
					InputBuffer.append((char) InputChar); //appends each charater to the array
				}
				else
				{
					InputBuffer.setLength( InputBuffer.length() - 1); //gets length then reserves 1 place for null zero
					break; //exits the loop
				}
				InputChar = System.in.read(); //input is inputed to variable
			}
		}
		catch(IOExpection IOX) //if nothing works then do this
		{
			System.err.println(IOX);
		}
		
		System.out.println("The string Entered: " + InputBuffer.toString());
	}
}
