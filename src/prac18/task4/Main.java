/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac18.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Исключение было перехвачено");
        }
    }
}
