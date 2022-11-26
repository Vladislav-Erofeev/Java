/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac19;

import java.util.Comparator;
import java.util.Vector;

public class LabClass {
    private Vector<Student> dataBase; // массив студентов

    private Comparator comparator = new CompareByID(); // объект для сравнения

    public LabClass() {
        dataBase = new Vector<>(0);
    }

    //добавление нового студента в базу данных
    public void addStudent(String name, String group, double GPA) throws EmptyStringException{
        if(name.isEmpty() || group.isEmpty() || GPA == 0)
            throw new EmptyStringException();
        Student newStudent = new Student(name, group, GPA);
        dataBase.add(newStudent);
        dataBase.sort(comparator);
    }

    // получение студента по его id
    public Student getStudentID(int id) throws StudentNotFoundException {
        for(Student x: dataBase) {
            if (x.getId() == id) {
                return x;
            }
        }
        throw new StudentNotFoundException(id);
    }

    // установка нового объекта для сравнения
    public void setComparator(Comparator newComp) {
        comparator = newComp;
    }

    // сортировка базы данных
    public void sort() {
        dataBase.sort(comparator);
    }

    // получение длины массива
    public int length() {
        return dataBase.size();
    }

    // получение студента по индексу
    public Student get(int i) {
        return dataBase.get(i);
    }
}
