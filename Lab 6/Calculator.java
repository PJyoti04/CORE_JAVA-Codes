interface Calculator{
	int addNumber(int a ,int b);
	int subNumber(int a,int b);
	int mulNumber(int a,int b);
	int divNumber(int a,int b);
}
class ConCalculator implements Calculator{
	public int addNumber(int a,int b){
		return a+b;
	}
	
	public int subNumber(int a,int b){
		return a-b;
	}
	public int mulNumber(int a,int b){
		return a*b;
	}
	public int divNumber(int a,int b){
		return a/b;
	}
}
class Driver{
	public static void main(String []args){
		Calculator cal=new ConCalculator();
		int res=cal.addNumber(55,66);
		System.out.println("Ans="+res);
		
		Calculator cal1=new ConCalculator();
		int res1=cal1.subNumber(55,66);
		System.out.println("Ans="+res1);
	}
}