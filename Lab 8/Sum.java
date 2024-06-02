
/*class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("The sum of first " + n + " natural numbers is: " + sum);
    }
}
*/


class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;
        Object lock = new Object();
        for (int i = 1; i <= n; i++) {
            Thread t = new Thread(new Adder(i, lock, sum));
            t.start();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("The sum of first " + n + " natural numbers is: " + sum);
    }
}

class Adder implements Runnable {
    int num;
    Object lock;
    int sum;

    public Adder(int num, Object lock, int sum) {
        this.num = num;
        this.lock = lock;
        this.sum = sum;
    }

    public void run() {
        synchronized (lock) {
            sum += num;
        }
    }
}

