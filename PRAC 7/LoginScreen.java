import java.awt.*;

public class LoginScreen {
    public static void main(String[] args) {
        Frame f = new Frame("Login");
        
        Label lUser = new Label("User");
        lUser.setBounds(30, 50, 80, 30); // x, y, width, height
        
        TextField tfUser = new TextField();
        tfUser.setBounds(120, 50, 150, 30);
        
        Label lPass = new Label("Password");
        lPass.setBounds(30, 100, 80, 30);
        
        TextField tfPass = new TextField();
        tfPass.setBounds(120, 100, 150, 30);
        tfPass.setEchoChar('*'); // Hides password
        
        Button bLogin = new Button("login");
        bLogin.setBounds(30, 160, 80, 30);
        
        Button bRegister = new Button("register");
        bRegister.setBounds(170, 160, 100, 30);
        
        f.add(lUser); f.add(tfUser);
        f.add(lPass); f.add(tfPass);
        f.add(bLogin); f.add(bRegister);
        
        f.setSize(320, 240);
        f.setLayout(null); // Manual positioning
        f.setVisible(true);
    }
}