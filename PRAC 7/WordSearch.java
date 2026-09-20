import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class WordSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word to search in JavaFile1.txt: ");
        String searchWord = sc.next();
        int count = 0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader("JavaFile1.txt"));
            String line;
            
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    // Ignore case and punctuation for accurate search
                    if (word.replaceAll("[^a-zA-Z]", "").equalsIgnoreCase(searchWord)) {
                        count++;
                    }
                }
            }
            reader.close();
            System.out.println("The word '" + searchWord + "' occurs " + count + " times.");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        sc.close();
    }
}