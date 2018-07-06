import java.io.IOException;

class Lengths
{
  public static void main(String args[])
  {
    double length_in_feet,
           converted_length,
           factor;
    int choice = 0;
    String units = " feet";
    String temp;

    // Ask the user for the length to be converted
    System.out.print( "What is the length in feet? " );
    temp = GetConsoleString();
    length_in_feet = toFloat(temp);

    // Display the menu of conversion options
    System.out.println( "\nTo what units would you like to convert the length?" );
    System.out.println( "1 - Inches" );
    System.out.println( "2 - Meters" );
    System.out.println( "3 - Yards" );
    System.out.println( "4 - Kilometers" );
    System.out.print( "Enter the number of the unit you want: ");
    temp = GetConsoleString();
    choice = Integer.parseInt(temp);

    // Use a switch structure to set the conversion factor
    switch(choice)
    {
      case 1: // inches
              factor = 12.0;
              units = " inches";
              break;
      case 2: // meters
              factor = 0.30479999;
              units = " meters";
              break;
      case 3: // yards
              factor = 0.33333333;
              units = " yards";
              break;
      case 4: // kilometers
              factor = 0.00030479;
              units = " kilometers";
              break;
      default:
              factor = 0;
              break;
    }

    if(factor == 0) // check for illegal selection
    {
      System.out.println( "Illegal selection--no result calculated" );
    }
    else // if not illegal, do the conversion and print the output
    {
      converted_length = length_in_feet * factor;
      System.out.println( "" + length_in_feet + " feet = "
                            + converted_length + units );
    }
  }

  public static float toFloat( String inString )
  {
    Float tempFloat = new Float(inString);
    return tempFloat.floatValue();
  } // end of toFloat method

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
}
