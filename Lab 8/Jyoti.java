class MyThread extends Thread{
	public void run(){
		System.out.println("Inside Thread: "+this.getName());
		System.out.println("Inside Thread: "+this.currentThread());
	}
}
class Driver{
	public static void main(String args[]){
		MyThread t1=new MyThread();
		MyThread t2=new MyThread();
		System.out.println("Name of t1: "+t1.getName());
		System.out.println("Id of t1: "+t1.currentThread());
		t1.setName("Jyoti");
		t1.start();
		System.out.println("After setting name: "+t1.getName());
		System.out.println("Is thread alive?: "+t1.isAlive());
	}
}