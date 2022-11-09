/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac11.task3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Student {
    private Calendar dateOfBirth;
    private String group;
    private String university;
    private String code;

    private String name;
    SimpleDateFormat pattern = new SimpleDateFormat("dd.MM.YYYY");

    public Student(int day, int month, int year, int hour, int minutes, int seconds, String name, String group, String university, String code) {
        dateOfBirth = Calendar.getInstance();
        dateOfBirth.set(Calendar.DAY_OF_MONTH, day);
        dateOfBirth.set(Calendar.MONTH, month - 1);
        dateOfBirth.set(Calendar.YEAR, year);
        dateOfBirth.set(Calendar.HOUR, hour - 12);
        dateOfBirth.set(Calendar.MINUTE, minutes);
        dateOfBirth.set(Calendar.SECOND, seconds);
        this.name = name;
        this.group = group;
        this.university = university;
        this.code = code;
    }

    public void setDateFormat(String pattern)
    {
        this.pattern = new SimpleDateFormat(pattern);
    }

    public String toString()
    {
        return code + " " + name + " " + group + " " + university + " " + pattern.format(dateOfBirth.getTime());
    }
}
