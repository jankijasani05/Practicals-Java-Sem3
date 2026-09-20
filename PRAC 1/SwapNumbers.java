public class SwapNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before Swap: a = " + a + ", b = " + b);

        // Swapping using addition and subtraction
        a = a + b; // a becomes 30
        b = a - b; // b becomes 10 (which was a)
        a = a - b; // a becomes 20 (which was b)

        System.out.println("After Swap: a = " + a + ", b = " + b);
    }
}