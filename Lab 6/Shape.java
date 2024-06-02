abstract class Shape{
	double dimOne;
	double dimTwo;
	
	Shape(){
		dimOne=0.0;
		dimTwo=0.0;
	}
	
	Shape(double d1,double d2)
	{
		dimOne=d1;
		dimTwo=d2;
	}
	
	abstract void computeArea();
}
class Rectangle extends Shape{
	Rectangle(){
		super();
	}
	Rectangle(double d1,double d2){
		super(d1,d2);
	}
	void computeArea(){
		double area=dimOne*dimTwo;
		System.out.println("Area="+area);
	}
}

class Triangle extends Shape{
	Triangle(){
		super();
	}
	Triangle(double d1,double d2){
		super(d1,d2);
	}
	void computeArea(){
		double area= 0.5*dimOne*dimTwo;
		System.out.println("Area="+area);
	}
}

class Driver{
	public static void main(String []args){
		Shape ob=new Rectangle(5.0,4.0);
		ob.computeArea();
		
		Shape ob1=new Triangle(5.0,4.0);
		ob1.computeArea();
	}
}