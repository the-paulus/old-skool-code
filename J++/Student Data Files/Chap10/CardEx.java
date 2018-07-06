class CardEx
{
  public static void main( String args[] )
  {
    // the default constructor
    CreditCard FirstCard = new CreditCard();

    // the initializing constructor
    CreditCard SecondCard = new CreditCard( 2000.0, 0.08 );

    // the copy constructor
    CreditCard ThirdCard = new CreditCard ( SecondCard );

    if( FirstCard.makePurchase( 750.0 ) )
    {
      System.out.println( "Transaction accepted, First Card balance is: " + 
                          FirstCard.balance );
    }
    else
    {
      System.out.println( "Transaction not accepted, amount goes over First "
                          + "Card's limit" );
    }

    if( ThirdCard.makePurchase( 750.0 ) )
    {
      System.out.println( "Transaction accepted, Third Card balance is: " + 
                          ThirdCard.balance );
    }
    else
    {
      System.out.println( "Transaction not accepted, amount goes over Third "
                          + "Card's limit" );
    }

    System.out.println("\nFor the First Card:");
    FirstCard.makeBill();
    System.out.println("\nFor the Second Card:");
    SecondCard.makeBill();
    System.out.println("\nFor the Third Card:");
    ThirdCard.makeBill();
  } // end of method main
} // end of class CardEx

class CreditCard
{
  public long accountNumber;  // it is an object that has an account number
  public double balance;      // it is an object that has a balance 
                              //  (how much money the client owes)
  public double creditLimit;  // it is an object that has a credit limit
                              //  (how much money the client can borrow)
  public double interestRate; // it is an object that has an interest rate to charge
                              //  the client for use of the money
  public CreditCard()
  {
    accountNumber = 0;
    balance = 0.0;
    creditLimit = 500.0;
    interestRate = .12;
  } // end of default constructor

  public CreditCard( double newCreditLimit, double newInterestRate )
  {
    accountNumber = 0;
    balance = 0.0;
    creditLimit = newCreditLimit;
    interestRate = newInterestRate;
  } // end of initializing constructor

  public CreditCard( CreditCard InComingCard )
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
      balance = balance + purchaseAmount;
      return true;
    }
    else
    {
      return false;
    }
  } // end of member makePurchase

  public double addInterest()
  {
    balance = balance + ( balance * interestRate );
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
} // end of class CreditCard

