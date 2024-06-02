import java.util.Scanner;
class Gcd{
	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		int g,cnt=0;
		System.out.println("Enter a number 1:");
		int num1=scan.nextInt();
		System.out.println("Enter a number 2:");
		int num2=scan.nextInt();
		int temp1=num1;
		int temp2=num2;
		while(num2!=0)
		{
			int rem=num1%num2;
			num1=num2;
			num2=rem;
			cnt++;
		}
		g=num1;
		int lcm=(temp1*temp2)/g;
		System.out.println("GCD:"+g +"LCM:"+lcm);
		System.out.println(+cnt);
	}
}