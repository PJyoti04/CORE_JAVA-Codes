import java.util.Scanner;
class Array{
	public static void main(String args []){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.print("Enter the elements: ");
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}
}