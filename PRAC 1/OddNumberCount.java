public class OddNumberCount {
    public static void main(String[] args) {
        int count = 0;
        // Loop from 1 to 500
        for (int i = 1; i <= 500; i++) {
            if (i % 2 != 0) { // Check if the number is odd
                count++;
            }
        }
        System.out.println("Total odd numbers between 1 and 500: " + count);
    }
}