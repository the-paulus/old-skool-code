class CreditCard2
{
  String clientName;
  public static long newAccountNumber = 0;
  public long accountNumber;       // it is an object that has an account number
  public double balance;   // it is an object that has a balance 
				// (how much money the client owes)
  public double creditLimit;               // it is an object that has a credit limit
					//  (how much money the client can borrow)
  public double interestRate;              // it is an object that has an interest rate to charge
					//  the client for use of the money
  public CreditCard2()
  {
    accountNumber = 0;
    balance = 0.0;
    creditLimit = 500.0;
    interestRate = .12;
  } // end of default constructor

  public CreditCard2( String newName, double newCreditLimit, double newInterestRate )
  {
    clientName = new String( newName );
    accountNumber = newAccountNumber++;
    balance = 0.0;
    creditLimit = newCreditLimit;
    interestRate = newInterestRate;
  } // end of initializing constructor

  public CreditCard2( CreditCard2 InComingCard )
  {
    this.accountNumber = InComingCard.accountNumber;
    this.balance = InComingCard.balance;
    this.creditLimit = InComingCard.creditLimit;
    this.interestRate = InComingCard.interestRate;
  } // end of copy constructor

  public boolean makePurchase( double purchaseAmount )
  {
    if( ( balance + purchaseAmount ) < creditLimit )
    {
      balance += purchaseAmount;
      return true;
    }
    else
    {
      return false;
    }
  } // end of member makePurchase

  public double addInterest()
  {
    balance += ( balance * interestRate );
    return ( balance * interestRate );
  } // end of member addInterest

  public void makeBill()
  {
    double interest, payment;

    interest = addInterest();
    System.out.println( "Your interest for this month is: $" + interest );
    System.out.println( "Your balance now is: $" + balance );

    payment = .05 * balance;
    System.out.println( "Your payment (due on the 20th) is: $" + payment );
  } // end of member makeBill

  public double payBill( double payment )
	{
	 return ( balance -= payment );

	}  //  end of method payBill
 
   public double returnBalance()
	{
	 return balance;
	}  //  end of method returnBalance

} // end of class CreditCard2

