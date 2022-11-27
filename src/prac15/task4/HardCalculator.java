package prac15.task4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

class HardCalculator extends JFrame{
    ArrayList<JButton> btns = new ArrayList<>(0);

    public HardCalculator(){
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        setLayout(new BorderLayout());
        JPanel pan1 = new JPanel();
        JPanel pan2 = new JPanel();
        JTextField text = new JTextField(15);
        pan1.add(text);

        btns.add(new JButton("7"));
        btns.add(new JButton("8"));
        btns.add(new JButton("9"));
        btns.add(new JButton("/"));
        btns.add(new JButton("4"));
        btns.add(new JButton("5"));
        btns.add(new JButton("6"));
        btns.add(new JButton("*"));
        btns.add(new JButton("1"));
        btns.add(new JButton("2"));
        btns.add(new JButton("3"));
        btns.add(new JButton("-"));
        btns.add(new JButton("0"));
        btns.add(new JButton("."));
        btns.add(new JButton("="));
        btns.add(new JButton("+"));

        pan2.setLayout(new FlowLayout());
        for(JButton x : btns) {
            pan2.add(x);
        }

        for(int i = 0; i < btns.size(); i++) {
            btns.get(i).setBackground(Color.white);
            btns.get(i).addActionListener(new Click(text));
        }

        JButton clear = new JButton("clear");
        clear.addActionListener(new Click(text));
        pan2.add(clear);
        add(pan1, BorderLayout.NORTH);
        add(pan2, BorderLayout.CENTER);
        setSize(200, 300);
        Dimension screenSize = toolkit.getScreenSize();
        setBounds(screenSize.width/2 - 125, screenSize.height/2 - 150, 200, 300);
    }

    public class Click implements ActionListener {
        JTextField text;
        public Click(JTextField text) {
            this.text = text;
        }

        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand() == "=") {
                try {
                    text.setText(calculate());
                } catch (ArithmeticException exc) {
                    text.setText("Ошибка! Деление на ноль");
                }
            } else if (e.getActionCommand() == "clear"){
                text.setText("");
            } else {
                text.setText(text.getText() + e.getActionCommand());
            }
        }

        protected String calculate() throws ArithmeticException{
            double answer = 0;
            StringBuilder example = new StringBuilder(text.getText());
            for(int i = 0; i < example.length(); i++) {
                if(example.charAt(i) == '*' || example.charAt(i) == '/') {
                    double left;
                    double right;
                    int start;
                    int end;
                    int j = i-1;
                    while(j > 0) {
                        if(example.charAt(j) == '+' || example.charAt(j) == '-' || example.charAt(j) == '*' || example.charAt(j) == '/') {
                            break;
                        }
                        j--;
                    }
                    start = j;
                    if (j == 0) {
                        left = Double.parseDouble(example.substring(j, i));
                    } else {
                        left = Double.parseDouble(example.substring(j+1, i));
                    }

                    j = i+1;
                    while(j < example.length()) {
                        if(example.charAt(j) == '+' || example.charAt(j) == '-' || example.charAt(j) == '*' || example.charAt(j) == '/') {
                            break;
                        }
                        j++;
                    }
                    end = j;
                    right = Double.parseDouble(example.substring(i+1, j));
                    double ans;
                    switch (example.charAt(i)) {
                        case '*':
                            ans = left*right;
                            break;
                        case '/':
                            if (right == 0)
                                throw new ArithmeticException();
                            ans = left/right;
                            break;
                        default:
                            ans = 0;
                    }
                    if (start != 0) {
                        start++;
                    }
                    example.replace(start, end, Double.toString(ans));
                    answer = ans;
                }
            }

            for(int i = 0; i < example.length(); i++) {
                if(example.charAt(i) == '+' || example.charAt(i) == '-') {
                    double left;
                    double right;
                    int start;
                    int end;
                    int j = i-1;
                    while(j > 0) {
                        if(example.charAt(j) == '+' || example.charAt(j) == '-' || example.charAt(j) == '*' || example.charAt(j) == '/') {
                            break;
                        }
                        j--;
                    }
                    start = j;
                    if (j == 0) {
                        left = Double.parseDouble(example.substring(j, i));
                    } else {
                        left = Double.parseDouble(example.substring(j+1, i));
                    }

                    j = i+1;
                    while(j < example.length()) {
                        if(example.charAt(j) == '+' || example.charAt(j) == '-' || example.charAt(j) == '*' || example.charAt(j) == '/') {
                            break;
                        }
                        j++;
                    }
                    end = j;
                    right = Double.parseDouble(example.substring(i+1, j));
                    double ans;
                    switch (example.charAt(i)) {
                        case '+':
                            ans = left+right;
                            break;
                        case '-':
                            ans = left-right;
                            break;
                        default:
                            ans = 0;
                    }
                    if (start != 0) {
                        start++;
                    }
                    example.replace(start, end, Double.toString(ans));
                    answer = ans;
                }
            }
            int temp = (int)answer;
            if(temp - answer == 0) {
                return Integer.toString(temp);
            }
            return Double.toString(answer);
        }
    }

    public static void main(String[]args){
        HardCalculator frame = new HardCalculator();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}