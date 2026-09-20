import java.awt.*;
import java.awt.event.*;

public class CalculatorEvent extends Frame implements ActionListener {
    
    TextField t;
    String num1 = "", op = "";

    CalculatorEvent() {
        t = new TextField(20);
        add(t, BorderLayout.NORTH);
        
        Panel p = new Panel(new GridLayout(4, 4)); 
        String[] btns = {"7","8","9","/","4","5","6","*","1","2","3","-","0",".","+","="};
        
        for (String b : btns) {
            Button btn = new Button(b);
            btn.addActionListener(this);
            p.add(btn);
        }
        
        add(p, BorderLayout.CENTER);
        setSize(250, 300);
        setTitle("Calculator");
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        
        if (cmd.equals("=")) {
            double n1 = Double.parseDouble(num1);
            double n2 = Double.parseDouble(t.getText());
            
            if (op.equals("+")) t.setText(String.valueOf(n1 + n2));
            if (op.equals("-")) t.setText(String.valueOf(n1 - n2));
            if (op.equals("*")) t.setText(String.valueOf(n1 * n2));
            if (op.equals("/")) t.setText(String.valueOf(n1 / n2));
            
        } else if (cmd.equals("+") || cmd.equals("-") || cmd.equals("*") || cmd.equals("/")) {
            op = cmd;
            num1 = t.getText();
            t.setText("");
        } else {
            t.setText(t.getText() + cmd);
        }
    }

    public static void main(String[] args) {
        new CalculatorEvent();
    }
}