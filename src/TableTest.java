// Пример работы с простыми таблицами JTable

import javax.swing.*;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.util.*;

public class TableTest extends JFrame
{
    // Данные для таблиц
    private String[][] array = new String[][] {{ "Сахар" , "кг", "1.5" },
            { "Мука"  , "кг", "4.0" },
            { "Молоко", "л" , "2.2" }};
    // Заголовки столбцов
    private String[] columnsHeader = new String[] {"Наименование", "Ед.измерения",
            "Количество"};
    public TableTest() {
        super("Простой пример с JTable");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Данные для таблицы на основе Vector
        Vector<Vector<String>> data = new Vector<Vector<String>>();
        // Вектор с заголовками столбцов
        Vector<String> header = new Vector<String>();
        // Формирование в цикле массива данных
        for (int j = 0; j < array.length; j++) {
            header.add((String)columnsHeader[j]);
            Vector<String> row = new Vector<String>();
            for (int i = 0; i < array[j].length; i++) {
                row.add((String)array[j][i]);
            }
            data.add(row);
        }
        // Таблица на основе вектора
        JTable table3 = new JTable(data, header);
        JButton btn1 = new JButton("test");
        JPanel pan1 = new JPanel();
        JTableHeader head = table3.getTableHeader();
        head.setReorderingAllowed(false);
        head.setResizingAllowed(false);
        pan1.setLayout(new BoxLayout(pan1, BoxLayout.Y_AXIS));
        pan1.add(head);
        pan1.add(table3);
        add(btn1, BorderLayout.NORTH);
        add(pan1, BorderLayout.CENTER);
        setSize(500, 400);
        setVisible(true);
    }
    public static void main(String[] args) {
        new TableTest();
    }
}