/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac13.task2;

public class Person {
    private String name;
    private String surname;
    private String patronymic;

    public Person(String name, String surname, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public Person(String surname) {
        this.surname = surname;
        name = new String();
        patronymic = new String();
    }

    public String toString() {
        if (name.isEmpty() && patronymic.isEmpty())
            return surname;
        return String.format("%s %s. %s.", surname, name.charAt(0), patronymic.charAt(0));
    }
}
