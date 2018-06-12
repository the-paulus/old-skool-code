import java.io.StringBufferInput;
import java.io.IOException;

public class NewMethod
{
	public static void main(String[] args)throws java.io.IOException
	{
		StringBuffer Input = new StringBuffer(30);
		System.out.println("Enter a string: ");
		System.in.read(Input);
		System.out.println("Hmmmmm.... Nice word. \"" + Input);
	}
}
