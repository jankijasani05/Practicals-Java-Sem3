import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ArmstrongClient {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 6666);
            DataInputStream din = new DataInputStream(s.getInputStream());
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number to check: ");
            dout.writeUTF(sc.nextLine());
            
            System.out.println("Server Response: " + din.readUTF());
            
            s.close();
            sc.close();
        } catch(Exception e) { 
            System.out.println(e); 
        }
    }
}