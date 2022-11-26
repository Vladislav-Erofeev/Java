
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

class BorderExample extends JFrame{

    public BorderExample(){
        super("frame1");
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        JFrame newF = new JFrame("frame2");
        JButton open = new JButton("open");
        JButton btn = new JButton("<html><h2>Button");
        JPanel pan1 = new JPanel();
        pan1.add(open);
        pan1.add(btn);
        add(pan1);
        JFrame frame = new JFrame("frame2");
        frame.setBounds(screenSize.width/2 - 115, screenSize.height/2 - 140, 300, 300);

        open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(frame.isVisible()) {
                    frame.setVisible(false);
                } else {
                    frame.setVisible(true);
                }
            }
        });
        setBounds(screenSize.width/2 - 125, screenSize.height/2 - 150, 300, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[]args){
        new BorderExample();
    }
}