import java.util.*;

class Multiple{


	public static void main(String []args)
	{
		int a=0,b=0;
		Scanner sc =new Scanner(System.in);
		try{
			System.out.println("Enter the numbers: ");
			a=sc.nextInt();
			b=sc.nextInt();
			
			if((a-b)==0)
			{
				throw new ArithmeticException();
			}
			else
			{
				int ans=a/(a-b);
				System.out.println("a/(a-b)= "+ans);
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println("Unexpected Error !!!!");
		}
		
	}
}
		