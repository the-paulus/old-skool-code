import java.io.IOException;
class HighTemp
{
  public static void main( String args[] )
  {
    int ARRAYSIZE = 32;		//  array size value
    int numValues;		//  number of days to enter values
    int index;			//  index for loop counter and arrays
    float averageHigh;		//  calculate average high temperature
    int total = 0;		//  total temps before averaging

    int [] dailyTemp = new int[ARRAYSIZE];     // the temperature array

    // Use a do . . while loop to get valid input of the number of days
    do
    {
      System.out.println( "Enter the number of data items to be input:" );
	numValues = Integer.parseInt( GetConsoleString() );
	if( ( numValues < 1 ) || ( numValues >= ARRAYSIZE ) )
	{
	  System.out.println( "Please enter a number between 1 and "
					+ ( ARRAYSIZE - 1 ) );
      }
    } // end of do . . while loop
    while( ( numValues < 1 ) || !( numValues < ARRAYSIZE ) );

    // The following loop gets the high temperature from the user for as
    // many days as the user specified in numValues. The subscript 0 is
    // not used so that the subscript will correspond with the day number.
    for( index = 1; index <= numValues; index++ )
    {
      System.out.println("Please enter the high temperature for day " 
                          + index );
	dailyTemp[index] = Integer.parseInt( GetConsoleString() );
    } // end of for loop

    // Print the values from the array to the screen
    System.out.println( "The array contains high temperatures for "
				+ numValues + " days." );
    System.out.println( "The values are as follows:" );
    for( index = 1; index <= numValues; index++ )
    {
      System.out.println( "Day " + index + ": " + dailyTemp[index] );
      total = total + dailyTemp[ index ];
    } // end of for loop

    // Calculate the average by dividing the total by the numValues
    // and assigning to averageHigh
    averageHigh = (float) total / (float) numValues;

    // Print the results to the screen
    System.out.println( "The average high temperature during the" );
    System.out.println( "     " + numValues + "-day period was "
							+ averageHigh + " degrees" );
  } // end of main method

  
  public static String GetConsoleString()
  {
    // code for GetConsoleString
  }  //  end of method GetConsoleString

  public static float toFloat( String inString )
  {
    // code for toFloat
  } // end of toFloat method

} // end of class HighTemp
