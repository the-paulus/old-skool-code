//  NewMethod.JAVA
import java.lang.StringBuffer;
import java.io.IOException;

class NewMethod
   {
      public static void main( String args[] )
	{
	 System.out.println( "Program begins" );

	 System.out.print( "Please enter a one word name: " );

	 String InputString = GetConsoleString();
     System.out.println( "You entered: " + InputString  );
	 System.out.println("Program paused, Press the Enter key to continue");
     InputString = GetConsoleString();
	}

public static String GetConsoleString()
	{
	 int noMoreInput = -1;
	 char enterKeyHit = '\n';
	 int InputChar;
	 StringBuffer InputBuffer = new StringBuffer( 30 );

	 try
		{
		 InputChar = System.in.read();

		 while( InputChar != noMoreInput )
			{
			 if( (char) InputChar != enterKeyHit )
				{
				 InputBuffer.append( (char) InputChar );
				}
			 else
				{
				 break;
				}
			 InputChar = System.in.read();
			}
		}
	catch( IOException IOX )
		{
		 System.err.println( IOX );
		}

	 return InputBuffer.toString();

    }  //  end of method GetConsoleString

   }  //  end of class NewMethod
