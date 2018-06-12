import java.lang.StringBuffer;
import java.io.IOException;

class Shipping
{
  public static void main( String Args[] )
  {
    int shippingMethod;
    double shippingCost;

    System.out.println( "SHIPPING PRICE MENU" );
    System.out.println( "How do you want your order shipped?" );
    System.out.println( "1 - Ground" );
    System.out.println( "2 - Two Day Air" );
    System.out.println( "3 - Over Night Air" );
	System.out.print( "Please enter desired shipping method: " );

    shippingMethod = Integer.parseInt( GetConsoleString() );
    switch( shippingMethod )
    {
      case 1:
              shippingCost = 5.25;
              break;
      case 2:
              shippingCost = 7.75;
              break;
      case 3:
              shippingCost = 10.25;
              break;
	  default:
              shippingCost = 0.0;
              break;
    }

    System.out.println( "The price for delivery is: $" + shippingCost );
	System.out.println("Press Enter to end program");
	GetConsoleString();
  } // end of main method

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
}  //  end of class Shipping

