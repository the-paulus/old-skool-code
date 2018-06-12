import java.lang.StringBuffer;
import java.io.IOException;

class City
{
  public static void main( String Args[] )
  {
    System.out.println( "Begin Program" );

    String city_name = new String();
    String temp = new String();
    long population;

    System.out.print( "Please enter the name of your city or town: " );
    city_name = GetConsoleString();

    System.out.print( "Please enter the population of your city or town: " );
    temp = GetConsoleString();
    population = Long.parseLong( temp );
    
	// Enter if structure here

    System.out.println( "Program End - <press a key>" );
    GetConsoleString();	// end of program catch
  }  //  end of method main

  public static String GetConsoleString()
  {
    int noMoreInput = -1;
    char enterKeyHit = '\n';
    int InputChar;
    StringBuffer InputBuffer = new StringBuffer();

    try
    {
      InputChar = System.in.read();

      while( InputChar != noMoreInput )
      {
        if( (char) InputChar != enterKeyHit )
        {
          InputBuffer.append( (char)InputChar );
        }
        else
        {
		  InputBuffer.setLength( InputBuffer.length() -1 );
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
}  //  end of class City
