import java.awt.*;
import java.awt.event.*;

public class LoginEvent extends Frame implements ActionListener {
    
    TextField tfUser, tfPass;
    Label lStatus;

    LoginEvent() {
        tfUser = new TextField();
        tfPass = new TextField();
        tfPass.setEchoChar('*');
        Button bLogin = new Button("login");
        lStatus = new Label("Perform any event...");
        
        setLayout(null);
        
        Label l1 = new Label("User"); 
        l1.setBounds(30, 50, 80, 30); 
        add(l1);
        
        tfUser.setBounds(120, 50, 150, 30); 
        add(tfUser);
        
        Label l2 = new Label("Password"); 
        l2.setBounds(30, 100, 80, 30); 
        add(l2);
        
        tfPass.setBounds(120, 100, 150, 30); 
        add(tfPass);
        
        bLogin.setBounds(30, 150, 80, 30); 
        add(bLogin);
        
        lStatus.setBounds(30, 200, 200, 30); 
        add(lStatus);

        bLogin.addActionListener(this);

        setSize(320, 250);
        setTitle("Login Demo");
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String u = tfUser.getText();
        String p = tfPass.getText();
        
        if (u.equals("jankijasani@gmail.com") && p.equals("jank01012006")) {
            lStatus.setText("Login Successful!");
        } else {
            lStatus.setText("Invalid Login");
        }
    }

    public static void main(String[] args) {
        new LoginEvent();
    }
}