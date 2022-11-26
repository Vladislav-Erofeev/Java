/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac19;

import java.util.Comparator;
import java.util.StringJoiner;
import java.util.Vector;

public class LabClassDriver {
    private LabClass dataBase;

    public LabClassDriver() {
        dataBase = new LabClass();
    }

    public LabClassDriver(LabClass data) {
        dataBase = data;
    }

    // добавление нового студента
    public void addStudent(String name, String group, double GPA) throws EmptyStringException{
        dataBase.addStudent(name, group, GPA);
    }

    // получение таблицы
    public Vector<Vector<String>> getTable() {
        Vector<Vector<String>> students = new Vector<>(0);
        for(int i = 0; i < dataBase.length(); i++) {
            students.add(dataBase.get(i).getDataVector());
        }
        return students;
    }

    // получение студента по id
    public Student getStudent(int id) throws StudentNotFoundException{
        return dataBase.getStudentID(id);
    }

    // сортировка студентов по среднему баллу
    public void setComparator(Comparator comparator) {
        dataBase.setComparator(comparator);
        dataBase.sort();
    }

    public void display() {
        for(int i = 0; i < dataBase.length(); i++) {
            System.out.println(dataBase.get(i).toString());
        }
    }
}
