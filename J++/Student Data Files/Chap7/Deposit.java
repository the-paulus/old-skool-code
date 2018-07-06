import java.lang.StringBuffer;
import java.io.IOException;

class Deposit
{
  public static void main( String args[] )
  {
    String inString = new String();
    float depositAmount;

    System.out.println( "Begin Program");
    System.out.print( "Enter deposit amount to open account:" );
    inString = GetConsoleString();
    depositAmount = toFloat( inString );
    if( depositAmount < 1000 )
    {
      if( depositAmount < 100 )
      {
        System.out.println( "Please consider our EconoCheck account" );
      }
      else
      {
        System.out.println( "Please consider our FreeCheck account" );
      }
    }
    else
    {
      System.out.println( "Please consider our InterestMaker account" );
    }

    System.out.println( "Program End - <press Enter key>" );
    GetConsoleString();
  } //  end of main method

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
  } //  end of method GetConsoleString

  public static float toFloat( String inString )
  {
    Float tempFloat = new Float( inString );
    return tempFloat.floatValue();
  } // end of toFloat method
} // end of class Deposit
