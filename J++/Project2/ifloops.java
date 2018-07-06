public class ifloops
{
	public static void main(String[] args) throws java.io.IOException
	{
		int i = 5;
		
		if (i == 5)
		{
			System.out.println("While Loop: ");
			
			while(i != 0)
			{
				System.out.println(i);
				i--;
			}
			
			System.out.println("For Loop: ");
			
			for(i=5;i!=0;i--)
			{
				System.out.println(i);
			}
			
			System.out.println("Do loop:");
			
			do
			{
				System.out.println(i);
				i--;
			}while(i!=0);
		}
		else
		{
			System.out.println("Connot Loop");
		}
	}
}
