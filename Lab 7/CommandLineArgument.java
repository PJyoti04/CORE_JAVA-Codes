// User-defined exception for wrong credentials
class WrongCredentialException extends Exception {
    public WrongCredentialException(String message) {
        super(message);
    }
}

class CommandLineArgsDemo {

    public static void main(String[] args) {
        try {
            checkArguments(args);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: No command-line arguments provided.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: Only one command-line argument provided.");
        } catch (WrongCredentialException e) {
            System.out.println("WrongCredentialException: " + e.getMessage());
        }
    }

    public static void checkArguments(String[] args) throws ArithmeticException, ArrayIndexOutOfBoundsException, WrongCredentialException {
        // Check for no arguments
        if (args.length == 0) {
            throw new ArithmeticException();
        }
        // Check for only one argument
        if (args.length == 1) {
            throw new ArrayIndexOutOfBoundsException();
        }

        // Validate username and password (assuming args[0] as username and args[1] as password)
        String username = args[0];
        String password = args[1];

        // Example validation (You can modify the validation as per your requirements)
        if (!isValidCredential(username, password)) {
            throw new WrongCredentialException("Invalid username or password.");
        }

        System.out.println("Login successful for user: " + username);
    }

    // Dummy method to validate credentials (You can modify this as per your requirements)
    public static boolean isValidCredential(String username, String password) {
        // Dummy validation: Check if username is "admin" and password is "password123"
        return "admin".equals(username) && "password123".equals(password);
    }
}
