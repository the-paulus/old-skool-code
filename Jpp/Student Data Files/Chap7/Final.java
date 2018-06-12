import java.lang.StringBuffer;
import java.io.IOException;

class Final
{
  public static void main(String args[])
  {
    boolean exempt_from_final;
    int my_days_absent;
    float my_average;
    String temp;

    exempt_from_final = false;

    System.out.print( "What is your course grade average? " );
    temp = GetConsoleString();
    my_average = toFloat(temp);

   System.out.print( "How many days were you absent from class? ");
   temp = GetConsoleString();
   my_days_absent = Integer.parseInt(temp);
   
   if(my_average >= 90)
   {                                 // if your average is 90 or better
     if(my_days_absent <= 3)         // and you have missed three days
     {
       exempt_from_final = true;     // or less, you are exempt.
     }
   }
   else  // if you don't have a 90+ average, you still have a chance
   {
     if(my_average >= 80)
     {                                // if you average is 80 or better
       if(my_days_absent <= 1)        // and you have missed one day or
       {                              // less, you are exempt.
         exempt_from_final = true;
       }
     }
   }

   // notify student of the decision
   if(exempt_from_final)
   {
     System.out.println( "You are exempt from the final exam." );
   }
   else
   {
     System.out.println( "You must take the final exam for the course." );
   }
   System.out.println("Press Enter key to continue");
   GetConsoleString();
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
