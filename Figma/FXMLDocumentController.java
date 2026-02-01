package calc;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField text;

    @FXML
    private Button one, two, three, four, five, six, seven, eight, nine, zero;
    @FXML
    private Button addition, subtract, multiply, division, equal, AC;

    private double num1 = 0;
    private double num2 = 0; 
    private String operator = "";
    private boolean start = true;
    @FXML
    private Label label;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // nothing needed
    }

    // ---------- Helper ----------
    private void append(String value) {
        if (start) {
            text.setText(value);
            start = false;
        } else {
            text.setText(text.getText() + value);
        }
    }
     // ---------- Helper: remove .0 ----------
    private String format(double n) {
        if (n == (long) n)
            return String.valueOf((long) n);
        else
            return String.valueOf(n);
    }

                              //  Number Buttons
    private void one(ActionEvent e) 
    { 
        append("1"); 
    }
    private void two(ActionEvent e) 
    { 
        append("2"); 
    }
    private void three(ActionEvent e) 
    { 
        append("3"); 
    }
    private void four(ActionEvent e) 
    { 
        append("4"); 
    }
    private void five(ActionEvent e) 
    { 
        append("5"); 
    }
    private void six(ActionEvent e) 
    { 
        append("6"); 
    }
    private void seven(ActionEvent e) 
    { 
        append("7"); 
    }
    private void eight(ActionEvent e) 
    { 
        append("8"); 
    }
    private void nine(ActionEvent e) 
    {
        append("9"); 
    }
    private void zero(ActionEvent e) 
    { 
        append("0"); 
    }

    // ---------- Operators ----------
@FXML
private void add(ActionEvent event) {
    num1 = Double.parseDouble(text.getText());
    operator = "+";
    text.setText(text.getText() + "+");
    start = false;
}

@FXML
private void sub(ActionEvent event) {
    num1 = Double.parseDouble(text.getText());
    operator = "-";
    text.setText(text.getText() + "-");
    start = false;
}

@FXML
private void mul(ActionEvent event) {
    num1 = Double.parseDouble(text.getText());
    operator = "*";
    text.setText(text.getText() + "×");
    start = false;
}

@FXML
private void div(ActionEvent event) {
    num1 = Double.parseDouble(text.getText());
    operator = "/";
    text.setText(text.getText() + "/");
    start = false;
}


    private void setOperator(String op) {
        num1 = Double.parseDouble(text.getText());
        operator = op;
        start = true;
    }

    // ---------- Equal (Main Logic) ----------
    @FXML
private void eql(ActionEvent event) {

    String expression = text.getText(); // "1+2"

    String[] parts;
    double result = 0;

    if (operator.equals("+")) {
        parts = expression.split("\\+");
        num2 = Double.parseDouble(parts[1]);
        text.setText(format(num1) + "+" + format(num2) + "=" + format(num1 + num2));
    }

    else if (operator.equals("-")) {
        parts = expression.split("-");
        num2 = Double.parseDouble(parts[1]);
        text.setText(format(num1) + "-" + format(num2) + "=" + format(num1 - num2));
    }

    else if (operator.equals("*")) {
        parts = expression.split("×");
        num2 = Double.parseDouble(parts[1]);
        text.setText(format(num1) + "×" + format(num2) + "=" + format(num1 * num2));
    }

    else if (operator.equals("/")) {
        parts = expression.split("/");
        num2 = Double.parseDouble(parts[1]);
        text.setText(format(num1) + "/" + format(num2) + "=" + format(result));
    }

    start = true;
}



    // ---------- ENTER key support ----------
    @FXML
    private void txt(ActionEvent e) {
        eql(e);   // pressing ENTER = pressing =
    }

    // ---------- Clear ----------
    private void ac(ActionEvent e) {
        text.clear();
        num1 = 0;
        operator = "";
        start = true;
    }

    @FXML
    private void one1(ActionEvent event) 
    {
        append("1");
    }

    @FXML
    private void two2(ActionEvent event) 
    {
        append("2");
    }

    @FXML
    private void three3(ActionEvent event) 
    {
        append("3");
    }

    @FXML
    private void four4(ActionEvent event) 
    {
        append("4");
    }

    @FXML
    private void five5(ActionEvent event) 
    {
        append("5");
    }

    @FXML
    private void six6(ActionEvent event) 
    {
        append("6");
    }

    @FXML
    private void seven7(ActionEvent event) 
    {
        append("7");
    }

    @FXML
    private void eight8(ActionEvent event) 
    {
        append("8");
    }

    @FXML
    private void nine9(ActionEvent event) 
    {
        append("9");
    }

    @FXML
    private void zero0(ActionEvent event) 
    {
        append("0");
    }

    @FXML
    private void acbutton(ActionEvent event) 
    {
         text.clear();
         start = true;
    }
}
