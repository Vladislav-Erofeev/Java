/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac11.task4;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int month, year, day, hours, minutes;
        System.out.print("Введите год, месяц, число, часы и минуты: ");
        Scanner in = new Scanner(System.in);
        year = in.nextInt();
        month = in.nextInt();
        day = in.nextInt();
        hours = in.nextInt();
        minutes = in.nextInt();

        Date userDate = new Date(year-1900, month - 1, day, hours, minutes);

        Calendar date = Calendar.getInstance();
        date.set(Calendar.DAY_OF_MONTH, day);
        date.set(Calendar.MONTH, month - 1);
        date.set(Calendar.YEAR, year);
        date.set(Calendar.HOUR, hours - 12);
        date.set(Calendar.MINUTE, minutes);

        System.out.println("Класс Date: " + userDate);
        System.out.println("Класс Calendar: " + date.getTime());
    }
}
