class Compare
{
  public static void main( String Args[] )
  {
    System.out.println( "Begin Program" );
    int i = 2;
    int j = 3;
    boolean true_false;
 
    System.out.println( "i == 2 => " + ( i == 2 ) );
    System.out.println( "i == 1 => " + ( i == 1 ) );
    System.out.println( "j > i  => " + ( j > i ) );
    System.out.println( "j < i  => " + ( j < i ) );
    System.out.println( "j <= 3 => " + ( j <= 3 ) );
    System.out.println( "j >= i => " + ( j >= i ) );
    System.out.println( "j != i => " + ( j != i ) + '\n' );
      
    true_false = ( j < 4 );
    System.out.println( "true_false = " + true_false );
  }
} //  end of class Compare
