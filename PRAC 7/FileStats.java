import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileStats {
    public static void main(String[] args) {
        int lines = 0, words = 0, characters = 0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader("JavaFile1.txt"));
            String line;
            
            while ((line = reader.readLine()) != null) {
                lines++;
                characters += line.length(); // Count all characters
                
                // Split the line by spaces to count words
                String[] wordArray = line.trim().split("\\s+");
                if (wordArray.length > 0 && !wordArray[0].isEmpty()) {
                    words += wordArray.length;
                }
            }
            reader.close();
            
            System.out.println("Lines: " + lines);
            System.out.println("Words: " + words);
            System.out.println("Characters: " + characters);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}