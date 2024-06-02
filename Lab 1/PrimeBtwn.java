import java.util.Scanner;
class PrimeBtwn{
	public static void main(String [] args){
		System.out.print("Enter a number: ");
		int num;
		int i;
		for(num=37;num<=129;num++)
        {
			for(i=2;i<=num;i++)
			{
				if(num%i==0)
					break;
			}
			if(i==num)
			{
                System.out.println(num+" ");
            }
		}
	}
}
