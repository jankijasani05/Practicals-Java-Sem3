import java.util.Scanner;
import java.util.InputMismatchException;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. ArithmeticException
        try {
            int result = 10 / 0; // Dividing by zero causes an error
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Cannot divide by zero.");
        }

        // 2. ArrayIndexOutOfBoundsException
        try {
            int[] arr = new int[5];
            arr[10] = 50; // Trying to put data in the 10th spot of a 5-spot array
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: Invalid array index.");
        }

        // 3. NumberFormatException
        try {
            int roll = Integer.parseInt("abc"); // Converting text to a number fails
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Marks must be numeric. Enter your roll number: abc");
        }

        // 4. InputMismatchException
        try {
            System.out.print("InputMismatch test (enter a letter instead of an integer): ");
            int num = sc.nextInt(); 
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException: Please enter an integer.");
        }

        // 5. NullPointerException
        try {
            String name = null; // String is empty/null
            System.out.println(name.length()); // Can't find the length of nothing
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: Student name is null.");
        }

        // 6. StringIndexOutOfBoundsException
        try {
            String text = "Java";
            char ch = text.charAt(10); // "Java" only has 4 letters (indexes 0 to 3)
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException: Invalid character index.");
        }

        // 7. IllegalArgumentException
        try {
            int marks = 150;
            if (marks < 0 || marks > 100) {
                // Manually throwing an exception
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: Marks must be between 0 and 100.");
        }
    }
}