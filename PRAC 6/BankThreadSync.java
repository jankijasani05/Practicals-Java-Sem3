// The shared bank account
class BankAccount {
    int balance = 5000;

    // Assignment 8: 'synchronized' ensures only one thread does this at a time
    public synchronized void deposit(int amount) {
        System.out.println(Thread.currentThread().getName() + " is depositing: " + amount);
        balance = balance + amount;
        System.out.println("Balance after deposit: " + balance);
    }

    public synchronized void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " is withdrawing: " + amount);
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("Balance after withdrawal: " + balance);
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }
}

// Assignment 6: Creating threads by extending the Thread class
class DepositThread extends Thread {
    BankAccount account;
    
    DepositThread(BankAccount acc) { 
        this.account = acc; 
    }
    
    public void run() { 
        account.deposit(2000); 
    }
}

class WithdrawThread extends Thread {
    BankAccount account;
    
    WithdrawThread(BankAccount acc) { 
        this.account = acc; 
    }
    
    public void run() { 
        account.withdraw(3000); 
    }
}

public class BankThreadSync {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        
        DepositThread dt = new DepositThread(myAccount);
        WithdrawThread wt = new WithdrawThread(myAccount);
        
        dt.setName("Deposit-Thread");
        wt.setName("Withdraw-Thread");

        // Assignment 7: Assigning different priorities (1 is min, 10 is max)
        dt.setPriority(Thread.MAX_PRIORITY); 
        wt.setPriority(Thread.MIN_PRIORITY); 
        
        dt.start();
        wt.start();
    }
}