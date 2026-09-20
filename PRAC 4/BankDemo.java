class BankAccount {
    long accountNumber;
    String accountHolderName;
    double balance;

    // Default Constructor
    public BankAccount() {
        accountNumber = 0;
        accountHolderName = "Unknown";
        balance = 0.0;
    }

    // Parameterized Constructor
    public BankAccount(long accNum, String name, double openingBalance) {
        accountNumber = accNum;
        accountHolderName = name;
        balance = openingBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: Rs. " + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: Rs. " + amount);
        } else {
            System.out.println("Withdrawal Failed: Insufficient balance.");
        }
    }

    public void displayBalance() {
        System.out.println("Current Balance: Rs. " + balance);
    }

    public void displayAccountDetails() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        displayBalance();
    }
}

public class BankDemo {
    public static void main(String[] args) {
        // Object 1: Default Constructor
        BankAccount acc1 = new BankAccount();
        acc1.displayAccountDetails();

        // Object 2: Parameterized Constructor
        BankAccount acc2 = new BankAccount(123456789L, "Alice Smith", 5000.0);
        acc2.displayAccountDetails();
        
        acc2.deposit(2000.0);
        acc2.withdraw(1500.0);
        acc2.displayAccountDetails();
    }
}