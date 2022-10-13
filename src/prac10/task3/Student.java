package prac10.task3;

public class Student
{
    private String name;
    private String surname;
    private int kurs;
    private int group;

    private double averageScore;

    public Student(String name, String surname, int kurs, int group, double average) {
        this.name = name;
        this.surname = surname;
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
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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

    public String toString()
    {
        return name + " " + surname + " " + kurs + " " + group + " " + averageScore;
    }
}
