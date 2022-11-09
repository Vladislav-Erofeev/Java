/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac11.task3;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(19, 11, 2003, 10, 11, 3, "Vlad", "IKBO-03-21", "MIREA", "09.03.04");
        System.out.println(student);
        student.setDateFormat("dd.MM.YYYY hh:mm:ss");
        System.out.println(student);
    }
}
