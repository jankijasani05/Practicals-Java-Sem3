// Thread 1: ATM Steps
class ATMSteps implements Runnable {
    public void run() {
        try {
            System.out.println("ATM: Card Inserted");
            Thread.sleep(1000); 
            System.out.println("ATM: PIN Verified");
            Thread.sleep(1000);
            System.out.println("ATM: Transaction Processing");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

// Thread 2: Phone Notifications
class AccountNotification implements Runnable {
    public void run() {
        try {
            Thread.sleep(500); // Start half a second later so messages mix nicely
            System.out.println("Notification: Checking Balance");
            Thread.sleep(1000);
            System.out.println("Notification: Amount Debited");
            Thread.sleep(1000);
            System.out.println("Notification: SMS Sent");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class ATMSimulation {
    public static void main(String[] args) {
        // Create the runnable objects
        ATMSteps steps = new ATMSteps();
        AccountNotification notification = new AccountNotification();
        
        // Load them into Thread objects
        Thread t1 = new Thread(steps);
        Thread t2 = new Thread(notification);
        
        // Start the threads (runs them parallel)
        t1.start();
        t2.start();
    }
}