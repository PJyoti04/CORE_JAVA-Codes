// User-defined exception for minimum balance
class MinimumBalanceException extends Exception {
    public MinimumBalanceException(String message) {
        super(message);
    }
}

// BankAccount class definition
class BankAccount {
    private String accName;
    private int accNum;
    private double accBalance;
    private static final double MIN_BALANCE = 500.0;

    // Constructor
    public BankAccount(String accName, int accNum, double accBalance) {
        this.accName = accName;
        this.accNum = accNum;
        if (accBalance < MIN_BALANCE) {
            System.out.println("Initial balance cannot be less than " + MIN_BALANCE);
            this.accBalance = MIN_BALANCE;
        } else {
            this.accBalance = accBalance;
        }
    }

    // Method to deposit amount
    public void deposit(double amt) {
        accBalance += amt;
        System.out.println("Amount " + amt + " deposited successfully. New balance: " + accBalance);
    }

    // Method to withdraw amount
    public void withdraw(double amt) throws MinimumBalanceException {
        if (accBalance - amt < MIN_BALANCE) {
            throw new MinimumBalanceException("Withdrawal not allowed due to minimum balance constraint.");
        }
        accBalance -= amt;
        System.out.println("Amount " + amt + " withdrawn successfully. New balance: " + accBalance);
    }

    // Method to transfer amount between two accounts
    public static void transfer(BankAccount acc1, BankAccount acc2, double amt) throws MinimumBalanceException {
        if (acc1.accBalance - amt < MIN_BALANCE) {
            throw new MinimumBalanceException("Transfer not allowed from " + acc1.accName + " due to minimum balance constraint.");
        }
        acc1.withdraw(amt);  // Withdraw from acc1
        acc2.deposit(amt);   // Deposit to acc2
        System.out.println("Amount " + amt + " transferred successfully from " + acc1.accName + " to " + acc2.accName);
    }

    // Getter methods
    public String getAccName() {
        return accName;
    }

    public int getAccNum() {
        return accNum;
    }

    public double getAccBalance() {
        return accBalance;
    }

    // Setter methods (optional based on requirements)
    public void setAccName(String accName) {
        this.accName = accName;
    }

    public void setAccNum(int accNum) {
        this.accNum = accNum;
    }

    public void setAccBalance(double accBalance) {
        this.accBalance = accBalance;
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("John", 101, 700.0);
        BankAccount account2 = new BankAccount("Doe", 102, 800.0);

        try {
            BankAccount.transfer(account1, account2, 200.0);
        } catch (MinimumBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
