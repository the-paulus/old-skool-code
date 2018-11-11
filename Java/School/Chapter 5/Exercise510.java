// Paul Lyon
// Exercise 5.10
// 2/16/03

public class Exercise510 {
    public static void main(String[] args)
    {
	System.out.println("Part A:");
	//Part A of Exercise 5.10
	for(int i = 0; i <= 10; i++)
	    {
		for(int j = 0; j < i; j++) 
		    System.out.print("*");
		System.out.println("");
	    }
	
	System.out.println("Part B:");
	//Part B of Exercise 5.10
	for(int i = 0; i <= 10; i++)
	    {
		for(int j = 10; j >= i; j--)
		    System.out.print("*");
		System.out.println("");
	    }

	System.out.println("Part C:");
	//Part C of Exercise 5.10
	for (int i = 10; i > 0; i--)
	    {
		for (int k = i; k < 10; k++)
		    System.out.print(" ");
		for (int j = 0; j < i; j++)
		    System.out.print("*");
		
		System.out.println("");
	    }

	System.out.println("Part D:");
	//Part D of Exercise 5.10
	for(int i = 0; i <= 10; i++)
	    {
		for(int j = 10; j > i; j--)
		    System.out.print(" ");
		for(int k = 0; k < i; k++)
		    System.out.print("*");
		System.out.println("");
	    }
    }
}
