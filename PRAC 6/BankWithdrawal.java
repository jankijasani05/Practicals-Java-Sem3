import java.util.Scanner;

public class BankWithdrawal {
    public static void main(String[] args) {
        double balance = 10000;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Balance = \u20B9" + balance);
        System.out.print("Withdrawal = \u20B9");
        double withdraw = sc.nextDouble();
        
        try {
            if (withdraw > balance) {
                // Manually trigger the error with a custom message
                throw new IllegalArgumentException("Insufficient balance");
            }
            balance = balance - withdraw;
            System.out.println("Transaction successful. New Balance: \u20B9" + balance);
            
        } catch (IllegalArgumentException e) {
            // e.getMessage() prints the custom string we passed above
            System.out.println("Output: " + e.getMessage()); 
        }
    }
}