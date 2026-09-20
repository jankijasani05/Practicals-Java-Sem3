import java.awt.*;

public class CalculatorGUI {
    public static void main(String[] args) {
        Frame f = new Frame("Calculator");
        
        // Top display field
        TextField display = new TextField("0");
        f.add(display, BorderLayout.NORTH);
        
        // Panel for buttons using a 4x4 Grid
        Panel p = new Panel();
        p.setLayout(new GridLayout(4, 4, 5, 5)); // 4 rows, 4 columns, with gaps
        
        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "+", "="
        };
        
        for (String btnTxt : buttons) {
            p.add(new Button(btnTxt));
        }
        
        f.add(p, BorderLayout.CENTER);
        
        f.setSize(250, 300);
        f.setVisible(true);
    }
}