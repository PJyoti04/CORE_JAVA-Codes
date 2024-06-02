
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends Frame implements ActionListener {
    private TextField textField;
    private String operator;
    private double firstOperand;

    public Calculator() {
        textField = new TextField();
        operator = "";
        firstOperand = 0.0;

        // Set layout manager
        setLayout(new BorderLayout());

        // Add components
        add(textField, BorderLayout.NORTH);
        Panel buttonPanel = new Panel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        for (String label : buttonLabels) {
            Button button = new Button(label);
            button.addActionListener(this);
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);

        // Set frame properties
        setTitle("Calculator");
        setSize(300, 400);
        setLocationRelativeTo(null); // Center the frame
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        switch (command) {
            case "=":
                calculateResult();
                break;
            case ".":
                if (!textField.getText().contains(".")) {
                    textField.setText(textField.getText() + command);
                }
                break;
            default:
                if (Character.isDigit(command.charAt(0))) {
                    textField.setText(textField.getText() + command);
                } else {
                    operator = command;
                    firstOperand = Double.parseDouble(textField.getText());
                    textField.setText("");
                }
                break;
        }
    }

    private void calculateResult() {
        double result;
        double secondOperand = Double.parseDouble(textField.getText());

        switch (operator) {
            case "+":
                result = firstOperand + secondOperand;
                break;
            case "-":
                result = firstOperand - secondOperand;
                break;
            case "*":
                result = firstOperand * secondOperand;
                break;
            case "/":
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                } else {
                    textField.setText("Error");
                    return;
                }
                break;
            default:
                return;
        }

        textField.setText(String.valueOf(result));
        operator = "";
        firstOperand = result;
    }
}
