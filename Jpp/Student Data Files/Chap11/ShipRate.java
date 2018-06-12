import java.io.IOException;

class ShipRate
{
  public static void main( String Args[] )
  {
    double shipRate[ ] [ ] = {
      { 2.65, 2.75, 2.87, 3.06, 2.65, 3.35,  4.73,  6.13 },
      { 3.05, 3.18, 3.35, 3.84, 4.60, 5.58,  7.68,  9.33 },
      { 3.25, 3.40, 3.63, 4.24, 5.08, 6.13,  8.46, 10.38 },
      { 4.10, 4.28, 4.59, 5.34, 6.20, 7.39,  9.93, 11.85 },
      { 4.65, 4.95, 5.35, 6.23, 7.25, 8.66, 11.55, 13.58 },
      { 5.25, 5.49, 5.99, 6.90, 8.03, 9.69, 12.69, 15.49 } };

    float weight;                  // weight of package
    int weightCategory;    // weight category in table
    int zone;                              // zone of package destination

    weight = getPackageWeight();

    zone = getPackageZone();

    weightCategory = (int) ( weight / 5 );

    System.out.println( "Shipping price is: " + shipRate[weightCategory][zone] );
  } // end of main method

  public static float getPackageWeight()
  {
    float tempFloat;
	 
    do
    {
      System.out.println( "Please enter weight of package ( max - 25 lbs. ):" );
      tempFloat = toFloat( GetConsoleString() );
    }
    while( ( tempFloat < 1 ) || ( tempFloat > 25 ) );

    return tempFloat;
  } // end of getPackageWeight method

  public static int getPackageZone()
  {
    int tempInt;

    do
    {
      System.out.println( "Please enter delivery zone:" );
      tempInt = Integer.parseInt( GetConsoleString() );
    }
    while( ( tempInt < 0 ) || ( tempInt > 7 ) );

    return tempInt;
  } // end of getPackageZone method

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

  public static float toFloat( String inString )
  {
    Float tempFloat = new Float( inString );

    return tempFloat.floatValue();
  } // end of toFloat method
} // end of class ShipRate

