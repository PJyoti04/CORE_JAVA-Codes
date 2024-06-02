//Wap that will receive array of integers in command line arguments and perform linearsearch
import java.util.Scanner;
class LinearSearchCommand
{
	public static void main(String args[]){
		int i;
		int arr[]=new int[args.length];
		for(i=0;i<args.length - 1;i++)
		{
			arr[i]=Integer.parseInt(args[i]);
		}
		int search=Integer.parseInt(args[i]);
		for(i=0;i<args.length-1;i++)
		{
			if(search==arr[i])
			{
				break;
			}
		}
		if(i==args.length-1)
		{
			System.out.println(" Not Found");
		}
		else
		{
			System.out.println("Found at: "+i);
		}
	}
}