import java.util.Scanner;
class BinarySearch{
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
		System.out.print("Enter the element to be searched: ");
		int search=sc.nextInt();
		int low=0,high=size-1;
		while(low<high)
		{
			int mid=(low+high)/2;
			if(arr[mid]==search)
			{
				System.out.println("Element Found at: "+mid);
				break;
			}
			else if(search > arr[mid])
			{
				low=mid+1;
			}
			else
				high=mid-1;
		}
		if(low>high)
		{
			System.out.println("Element not Found!!");
		}
	}
}