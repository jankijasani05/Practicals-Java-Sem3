import java.net.*;

public class UDPClient {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket();
        InetAddress ip = InetAddress.getLocalHost();
        
        String msg = "Hello UDP Server!";
        byte[] buf = msg.getBytes();
        
        DatagramPacket DpSend = new DatagramPacket(buf, buf.length, ip, 1234);
        ds.send(DpSend);
        
        System.out.println("Message sent to server.");
        ds.close();
    }
}