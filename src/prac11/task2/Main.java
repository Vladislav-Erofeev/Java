/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac11.task2;

import java.util.Date;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Date current = new Date(System.currentTimeMillis());
        int month, year, day, hours, minutes;
        System.out.print("Введите день, месяц, год, часы и минуты: ");
        Scanner in = new Scanner(System.in);
        day = in.nextInt();
        month = in.nextInt()-1;
        year = in.nextInt() - 1900;
        hours = in.nextInt();
        minutes = in.nextInt();
        Date userDate = new Date(year, month, day, hours, minutes);

        //сравниваем текущую дату с системным временем
        if(current.after(new Date(System.currentTimeMillis()))) {
            System.out.println("Текущее время больше системного");
        } else if (current.before(new Date(System.currentTimeMillis()))) {
            System.out.println("Текущее время меньше системного");
        } else {
            System.out.println("Даты равны");
        }

        // сравниваем пользовательское время с системным
        if(userDate.after(new Date(System.currentTimeMillis()))) {
            System.out.println("Пользовательское время больше системного");
        } else if (userDate.before(new Date(System.currentTimeMillis()))) {
            System.out.println("Пользовательское время меньше системного");
        } else {
            System.out.println("Даты равны");
        }
    }
}
