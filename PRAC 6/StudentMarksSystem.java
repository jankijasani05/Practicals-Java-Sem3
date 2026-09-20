import java.util.Scanner;
import java.util.InputMismatchException;

public class StudentMarksSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Enter number of subjects: ");
            int n = sc.nextInt(); 
            
            int[] marks = new int[n];
            int sum = 0;
            
            for (int i = 0; i < n; i++) {
                System.out.print("Enter marks for subject " + (i + 1) + " (as a string to test format): ");
                String mStr = sc.next();
                marks[i] = Integer.parseInt(mStr); // Converts string to int
                sum = sum + marks[i];
            }
            
            // To manually trigger Array Index error for testing, uncomment below:
            // System.out.println(marks[n]); 
            
            int average = sum / n; 
            System.out.println("Average Marks: " + average);

        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException: You entered text instead of marks.");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Program tries to calculate average when the number of subjects is zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: Program accesses a marks array using an invalid index.");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Marks are entered as a string and converted to an integer incorrectly.");
        }
    }
}