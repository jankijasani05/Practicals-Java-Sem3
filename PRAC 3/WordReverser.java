import java.util.Scanner;
import java.util.StringTokenizer;

public class WordReverser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();
        
        StringTokenizer st = new StringTokenizer(input, " ");
        StringBuilder finalOutput = new StringBuilder();
        
        while (st.hasMoreTokens()) {
            String word = st.nextToken();
            // Use StringBuilder to easily reverse the individual word
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            finalOutput.append(reversedWord).append(" ");
        }
        
        System.out.println("Output: \"" + finalOutput.toString().trim() + "\"");
        sc.close();
    }
}