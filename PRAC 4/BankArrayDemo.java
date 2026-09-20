import java.util.Scanner;

// Reusing BankAccount class structure for an array context
class CustomerAccount {
    long accountNumber;
    String accountHolderName;
    double balance;

    public void acceptData(Scanner sc) {
        System.out.print("Enter Account Number: ");
        accountNumber = sc.nextLong();
        sc.nextLine(); 
        System.out.print("Enter Account Holder Name: ");
        accountHolderName = sc.nextLine();
        System.out.print("Enter Opening Balance: ");
        balance = sc.nextDouble();
    }

    public void displayAccountDetails() {
        System.out.println("A/C: " + accountNumber + " | Name: " + accountHolderName + " | Balance: Rs. " + balance);
    }
}

public class BankArrayDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Create an array capable of holding 5 objects
        CustomerAccount[] customers = new CustomerAccount[5];

        System.out.println("Enter details for 5 customers:");
        for (int i = 0; i < 5; i++) {
            System.out.println("\nCustomer " + (i + 1) + ":");
            customers[i] = new CustomerAccount(); // Instantiate each object
            customers[i].acceptData(sc);
        }

        System.out.println("\n--- All Customer Details ---");
        for (int i = 0; i < 5; i++) {
            customers[i].displayAccountDetails();
        }
        sc.close();
    }
}