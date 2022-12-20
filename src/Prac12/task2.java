package Prac12;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.Random;

public class task2
{
    public static void main(String[] args)
    {
        JFrame window = new JFrame("app");
        window.setVisible(true);
        window.setSize(500, 500);
        window.add(new Shape());
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    static class Shape extends JComponent
    {
        @Override
        protected void paintComponent(Graphics g)
        {
            for(int i = 0; i < 20; i++) {
                Random rand = new Random();
                int n = rand.nextInt(2);
                Graphics2D graph = (Graphics2D) g;
                double x1 = rand.nextInt(500);
                double y1 = rand.nextInt(500);
                double x2 = x1 + (double) (rand.nextInt(100) + 100);
                double y2 = y1 + (double) (rand.nextInt(100) + 100);
                int k = rand.nextInt(5);
                switch (k)
                {
                    case 0:
                        graph.setColor(Color.BLUE);
                        break;
                    case 1:
                        graph.setColor(Color.GREEN);
                        break;
                    case 2:
                        graph.setColor(Color.RED);
                        break;
                    case 3:
                        graph.setColor(Color.YELLOW);
                        break;
                    case 4:
                        graph.setColor(Color.cyan);
                        break;
                    case 5:
                        graph.setColor(Color.magenta);
                        break;
                }
                switch (n) {
                    case 0:
                        Ellipse2D comp = new Ellipse2D.Double(x1, y1, x2, y2);
                        graph.fill(comp);
                        break;
                    case 1:
                        Rectangle2D comp1 = new Rectangle2D.Double(x1, y1, x2, y2);
                        graph.fill(comp1);
                        break;
                }
            }
        }
    }
}
