import java.util.Scanner;
class ScalarProduct{
	public static void main(String args []){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the vector1: ");
		int size1=sc.nextInt();
		System.out.print("Enter the size of the vector2: ");
		int size2=sc.nextInt();
		int arr1[]=new int[size1];
		int arr2[]=new int[size2];
		int i;
		System.out.println("Vector 1");
		for(i=0;i<size1;i++)
		{
			System.out.print("Enter the elements: ");
			arr1[i]=sc.nextInt();
		}
		System.out.println("Vector 2");
		for(i=0;i<size2;i++)
		{
			System.out.print("Enter the elements: ");
			arr2[i]=sc.nextInt();
		}
		System.out.println("Vector 1");
		for(i=0;i<size1;i++)
		{
			System.out.print(arr1[i]+" ");
		}
		System.out.println("\nVector 2");
		for(i=0;i<size2;i++)
		{
			System.out.print(arr2[i]+" ");
		}
		int min=(size1>=size2)?size2:size1;
		int sum=0;
		System.out.print("\nScalar product: ");
		for(i=0;i<min;i++)
		{
			sum=sum+arr1[i]*arr2[i];
		}
		System.out.print(+sum);
	}
}