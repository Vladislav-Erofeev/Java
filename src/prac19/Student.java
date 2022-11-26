/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac19;

import prac14.task1.Str;

import java.util.Vector;

public class Student {
    private static int count = 0;
    private String name;
    private int id;
    private String group;
    private double GPA;

    public Student(String name, String group, double GPA) {
        this.name = name;
        count++;
        id = count;
        this.group = group;
        this.GPA = GPA;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Student.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public Vector<String> getDataVector() {
        Vector<String> temp = new Vector<>(0);
        temp.add(Integer.toString(id));
        temp.add(name);
        temp.add(group);
        temp.add(Double.toString(GPA));
        return temp;
    }

    public String toString() {
        return name + " " + GPA + " id: " + id;
    }
}
