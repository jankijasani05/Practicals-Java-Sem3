abstract class Payment {
    double amount;

    public Payment(double amt) {
        amount = amt;
    }

    public void displayReceipt() {
        System.out.println("Transaction Total: Rs. " + amount);
    }

    // Abstract method with no body
    abstract void processPayment(); 
}

class CryptoPayment extends Payment {
    String walletAddress;

    public CryptoPayment(double amt, String wallet) {
        super(amt); // Initialize amount in base class
        walletAddress = wallet;
    }

    // Must override the abstract method
    @Override
    void processPayment() {
        System.out.println("Processing secure blockchain transfer...");
        System.out.println("Successfully transferred Rs. " + amount + " to Wallet: " + walletAddress);
    }
}

public class PaymentGatewayDemo {
    public static void main(String[] args) {
        System.out.println("--- Payment Execution ---");
        CryptoPayment crypto = new CryptoPayment(15000.50, "0xABC123DEF456");
        
        crypto.displayReceipt();
        crypto.processPayment();
    }
}