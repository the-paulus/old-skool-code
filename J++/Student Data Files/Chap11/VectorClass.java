import java.io.*;
import java.util.Vector;

class VectorClass
{
  static final int MAX_SHIFT = 12;
  
  public static void main( String args[] )
  {
    Vector CCVector = new Vector(2, 2);
    CreditCard2 CreditCardItem;
    String NumString;
    String ansString;
    int index;

    // Enter the data
    do
    {
      System.out.print( "Please enter name of client: " );
      ansString = GetConsoleString();
      CCVector.addElement( new CreditCard2( ansString, 2000, 0.09 ) );
      System.out.println( "New Cardholder is: " + ansString );
      System.out.println( "Number Items in Vector: " + CCVector.size() );
      System.out.println( "Present Capacity: " + CCVector.capacity() );
      System.out.println( "\nWould you like to continue? ( y / n ): " );
      ansString = GetConsoleString();
      System.out.println( "" );
    }
    while( ( ansString.charAt( 0 ) != 'n' ) && ( ansString.charAt( 0 ) != 'N' ) );

    // Output List
    for( index = 0; index < CCVector.size(); index++ )
    {
      CreditCardItem = (CreditCard2) CCVector.elementAt( index );
      System.out.println( "Item No " + ( index + 1 ) + " name: " + CreditCardItem.clientName );
      System.out.println( "Account Number: " + CreditCardItem.accountNumber );
      NumString = doubleToString( CreditCardItem.creditLimit, 6, 2 );
      System.out.println( "  Credit Limit: $" + NumString + "\n" );
    } // end of for loop

    ansString = GetConsoleString();
  } // end of method main
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

  public static String doubleToString( double testNum, int width, int precision )
  {
    
    String workString;
    Long tempLong;
    double inNum = testNum;
    int decimalShift = 0, numWidth = 0, presentLoc, stringWidth;
    boolean negative = false;

    if( inNum < 0 )
    {
      negative = true;
      inNum *= -1;
    }

    if( inNum != 0 )
    {
      while( inNum <= 1.0e12 )
      {
        inNum = inNum * 10;
        decimalShift++;
      }
      tempLong = new Long( (long) inNum );
      workString = new String ( tempLong.toString() ); 
      workString = workString + "000000000000";
    }
    else
    {
      workString = new String( "0000000000000000000000000" );
      decimalShift = MAX_SHIFT;
    }

    StringBuffer StringBuf = new StringBuffer("");
    presentLoc = MAX_SHIFT - decimalShift + precision;

    while( precision > 0 )
    {
      StringBuf.append( workString.charAt( presentLoc ) );
      presentLoc--;  numWidth++;  precision--;
    }

    StringBuf.append( '.' );
    numWidth++;

    if( ( testNum < 1 ) && ( testNum > 0 ) )
    {
      StringBuf.append( '0' );
      numWidth++;
    }

    while( presentLoc >= 0 )
    {
      StringBuf.append( workString.charAt( presentLoc ) );
      numWidth++;
      presentLoc--;
    }

    if( negative )
    {
      StringBuf.append( '-' );
      numWidth++;
    }
                
    while( numWidth < width )
    {
      StringBuf.append( ' ' );
      numWidth++;
    }

    stringWidth = StringBuf.length();
    StringBuffer newStringBuf = new StringBuffer("");

    while( stringWidth-- > 0 )
    {
      newStringBuf.append( StringBuf.charAt( stringWidth ) );
    }
    return newStringBuf.toString();
  } // end of method doubleToString
} // end of class VectorClass
