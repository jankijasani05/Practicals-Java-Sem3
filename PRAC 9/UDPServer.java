import java.net.*;

public class UDPServer {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(1234);
        byte[] receive = new byte[65535];
        
        System.out.println("UDP Server waiting for messages...");
        DatagramPacket DpReceive = new DatagramPacket(receive, receive.length);
        ds.receive(DpReceive);
        
        // Extract string from byte array
        String data = new String(DpReceive.getData(), 0, DpReceive.getLength());
        System.out.println("Client says: " + data);
        
        ds.close();
    }
}