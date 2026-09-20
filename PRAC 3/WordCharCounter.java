import java.util.Scanner;

public class WordCharCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();
        
        int totalChars = text.length();
        
        // split("\\s+") splits the string by spaces to count words
        String[] words = text.trim().split("\\s+");
        int totalWords = text.trim().isEmpty() ? 0 : words.length;
        
        System.out.println("Total Characters (including spaces): " + totalChars);
        System.out.println("Total Words: " + totalWords);
        sc.close();
    }
}