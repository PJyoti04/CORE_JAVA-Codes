class Factor extends Thread{
	int num,flag;
	Factor(int n,int flag){
		num=n;
		this.flag=flag;
	}
	public void run(){
		if(flag==0)
		{
			for(int i=1;i<=num;i++){
			
				if(num%i==0)
				{
					System.out.print(i+" ");
				}
			}
		//System.out.println();	
		}
		if(flag==1){
			if(num%2==0){
				System.out.println("Even ");
			}
			else{
				System.out.println("Odd ");
			}
		}
	}
}

class Driver{
	public static void main(String args[]){
		Factor f1=new Factor(10,1);
		f1.start();
		Factor f2=new Factor(10,0);
		f2.start();
	}
}