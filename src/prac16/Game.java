/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Game extends JFrame {
    JPanel pan1 = new JPanel();
    JPanel pan2 = new JPanel();
    JPanel pan3 = new JPanel();
    JPanel pan4 = new JPanel();
    JPanel pan5 = new JPanel();

    int ans;
    int counter = 5;
    Game() {
        super("Угадайка");
        setSize(500, 500);
        setLocationRelativeTo(null);
        pan1.setBackground(Color.CYAN);
        pan2.setBackground(Color.WHITE);
        pan3.setBackground(Color.YELLOW);
        pan4.setBackground(Color.RED);
        pan5.setBackground(Color.GRAY);
        setLayout(new BorderLayout());
        Mouse mouse = new Mouse();
        pan1.addMouseListener(mouse);
        pan2.addMouseListener(mouse);
        pan3.addMouseListener(mouse);
        pan4.addMouseListener(mouse);
        pan5.addMouseListener(mouse);
        ans = (int)(Math.random() * 20);

        JButton btnOff = new JButton("Отключить скрипт");
        pan5.add(btnOff);
        btnOff.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pan1.removeMouseListener(mouse);
                pan2.removeMouseListener(mouse);
                pan3.removeMouseListener(mouse);
                pan4.removeMouseListener(mouse);
                pan5.removeMouseListener(mouse);
            }
        });

        JTextField field = new JTextField(40);
        pan1.setLayout(new FlowLayout());
        pan1.add(field);
        JButton btn = new JButton("Попробовать");
        pan1.add(btn);

        JLabel trys = new JLabel("Количество попыток: " + counter);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(counter == 0) {
                    JOptionPane.showMessageDialog(null, "Ваши попытки кончились", "alert", JOptionPane.ERROR_MESSAGE);
                    System.exit(0);
                }
                try {
                    int userAns = Integer.parseInt(field.getText());
                    if(userAns == ans) {
                        JOptionPane.showMessageDialog(null, "Поздравляем, вы выиграли", "Победа!", JOptionPane.INFORMATION_MESSAGE);
                        System.exit(0);
                    } else if (userAns > ans) {
                        JOptionPane.showMessageDialog(null, "Ваше число больше ответа", "Предупреждение", JOptionPane.WARNING_MESSAGE);
                        counter--;
                        trys.setText("Количество попыток: " + counter);
                    } else {
                        JOptionPane.showMessageDialog(null, "Ваше число меньше ответа", "Предупреждение", JOptionPane.WARNING_MESSAGE);
                        counter--;
                        trys.setText("Количество попыток: " + counter);
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Ошибка! Вы не ввели число", "alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        pan2.add(trys);

        add(pan1, BorderLayout.CENTER);
        add(pan2, BorderLayout.NORTH);
        add(pan3, BorderLayout.EAST);
        add(pan4, BorderLayout.WEST);
        add(pan5, BorderLayout.SOUTH);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    protected class Mouse extends MouseAdapter {
        @Override
        public void mouseEntered(MouseEvent e) {
            super.mouseEntered(e);
            JPanel pan = (JPanel)e.getSource();
            if(pan.equals(pan1)) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в ЦАО");
            } else if (pan.equals(pan2)) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в САО");
            } else if (pan.equals(pan3)) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в ВАО");
            } else if(pan.equals(pan4)) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в ЗАО");
            } else if(pan.equals(pan5)) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в ЮАО");
            }
        }
    }

    public static void main(String[] args) {
        new Game();
    }
}
