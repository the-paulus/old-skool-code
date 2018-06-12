//  Share.java
class Share
   {
    public static void main( String Args[] )
	{
	 int numberOfPeople;
	 float money;
	 float share;

	//  Number of people with whom to share money
	numberOfPeople = 70;
	// Amount of money to be shared
	money = 7500;

	share = money / numberOfPeople;
	// output results
	System.out.println( "Give each person " + share );
	}
   }  //  end of class Share
