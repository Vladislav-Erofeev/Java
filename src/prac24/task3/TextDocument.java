/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac24.task3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextDocument extends IDocument{

    CreateTextDocument fabric;
    public TextDocument(String str) {
        super(str);
        fabric = new CreateTextDocument();


        openItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fabric.createOpen();
            }
        });

        newItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fabric.createNew();
            }
        });
        super.setPreferredSize(new Dimension(270, 225));
        super.pack();
        super.setLocationRelativeTo(null);
        super.setVisible(true);
    }

    public void addText(String str) {
        JLabel label = new JLabel(str);
        JPanel pan1 = new JPanel();
        pan1.setBackground(Color.GRAY);
        pan1.add(label);
        super.add(pan1);
    }
}
