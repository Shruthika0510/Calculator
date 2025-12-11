import java.awt.*;
import java.awt.event.*;

public class Calculator extends Frame implements ActionListener {
    TextField display;
    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    Button btnadd, btnsub, btnmul, btndiv, clear, btnequal;

    Calculator() {
        display = new TextField("0");
        display.setBounds(30, 50, 300, 50);
        add(display);

        btn0 = new Button("0");
        btn1 = new Button("1");
        btn2 = new Button("2");
        btn3 = new Button("3");
        btn4 = new Button("4");
        btn5 = new Button("5");
        btn6 = new Button("6");
        btn7 = new Button("7");
        btn8 = new Button("8");
        btn9 = new Button("9");

        btnadd = new Button("+");
        btnsub = new Button("-");
        btnmul = new Button("*");
        btndiv = new Button("/");
        clear = new Button("C");
        btnequal = new Button("=");

        // Number buttons
        btn1.setBounds(30, 120, 80, 80);
        btn2.setBounds(120, 120, 80, 80);
        btn3.setBounds(210, 120, 80, 80);

        btn4.setBounds(30, 210, 80, 80);
        btn5.setBounds(120, 210, 80, 80);
        btn6.setBounds(210, 210, 80, 80);

        btn7.setBounds(30, 300, 80, 80);
        btn8.setBounds(120, 300, 80, 80);
        btn9.setBounds(210, 300, 80, 80);

        btn0.setBounds(30, 390, 80, 80);
        clear.setBounds(120, 390, 80, 80);

        // Operators
        btnadd.setBounds(300, 120, 80, 80);
        btnsub.setBounds(300, 210, 80, 80);
        btnmul.setBounds(300, 300, 80, 80);
        btndiv.setBounds(300, 390, 80, 80);

        // Equal
        btnequal.setBounds(210, 390, 80, 80);

        // Add all
        add(btn0); add(btn1); add(btn2); add(btn3); add(btn4);
        add(btn5); add(btn6); add(btn7); add(btn8); add(btn9);
        add(clear);
        add(btnadd); add(btnsub); add(btnmul); add(btndiv);
        add(btnequal);

        // Add listeners
        btn0.addActionListener(this);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);

        btnadd.addActionListener(this);
        btnsub.addActionListener(this);
        btnmul.addActionListener(this);
        btndiv.addActionListener(this);

        clear.addActionListener(this);
        btnequal.addActionListener(this);

        setLayout(null);
        setSize(420, 520);
        setTitle("Calculator");
        setVisible(true);
    }

    public static void main(String[] args) {
        new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn0) {
            String s = display.getText();
            display.setText(s + "0");
        }
        if (e.getSource() == btn1) {
            String s = display.getText();
            display.setText(s + "1");
        }
        if (e.getSource() == btn2) {
            String s = display.getText();
            display.setText(s + "2");
        }
        if (e.getSource() == btn3) {
            String s = display.getText();
            display.setText(s + "3");
        }
        if (e.getSource() == btn4) {
            String s = display.getText();
            display.setText(s + "4");
        }
        if (e.getSource() == btn5) {
            String s = display.getText();
            display.setText(s + "5");
        }
        if (e.getSource() == btn6) {
            String s = display.getText();
            display.setText(s + "6");
        }
        if (e.getSource() == btn7) {
            String s = display.getText();
            display.setText(s + "7");
        }
        if (e.getSource() == btn8) {
            String s = display.getText();
            display.setText(s + "8");
        }
        if (e.getSource() == btn9) {
            String s = display.getText();
            display.setText(s + "9");
        }
        if (e.getSource() == clear) {
            display.setText("0");
        }
        if (e.getSource() == btnadd) {
            display.setText(display.getText() + "+");
        }
        if (e.getSource() == btnsub) {
            display.setText(display.getText() + "-");
        }
        if (e.getSource() == btnmul) {
            display.setText(display.getText() + "*");
        }
        if (e.getSource() == btndiv) {
            display.setText(display.getText() + "/");
        }
        if (e.getSource() == btnequal) {
            String expression = display.getText();
            String tempa = "", tempb = "";
            char operator = '+';
            int i;
            for (i = 0; i < expression.length(); i++) {
                if (Character.isDigit(expression.charAt(i))) {
                    tempa += expression.charAt(i);
                } else {
                    operator = expression.charAt(i);
                    break;
                }
            }
            tempb = expression.substring(i + 1);
            int a = Integer.parseInt(tempa);
            int b = Integer.parseInt(tempb);
            int result = 0;
            switch (operator) {
                case '+': result = a + b; break;
                case '-': result = a - b; break;
                case '*': result = a * b; break;
                case '/': if (b != 0) result = a / b; else { display.setText("Error"); return; } break;
            }
            display.setText(String.valueOf(result));
        }
    }
}

