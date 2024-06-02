import java.util.Scanner;

class Employee{
	String empName;
	int empID;
	double basicSal;
	static final double DA=30.0;
	static final double HRA=25.0;
	
	//Default constructor
	Employee(){
		empName=null;
		empID=0;
		basicSal=0.0;
	}
	
	//Parameterised constructor
	Employee(String empName,int empID,double basicSal)
	{
		this.empName=empName;
		this.empID=empID;
		this.basicSal=basicSal;
	}
	
	void disEmp(int flag)
	{
		System.out.println("***************************");
		System.out.println("Employee Name: "+empName);
		System.out.println("Employee Id: "+empID);
		if(flag==0){
			System.out.println("Employee Gross Salary is: "+grossSal());
		} 
	}
	double grossSal(){
		return basicSal+DA*basicSal/100+HRA*basicSal/100;
	}
}

class Driver{
	public static void main(String []args){
		//Employee e1=new  Employee("xyz",101,50000);
		//e1.disEmp();
		
		//Array of object
		Employee emp[]=new Employee[3];
		
		int i;
		String name;
		int id;
		double bsal;
		Scanner sc=new Scanner(System.in);
		for(i=0;i<emp.length;i++)
		{
			//Emp details....
			System.out.println("Employee Name: ");
			name=sc.next();
			System.out.println("Employee Id: ");
			id=sc.nextInt();
			System.out.println("Employee salary: ");
			bsal=sc.nextDouble();
			
			emp[i]=new Employee(name,id,bsal);
		}
		System.out.println("Employee Details: ");
		for(i=0;i<emp.length;i++){
			emp[i].disEmp(0);
		}
		Manager man=new Manager("x",1,2000,200,"java");
		man.disEmp(1);
	}
}
class Manager extends Employee{
	double bonus;
	String manDept;
	
	Manager(){
		super();
		bonus=0.0;
		manDept=null;
	}
	Manager(String empName,int empID,double basicSal,double bonus,String manDept){
		super(empName,empID,basicSal);
		this.bonus=bonus;
		this.manDept=manDept;
	}
	void disEmp(int flag){
		super.disEmp(1);
		System.out.println("Manager Bonus: "+bonus);
		System.out.println("Manager Department: "+manDept);
		if(flag==1)
		{
			System.out.println("Manager Gross Salary is: "+(grossSal()+bonus));
		}
	}
	
	
	
}