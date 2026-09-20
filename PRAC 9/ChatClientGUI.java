import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

public class ChatClientGUI extends Frame implements ActionListener {
    TextField tMsg;
    TextArea chatArea;
    DataOutputStream dout;

    ChatClientGUI() {
        setLayout(new FlowLayout());
        
        chatArea = new TextArea(10, 30);
        tMsg = new TextField(20);
        Button bSend = new Button("Send");
        
        add(chatArea); add(tMsg); add(bSend);
        bSend.addActionListener(this);
        
        setSize(300, 300);
        setTitle("Client Chat");
        setVisible(true);
        
        startClient();
    }

    public void actionPerformed(ActionEvent e) {
        try {
            String msg = tMsg.getText();
            chatArea.append("Client: " + msg + "\n");
            dout.writeUTF(msg);
            tMsg.setText("");
        } catch (Exception ex) {}
    }
    
    private void startClient() {
        try {
            Socket s = new Socket("localhost", 3333);
            chatArea.append("Connected to Server!\n");
            
            DataInputStream din = new DataInputStream(s.getInputStream());
            dout = new DataOutputStream(s.getOutputStream());
            
            new Thread(() -> {
                try {
                    String str = "";
                    while (!str.equals("stop")) {
                        str = din.readUTF();
                        chatArea.append("Server: " + str + "\n");
                    }
                } catch (Exception ex) {}
            }).start();
            
        } catch (Exception ex) {}
    }

    public static void main(String[] args) {
        new ChatClientGUI();
    }
}