/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac19;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Comparator;
import java.util.Vector;

public class LabClassUI extends JFrame {
    LabClassDriver labClassDriver; // контроллер

    private Vector<String> header = new Vector<>(0); // заголовок таблицы
    LabClassUI(LabClassDriver driver) {
        super("Студенты");
        // устанавливаем контроллер
        labClassDriver = driver;
        JTable table = new JTable(labClassDriver.getTable(), header);
        // создаём заголовок таблицы
        header.add("ID");
        header.add("name");
        header.add("group");
        header.add("GPA");
        JTableHeader head = table.getTableHeader();
        head.setReorderingAllowed(false);
        head.setResizingAllowed(false);

        JPanel pan1 = new JPanel();
        pan1.setLayout(new BoxLayout(pan1, BoxLayout.Y_AXIS));

        JPanel btns = new JPanel();
        JButton find = new JButton("Найти");
        JButton insert = new JButton("Вставить");
        btns.add(find);
        btns.add(insert);
        insert.addActionListener(new AddStudent(table));
        find.addActionListener(new FindStudent());

        String[] sortNames = {"Id", "Средний балл", "Имя", "Группа"};
        Comparator[] sort = {new CompareByID(), new CompareByGPA(), new CompareByName(), new CompareByGroup()};
        JComboBox sortType = new JComboBox(sortNames);
        sortType.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox box = (JComboBox)e.getSource();
                labClassDriver.setComparator(sort[box.getSelectedIndex()]);

                // обновление таблицы
                DefaultTableModel dm = (DefaultTableModel)new JTable(labClassDriver.getTable(), header).getModel();
                table.setModel(dm);
            }
        });
        btns.add(sortType);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);
        pan1.add(head);
        pan1.add(table);
        add(btns, BorderLayout.NORTH);
        add(pan1, BorderLayout.CENTER);
        setVisible(true);
    }

    protected class AddStudent implements ActionListener {
        JTable table;

        AddStudent(JTable table) {
            this.table = table;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JFrame frame = new JFrame("Вставить студента");
            frame.setSize(150, 200);
            frame.setLocationRelativeTo(null);
            JPanel pan1 = new JPanel();
            JLabel name = new JLabel("Имя: ");
            JLabel GPA = new JLabel("Ср. Балл: ");
            JLabel group = new JLabel("Группа: ");
            JButton find = new JButton("Вставить");
            JTextArea nameText = new JTextArea();
            JTextArea GPAText = new JTextArea();
            JTextArea groupText = new JTextArea();
            nameText.setColumns(10);
            GPAText.setColumns(10);
            groupText.setColumns(10);
            pan1.add(name);
            pan1.add(nameText);
            pan1.add(GPA);
            pan1.add(GPAText);
            pan1.add(group);
            pan1.add(groupText);
            pan1.add(find);
            frame.add(pan1);

            find.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        labClassDriver.addStudent(nameText.getText(), groupText.getText(), Double.parseDouble(GPAText.getText()));
                        DefaultTableModel dm = (DefaultTableModel)new JTable(labClassDriver.getTable(), header).getModel();
                        table.setModel(dm);
                        frame.setVisible(false);
                    }  catch (EmptyStringException exc2) {
                        JOptionPane.showMessageDialog(null, "Заполните все строки", "Alert!", JOptionPane.ERROR_MESSAGE);
                    }   catch (NumberFormatException exc1) {
                        JOptionPane.showMessageDialog(null, "Ошибка данных", "Alert!", JOptionPane.ERROR_MESSAGE);
                    }
                }
            });
            frame.setVisible(true);
        }
    }

    protected class FindStudent implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JFrame frame = new JFrame("Найти студента");
            frame.setSize(200, 100);
            frame.setLocationRelativeTo(null);
            JPanel pan1 = new JPanel();
            JLabel id = new JLabel("ID: ");
            JButton find = new JButton("Найти");
            JTextArea text = new JTextArea();
            find.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JFrame result = new JFrame("Результат поиска");
                    result.setSize(400, 100);
                    try {
                        int id = Integer.parseInt(text.getText());
                        Student student = labClassDriver.getStudent(id);
                        Vector<Vector<String>> res = new Vector<>(0);
                        res.add(student.getDataVector());
                        JTable resultTable = new JTable(res, header);
                        JTableHeader head = resultTable.getTableHeader();
                        head.setReorderingAllowed(false);
                        head.setResizingAllowed(false);
                        result.setLayout(new BorderLayout());
                        result.add(head, BorderLayout.NORTH);
                        result.add(resultTable, BorderLayout.CENTER);
                        result.setLocationRelativeTo(null);
                        result.setVisible(true);
                    } catch (NumberFormatException numberFormat) {
                        JOptionPane.showMessageDialog(null, "Ошибка данных", "Alert!", JOptionPane.ERROR_MESSAGE);
                    } catch (StudentNotFoundException notFound) {
                        JOptionPane.showMessageDialog(null, "Такой студент не найден", "Alert!", JOptionPane.ERROR_MESSAGE);
                    }
                }
            });
            text.setColumns(10);
            pan1.add(id);
            pan1.add(text);
            pan1.add(find);
            frame.add(pan1);
            frame.setVisible(true);
        }
    }
}
