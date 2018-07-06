public class logical2
{
   public static void main (String args[])
   {
     boolean white, black, friendly, acceptable;

     white = true;     // dog is white
     black = false;     // dog is not black
     friendly = false;  // dog is not friendly

     // The following statement produces incorrect results due to the
     // order of operations.
     acceptable = (white || black && friendly);
     System.out.println (acceptable);
 
     // The parentheses in the following statement overrides the
     // order of operations and the statement produces the correct result.
     acceptable = ((white || black) && friendly);
     System.out.println (acceptable);
 
   }  //  end of method main
}  //  end of class logical2
