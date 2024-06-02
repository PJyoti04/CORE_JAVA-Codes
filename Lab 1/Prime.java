import java.util.Scanner;
class Prime{
	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=scan.nextInt();
		int i;
		if(num==0 || num==1)
		{
			System.out.println("special case !!!");
		}
		else
		{
			for(i=2;i<=num;i++)
			{
				if(num%i==0)
					break;
			}
			if(i==num)
			{
				System.out.println("Prime");
			}
			else
			{
				System.out.println("Composite");
			}
		}
	}
}
