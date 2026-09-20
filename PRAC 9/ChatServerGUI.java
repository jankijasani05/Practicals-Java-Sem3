import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

public class ChatServerGUI extends Frame implements ActionListener {
    TextField tMsg;
    TextArea chatArea;
    DataOutputStream dout;

    ChatServerGUI() {
        setLayout(new FlowLayout());
        
        chatArea = new TextArea(10, 30);
        tMsg = new TextField(20);
        Button bSend = new Button("Send");
        
        add(chatArea); add(tMsg); add(bSend);
        bSend.addActionListener(this);
        
        setSize(300, 300);
        setTitle("Server Chat");
        setVisible(true);
        
        startServer();
    }

    public void actionPerformed(ActionEvent e) {
        try {
            String msg = tMsg.getText();
            chatArea.append("Server: " + msg + "\n");
            dout.writeUTF(msg);
            tMsg.setText("");
        } catch (Exception ex) {}
    }
    
    private void startServer() {
        try {
            ServerSocket ss = new ServerSocket(3333);
            chatArea.append("Waiting for client...\n");
            Socket s = ss.accept();
            chatArea.append("Client connected!\n");
            
            DataInputStream din = new DataInputStream(s.getInputStream());
            dout = new DataOutputStream(s.getOutputStream());
            
            // Background thread to constantly listen for incoming messages
            new Thread(() -> {
                try {
                    String str = "";
                    while (!str.equals("stop")) {
                        str = din.readUTF();
                        chatArea.append("Client: " + str + "\n");
                    }
                } catch (Exception ex) {}
            }).start();
            
        } catch (Exception ex) {}
    }

    public static void main(String[] args) {
        new ChatServerGUI();
    }
}