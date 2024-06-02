class Mythread extends Thread{
	int lb,ub;
	int a[]={1,2,3,4,5,6,7};
	int b[]={1,2,3,4,5,6,7};
	
	static int sum=0;
	//static int c[]=new int[6];
	
	public Mythread(int flag){
		this.lb=a.length/2*flag;
		this.ub=lb+a.length/2-1;
	}
	public void run(){
		for(int i=lb;i<=ub;i++)
		{
			if(i<a.length)
			{
				sum=sum+a[i]*b[i];
			}
			else
				break;
		}
	}
}


class ScallerMulti {
	public static void main(String args[]) throws InterruptedException {
		Mythread t1=new Mythread(0);
		Mythread t2=new Mythread(1);
		Mythread t3=new Mythread(2);
		t1.start();
		t2.start();
		t3.start();
		try{
			Thread.sleep(500);
		}catch(InterruptedException e){
		}
		System.out.println("Dot product: "+Mythread.sum);
	}
}