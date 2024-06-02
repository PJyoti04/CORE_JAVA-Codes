public class MinimumNumberSearch {

    
    private static int globalMin = Integer.MAX_VALUE;

    public static void main(String[] args) {
        
        int[] numbers = {10, 25, 3, 47, 18, 99, 64, 33, 21, 8};

        
        int numOfThreads = 4;

        
        int blockSize = numbers.length / numOfThreads;

        
        for (int i = 0; i < numOfThreads; i++) {
            int start = i * blockSize;
            int end = (i == numOfThreads - 1) ? numbers.length : (i + 1) * blockSize;
            new Thread(new MinimumFinder(numbers, start, end)).start();
        }
    }


    public synchronized static void updateGlobalMin(int localMin) {
        if (localMin < globalMin) {
            globalMin = localMin;
        }
    }

    
    static class MinimumFinder implements Runnable {
        private final int[] numbers;
        private final int start;
        private final int end;

        public MinimumFinder(int[] numbers, int start, int end) {
            this.numbers = numbers;
            this.start = start;
            this.end = end;
        }

        
        public void run() {
            int localMin = Integer.MAX_VALUE;

            
            for (int i = start; i < end; i++) {
                if (numbers[i] < localMin) {
                    localMin = numbers[i];
                }
            }

            
            synchronized (MinimumNumberSearch.class) {
                updateGlobalMin(localMin);
            }

            System.out.println(Thread.currentThread().getName() + ": Local Minimum = " + localMin);
        }
    }
}
