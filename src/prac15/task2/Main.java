/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac15.task2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    Main() {
        setSize(400, 300);
        String[] items = {"Россия", "Англия", "Китай", "Германия"};
        String[] facts = {"Численность населения: 143,4 миллиона", "Численность населения: 55,98 миллиона", "Численность населения: 1,412 миллиарда", "Численность населения: 83,13 миллиона"};
        JComboBox menu = new JComboBox(items);
        JPanel pan1 = new JPanel();
        JPanel pan2 = new JPanel();
        JLabel label = new JLabel("Выберите страну");
        menu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox box = (JComboBox) e.getSource();
                label.setText(facts[box.getSelectedIndex()]);
            }
        });
        pan2.add(label);
        setLayout(new BorderLayout());
        pan1.add(menu);
        add(menu, BorderLayout.NORTH);
        add(pan2, BorderLayout.CENTER);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Main();
    }
}
