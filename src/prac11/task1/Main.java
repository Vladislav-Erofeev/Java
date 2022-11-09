/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac11.task1;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date taskTime = new Date(1666693131859L);
        System.out.println("Студент: Ерофеев Владислав\n" + "Дата получения задания: " +
                taskTime + "\nДата выполнения: " + new Date(System.currentTimeMillis()));
    }
}

//1666693131859
