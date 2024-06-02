import java.util.Scanner;
class ExpoSeries{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of terms: ");
		int n=sc.nextInt();
		System.out.print("Enter x: ");
		int x=sc.nextInt();
		float sum=1.0f;
		for(int i=n-1;i>0;i--)
		{
			sum=1+(x*sum/i);
		}
		System.out.print("e^x= " +sum);
	}
}