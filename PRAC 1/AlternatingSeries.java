import java.util.Scanner;

public class AlternatingSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the maximum odd value (n): ");
        int n = sc.nextInt();
        int sum = 0;
        int sign = 1; // Used to alternate between addition and subtraction

        for (int i = 1; i <= n; i += 2) {
            sum += (i * sign);
            sign *= -1; // Flip the sign for the next iteration
        }
        
        System.out.println("Sum of the series up to " + n + " is: " + sum);
        sc.close();
    }
}