class NestLoop
{
  public static void main( String Args[] )
  {
    int i, j;
    System.out.println( "Program Begin" );
    for( i = 1; i <=3; i++ )
    {
      System.out.println( " Outer loop:  i = " + i );
      for( j = 1; j <= 3; j++ )
      {
        System.out.println( "      Inner loop:  j = " + j );
      }
    }
    System.out.println( "Program End" );
  }
}
