// Shared memory between the two threads
class SharedMemory {
    int currentFibonacciNumber = -1;
    boolean isNewNumberReady = false;

    // Called by FibonacciThread to give a new number
    public synchronized void putNumber(int fib) {
        // If the square thread hasn't read the old number yet, wait.
        while (isNewNumberReady == true) {
            try { wait(); } catch (InterruptedException e) { }
        }
        
        currentFibonacciNumber = fib;
        System.out.println("Fibonacci generated: " + currentFibonacciNumber);
        
        isNewNumberReady = true;
        notify(); // Wake up the Square thread
    }

    // Called by SquareThread to read and square the number
    public synchronized void calculateSquare() {
        // If there is no new number ready, wait.
        while (isNewNumberReady == false) {
            try { wait(); } catch (InterruptedException e) { }
        }
        
        int square = currentFibonacciNumber * currentFibonacciNumber;
        System.out.println("Square calculated: " + square + "\n");
        
        isNewNumberReady = false;
        notify(); // Wake up the Fibonacci thread
    }
}

class FibonacciThread extends Thread {
    SharedMemory memory;
    
    FibonacciThread(SharedMemory mem) { 
        this.memory = mem; 
    }

    public void run() {
        int num1 = 0, num2 = 1;
        memory.putNumber(num1);
        memory.putNumber(num2);
        
        // Generate values up to 20
        while (true) {
            int num3 = num1 + num2;
            if (num3 > 20) {
                break; // Stop if the number exceeds 20
            }
            memory.putNumber(num3);
            num1 = num2;
            num2 = num3;
        }
    }
}

class SquareThread extends Thread {
    SharedMemory memory;
    
    SquareThread(SharedMemory mem) { 
        this.memory = mem; 
    }

    public void run() {
        // There are exactly 9 numbers in the Fibonacci sequence from 0 to 20
        // (0, 1, 1, 2, 3, 5, 8, 13, 21 is too big, so it stops at 13)
        for (int i = 0; i < 8; i++) { 
            memory.calculateSquare();
        }
    }
}

public class FibonacciSync {
    public static void main(String[] args) {
        SharedMemory memory = new SharedMemory();
        FibonacciThread ft = new FibonacciThread(memory);
        SquareThread st = new SquareThread(memory);
        
        ft.start();
        st.start();
    }
}