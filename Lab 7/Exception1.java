import java.util.*;
class Exception1{
	public static void main(String []args)
	{
		try
		{
			int i=50/1;
		}
		catch(ArithmeticException e){
			System.out.println("Any number cannot be divided by zero.");
		}
		System.out.println("Print rest of the code.....");
	}
}