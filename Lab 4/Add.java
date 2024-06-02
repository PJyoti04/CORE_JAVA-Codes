//write a java program to add two numbers using command line argument.
class Add
{
	public static void main(String args[]){
		//Integer is a wrapper class
		//To convert String to int
		int x=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);
		int sum=x+y;
		System.out.println(sum);
	}
}