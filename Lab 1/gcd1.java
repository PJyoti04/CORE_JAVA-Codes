import java.util.Scanner;
class GCD{
	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		int g=0,cnt=0,min,i;
		System.out.println("Enter a number 1:");
		int num1=scan.nextInt();
		System.out.println("Enter a number 2:");
		int num2=scan.nextInt(); 
		if(num1>num2)
			min=num2;
		else
			min=num1;
		for(i=1;i<=min;i++)
		{
			if(num1%i==0 && num2%i==0)
				g=i;
			cnt++;
		}
		System.out.println("GCD:" + g);
		System.out.println(cnt);
	}
}