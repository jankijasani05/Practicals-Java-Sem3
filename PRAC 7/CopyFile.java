import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("JavaFile1.txt");
            FileOutputStream fos = new FileOutputStream("JavaFile2.txt");

            int data;
            // read() returns -1 when it reaches the end of the file
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }
            
            fis.close();
            fos.close();
            System.out.println("File copied successfully to JavaFile2.txt");
        } catch (IOException e) {
            System.out.println("Error copying file: " + e.getMessage());
        }
    }
}