class Binary
{
  public static void main( String args[] )
  {
    int i, j, k, l;
    System.out.println( "i j k l" );
    for (i = 0; i <= 1; i++)
      for (j = 0; j <= 1; j++)
        for (k = 0; k <= 1; k++)
          for (l = 0; l <= 1; l++)
            System.out.println( "" + i + ' ' + j + ' ' + k + ' ' + l );
  }
}
