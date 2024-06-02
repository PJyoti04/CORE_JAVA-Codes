import java.util.Scanner;
class EvenThread implements Runnable {
    int m, n;

    public EvenThread(int m, int n) {
        this.m = m;
        this.n = n;
    }

    
    public void run() {
        for (int i = m; i <= n; i++) {
            if (i % 2 == 0) { 
                System.out.println("Child thread: " + i);
            }
        }
    }
}


class Driver {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		System.out.print("enter M: ");
		int M=sc.nextInt();
		System.out.print("enter N: ");
		int N=sc.nextInt();
        
        EvenThread et = new EvenThread(M, N);
        Thread t = new Thread(et);
		t.start();
        for (int i = M; i <= N; i++) {
            if (i % 2 == 1){ 
                System.out.println("Main thread: " + i);
            }
        }
    }
}