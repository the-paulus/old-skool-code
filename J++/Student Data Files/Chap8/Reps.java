import java.io.IOException;

class Reps
{
  public static void main( String Args[] )
  {
    char party;
    char ERROR = '\0';
    int i, numReps;
    int democrats = 0, republicans = 0, independents = 0;
    String tempVal = new String();

    System.out.println( "\nHow many U.S. representatives does your state have?" );
    numReps = Integer.parseInt( GetConsoleString() );

    System.out.println( "Enter the party affiliation for each representative" );
    System.out.println( "Enter D for Democrat, R for Republican," );
    System.out.println( "and I for Independents or other parties" );

    for ( i = 1; i <= numReps; i++ )
    {
      do
      {
        System.out.println( "Party of representative #" + i );
        tempVal = GetConsoleString();
        party = tempVal.charAt( 0 );

        switch( party )
        {
          case 'D':
          case 'd':
                    democrats++;
                    break;
          case 'R':
          case 'r':
                    republicans++;
                    break;
          case 'I':
          case 'i':
                    independents++;
                    break;
          default:
                    System.out.println( "Invalid entry.  Enter D, R, or I." );
                    party = ERROR;
                    break;
        } // end of switch statement
      }while( party == ERROR );  //  end of do . . while loop
    } // end of for loop
    System.out.println( "Your state is represented by:" );
    System.out.println( "     " + democrats + " Democrats" );
    System.out.println( "     " + republicans + " Republicans" );
    System.out.println( " and " + independents + " Independents" );
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

} // end of Reps class

