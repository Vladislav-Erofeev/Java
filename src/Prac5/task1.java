package Prac5;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class task1
{
    public static int milanScore = 0;
    public static int madridScore = 0;
    public static void main(String args[]) {
        JFrame frame = new JFrame("Task 1");
        frame.setSize(500, 500);

        JButton milan = new JButton("AC Milan");
        JButton madrid = new JButton("Real Madrid");

        JLabel scorerer = new JLabel("Last scorerer: DNA ");
        JLabel winner = new JLabel("Winner: DNA ");
        JLabel score = new JLabel("Score: 0x0 ");

        JPanel pan = new JPanel();
        JPanel pan2 = new JPanel();
        pan.add(milan);
        pan.add(madrid);
        pan.add(score);
        pan.add(scorerer);
        pan.add(winner);
        frame.add(pan);

        milan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milanScore++;
                score.setText("Score: " + milanScore + "x" + madridScore);
                scorerer.setText("Last scorerer: AC Milan ");
                if (milanScore > madridScore)
                {
                    winner.setText("Winner: AC Milan");
                }
                else if (milanScore == madridScore)
                {
                    winner.setText("Winner: draw");
                }
                else
                {
                    winner.setText("Winner: Real Madrid");
                }
            }
        });

        madrid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                madridScore++;
                score.setText("Score: " + milanScore + "x" + madridScore);
                scorerer.setText("Last scorerer: Real Madrid ");
                if (milanScore > madridScore)
                {
                    winner.setText("Winner: AC Milan");
                }
                else if(madridScore == milanScore)
                {
                    winner.setText("Winner: draw");
                }
                else
                {
                    winner.setText("Winner: Real Madrid");
                }
            }
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
