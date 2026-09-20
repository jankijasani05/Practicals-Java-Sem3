import java.io.*;
import java.net.*;

public class ArmstrongServer {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(6666);
            System.out.println("Server is waiting for client...");
            Socket s = ss.accept(); 
            
            DataInputStream din = new DataInputStream(s.getInputStream());
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            
            int num = Integer.parseInt(din.readUTF());
            int originalNum = num;
            int result = 0;
            
            while (originalNum != 0) {
                int digit = originalNum % 10;
                result += Math.pow(digit, 3);
                originalNum /= 10;
            }
            
            if (result == num) {
                dout.writeUTF(num + " is an Armstrong number.");
            } else {
                dout.writeUTF(num + " is not an Armstrong number.");
            }
            
            ss.close();
        } catch(Exception e) { 
            System.out.println(e); 
        }
    }
}