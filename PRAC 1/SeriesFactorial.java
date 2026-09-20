import java.util.Scanner;

public class SeriesFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        double sum = 0.0;

        for (int i = 1; i <= n; i++) {
            // Calculate i squared
            double numerator = Math.pow(i, 2); 
            
            // Calculate factorial of i
            double fact = 1;
            for (int j = 1; j <= i; j++) {
                fact *= j;
            }
            
            sum += numerator / fact;
        }
        
        System.out.println("Sum of the series is: " + sum);
        sc.close();
    }
}