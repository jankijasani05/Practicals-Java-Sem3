import java.util.Scanner;

// Interface for Bank Account
interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    void checkBalance();
}

// Class implementing the interface
class SavingsAccount implements Account {
    double balance;

    // Constructor to set initial balance
    public SavingsAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Successfully deposited: Rs. " + amount);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Error: Insufficient funds!");
        } else {
            balance = balance - amount;
            System.out.println("Successfully withdrawn: Rs. " + amount);
        }
    }

    public void checkBalance() {
        System.out.println("Current Account Balance: Rs. " + balance);
    }
}

// Main execution class
public class BankMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Hello Janki, enter initial balance to open your Savings Account: ");
        double initial = sc.nextDouble();
        
        // Create the account object
        SavingsAccount myAccount = new SavingsAccount(initial);
        int choice = 0;
        
        // Loop to keep showing the menu until the user enters 4
        while (choice != 4) {
            System.out.println("\n--- Banking Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();
            
            if (choice == 1) {
                System.out.print("Enter amount to deposit: ");
                double depositAmount = sc.nextDouble();
                myAccount.deposit(depositAmount);
            } 
            else if (choice == 2) {
                System.out.print("Enter amount to withdraw: ");
                double withdrawAmount = sc.nextDouble();
                myAccount.withdraw(withdrawAmount);
            } 
            else if (choice == 3) {
                myAccount.checkBalance();
            } 
            else if (choice == 4) {
                System.out.println("Exiting the system. Have a great day!");
            } 
            else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
        
        sc.close();
    }
}