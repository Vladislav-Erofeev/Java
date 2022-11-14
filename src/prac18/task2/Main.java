/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac18.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException e) {
            System.out.println("Строка не содержит целых чисел");
        } catch (ArithmeticException e) {
            System.out.println("Попытка деления на 0");
        }
    }
}
