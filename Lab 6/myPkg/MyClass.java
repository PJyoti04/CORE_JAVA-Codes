package myPkg;
public class MyClass{
	public int a,b;
	 public MyClass(){
		a=0;
		b=0;
	}
	public MyClass(int a ,int b){
		this.a=a;
		this.b=b;
	}
	public int add(){
		return a+b;
	}
	 protected void display(int a){
		System.out.println("Value is: "+a);
	}
}