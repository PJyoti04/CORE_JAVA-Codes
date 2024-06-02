import myPkg.MyClass;

class ABC extends MyClass
{
	void fun(){
		display(46);
	}
}
class Driver{
	public static void main(String args[]){
		MyClass ob=new MyClass(3,4);
		System.out.println("Value is: "+ob.add());
		ABC obj=new ABC();
		obj.fun();
	}
}