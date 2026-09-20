import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text to save in JavaFile1.txt:");
        String content = sc.nextLine();

        try {
            FileWriter writer = new FileWriter("JavaFile1.txt");
            writer.write(content);
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        sc.close();
    }
}