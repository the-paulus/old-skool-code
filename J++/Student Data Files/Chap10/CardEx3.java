class CardEx3
{
  public static void main( String args[] )
  {
    int gasStops;
    GasCoCard MyGasCard = new GasCoCard( 2000, 0.10);

    for( gasStops = 0; gasStops < 4; gasStops++ )
    {
       MyGasCard.buyGas( 30.0 );
    } // end of for loop

    System.out.println("\nFor the Gas Card:");
    MyGasCard.makeBill();
  } // end of method main
} // end of class CardEx3

class GasCoCard extends CreditCard
	{

	 private int gasPoints;

	 public GasCoCard( double credit, double interest )
		{
		 super( credit, interest );
		 gasPoints = 5;
		}  //  end of initializing constructor

	 public boolean buyGas( double gasPrice )
		{
		 if( makePurchase( gasPrice ) == true )
			{
			 System.out.println( "Gas purchase: " + gasPrice );
			 gasPoints++;
			 return true;
			}
		 else
			{
			return false;
			}

		}  //  end of method buyGas

	 public void giveCredit()
		{
		 double presentBalance, bonusCredit = 0;

		 presentBalance = returnBalance();
		 if( presentBalance > 100 )
			{
			 if ( gasPoints > 10 )
				{
				 bonusCredit = presentBalance * .04;
				 
				}
			 else
				{
				 bonusCredit = presentBalance * .02;
				}
			System.out.println( "Bonus Credit Given: " + bonusCredit );
			payBill( bonusCredit );
			}
		}  //  end of method giveCredit

	public void makeBill()
		{
		 giveCredit();
		 super.makeBill();

		}  //  end of makeBill

	}  //  end of class GasCoCreditCard
