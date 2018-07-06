import java.io.StringBufferInputStream;
import java.io.IOException;

public class MyInput
{
	public static void main(String[] args) throws java.io.IOException
	{
		String NewString = SetString();
		
		System.out.println("Enter some text: ");
		NewString = SetString();
		
		System.out.println("Good Job you entered: " + NewString);
		
	}


public static String SetString()
{

int No = -1;
int InChar;
char Return = '\n';

StringBuffer InString = new StringBuffer(30);

try
{
InString = System.in.read();

while(InChar != -1)
{
	if ((char) InChar != Return)
	{
		InString.append((char) InChar);
	}
	else
	{
		InString.setLength( InString.length() - 1);
		break;
	}
	InChar = System.in.read();
}
}
catch(IOException IOX)
{
	System.err.println();
}
return InString.toString();
	}
}
	
				  
