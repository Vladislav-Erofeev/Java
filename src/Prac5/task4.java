package Prac5;

import javax.swing.*;
import java.awt.*;
import java.io.File;

class Animation extends JFrame {
    int WINDOW_WIDTH = 600;
    int WINDOW_HEIGHT = 600;
    String animation_images_path = "C:/Users/Forex/IdeaProjects/test_project/src/Lesson4/pictures/";

    Animation() {
        super("Some shapes");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g2) {
        Graphics2D g = (Graphics2D) g2;
        animate(this.animation_images_path, g);
    }

    void animate(String frames_path, Graphics2D g) {
        File dir = new File(frames_path);
        for(int i = 0; i < 20; i++) {
            for (File file : dir.listFiles()) {
                Image frame = Toolkit.getDefaultToolkit().getImage(file.getPath());
                g.drawImage(frame, 0, 0, WINDOW_WIDTH, WINDOW_HEIGHT, this);
                try {
                    Thread.sleep(90);
                } catch (InterruptedException e) {
                }
            }
        }
    }

    public static void main(String[] args) {
        Animation app = new Animation();
    }
}
