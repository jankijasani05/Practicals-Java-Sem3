// Run this using: java StrongNumber 145
public class StrongNumber {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a number as a command line argument.");
            return;
        }

        int num = Integer.parseInt(args[0]);
        int originalNum = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            // Calculate factorial of the digit
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }
            sum += fact;
            num /= 10;
        }

        if (sum == originalNum) {
            System.out.println(originalNum + " is a Strong number.");
        } else {
            System.out.println(originalNum + " is not a Strong number.");
        }
    }
}