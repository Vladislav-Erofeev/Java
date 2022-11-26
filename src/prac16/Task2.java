/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task2 extends JFrame {
    Task2() {
        super("test");
        JTextArea textArea = new JTextArea();
        textArea.setColumns(30);
        JPanel pan1 = new JPanel();
        pan1.setLayout(new GridLayout(3,1));
        String[] color = {"Чёрный", "Синий", "Красный", "Жёлтый"};
        Color[] colorArr = {Color.black, Color.blue, Color.red, Color.yellow};
        JComboBox colors = new JComboBox(color);
        String[] font = {"Times New Roman", "MS Sans Serif", "Courier New"};
        textArea.setFont(new Font("Times New Roman", Font.BOLD, 16));
        JComboBox fonts = new JComboBox(font);

        colors.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox box = (JComboBox)e.getSource();
                textArea.setForeground(colorArr[box.getSelectedIndex()]);
            }
        });

        fonts.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox box = (JComboBox)e.getSource();
                textArea.setFont(new Font(box.getSelectedItem().toString(), Font.BOLD, 16));
            }
        });
        pan1.add(textArea);
        pan1.add(colors);
        pan1.add(fonts);
        add(pan1);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Task2();
    }
}
