import java.util.Scanner;
class LinearSearch{
	public static void main(String args []){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		int i;
		for(i=0;i<size;i++)
		{
			System.out.print("Enter the elements: ");
			arr[i]=sc.nextInt();
		}
		for(i=0;i<size;i++)
		{
			System.out.println(arr[i]+" ");
		}
		System.out.print("Enter the element to be searched: ");
		int search=sc.nextInt();
		for(i=0;i<size;i++)
		{
			if(arr[i]==search)
			{
				break;
			}
		}
		if(i==size)
		{
			System.out.println("Element not Found!!!");
		}
		else
		{
			System.out.println("Element Found at "+i+" position");
		}
	}
}