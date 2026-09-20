import java.util.Scanner;
import java.util.InputMismatchException;

public class StudentResultSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // OUTER TRY BLOCK
        try {
            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();
            
            System.out.print("Enter number of subjects: ");
            int n = sc.nextInt();
            int[] marks = new int[n];
            int sum = 0;
            
            for (int i = 0; i < n; i++) {
                System.out.print("Enter mark " + (i+1) + ": ");
                marks[i] = sc.nextInt(); // Triggers InputMismatch if user types text
                sum = sum + marks[i];
            }
            
            // INNER TRY BLOCK 1
            try {
                int average = sum / n; // Triggers ArithmeticException if n is 0
                System.out.println("Average: " + average);
                
                // INNER TRY BLOCK 2
                try {
                    System.out.println("Accessing invalid index to test: " + marks[n]);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Inner Catch 2: ArrayIndexOutOfBoundsException - Invalid subject index accessed.");
                }
                
            } catch (ArithmeticException e) {
                System.out.println("Inner Catch 1: ArithmeticException - Number of subjects is zero.");
            }
            
        } catch (InputMismatchException e) {
            System.out.println("Outer Catch: InputMismatchException - You entered text instead of marks.");
        }
    }
}