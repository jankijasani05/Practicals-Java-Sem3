import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;

public class RegistrationEvent extends Frame implements ActionListener {
    
    TextField tName, tFName, tAge;
    TextArea tAddr;
    Label status;

    RegistrationEvent() {
        setLayout(new FlowLayout()); 
        
        tName = new TextField(25);
        tFName = new TextField(25);
        tAge = new TextField(25);
        tAddr = new TextArea(3, 25);
        Button bSave = new Button("Save Details");
        status = new Label("Perform any event...");

        add(new Label("Name:")); add(tName);
        add(new Label("Father Name:")); add(tFName);
        add(new Label("Age:")); add(tAge);
        add(new Label("Address:")); add(tAddr);
        add(bSave);
        add(status);

        bSave.addActionListener(this);

        setSize(300, 450);
        setTitle("Registration");
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // Simple string concatenation for easy reading
        String data = "Name: " + tName.getText() + " | Age: " + tAge.getText() + " | Addr: " + tAddr.getText();
        
        System.out.println(data); // Print to console
        
        try {
            FileWriter fw = new FileWriter("RegistrationData.txt", true);
            fw.write(data + "\n");
            fw.close();
            status.setText("File Saved Successfully!");
        } catch (Exception ex) { 
            status.setText("Error saving file.");
        }
    }

    public static void main(String[] args) {
        new RegistrationEvent();
    }
}