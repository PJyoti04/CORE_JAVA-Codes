import java.util.*;

class Expression
{
	public static void main(String []args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the numbers: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		try{
			if((a-b)==0)
			{
				throw new ArithmeticException();
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		int ans=a/(a-b);
		System.out.println("a/(a-b)= "+ans);
	}
}
		