package prac10;

import java.util.Comparator;

public class Student
{
    private String name;
    private String Surname;
    private int kurs;
    private int group;

    private double averageScore;

    public Student(String name, String surname, int kurs, int group, double average) {
        this.name = name;
        Surname = surname;
        this.kurs = kurs;
        this.group = group;
        averageScore = average;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public int getKurs() {
        return kurs;
    }

    public void setKurs(int kurs) {
        this.kurs = kurs;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }
}
