import java.awt.*;
import java.awt.event.*;

public class CalculatorAWT extends Frame implements ActionListener {
    Label l1, l2, l3;
    TextField tf1, tf2, tfResult;
    Button add, sub, mul, div;

    CalculatorAWT() {
        setTitle("Simple Calculator");
        setSize(400, 250);
        setLayout(new FlowLayout());
        setVisible(true);

        l1 = new Label("Number 1:");
        tf1 = new TextField(10);

        l2 = new Label("Number 2:");
        tf2 = new TextField(10);

        l3 = new Label("Result:");
        tfResult = new TextField(10);
        tfResult.setEditable(false);

        add = new Button("Add");
        sub = new Button("Subtract");
        mul = new Button("Multiply");
        div = new Button("Divide");

        // Adding ActionListener to buttons
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);

        // Adding components to the frame
        add(l1); add(tf1);
        add(l2); add(tf2);
        add(l3); add(tfResult);

        add(add); add(sub); add(mul); add(div);

        // Closing the window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double n1 = Double.parseDouble(tf1.getText());
            double n2 = Double.parseDouble(tf2.getText());
            double result = 0;

            if (e.getSource() == add) {
                result = n1 + n2;
            } else if (e.getSource() == sub) {
                result = n1 - n2;
            } else if (e.getSource() == mul) {
                result = n1 * n2;
            } else if (e.getSource() == div) {
                if (n2 != 0)
                    result = n1 / n2;
                else {
                    tfResult.setText("Error: Divide by zero");
                    return;
                }
            }

            tfResult.setText(String.valueOf(result));
        } catch (NumberFormatException ex) {
            tfResult.setText("Invalid input!");
        }
    }

    public static void main(String[] args) {
        new CalculatorAWT();
    }
}
