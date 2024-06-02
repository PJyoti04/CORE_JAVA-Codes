class Final {

    public static void main(String[] args) {
        int result = 0;
        try {
            result = divide(10, 0);
        }
		catch (ArithmeticException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

		finally {
            System.out.println("Finally block of main");
        }
        System.out.println("Result: " + result);
    }

    static int divide(int a, int b) throws ArithmeticException {
        try {
            return a / b;
        } 
		finally {
            System.out.println("Finally block of divide");
        }
    }
}
