/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac25;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        String test1 = "255.255.255.255";
        String test2 = "25.144.123.257";
        String test3 = "255.255.255";
        String test4 = "124.1.0.123";
        System.out.println("Test 1: " + checkIp(test1));
        System.out.println("Test 2: " + checkIp(test2));
        System.out.println("Test 3: " + checkIp(test3));
        System.out.println("Test 4: " + checkIp(test4));
    }

    public static boolean checkIp(String str) {
        return str.matches("^(((25[0-5])|(2[0-4][0-9])|([01][0-9]{2})|([0-9]{1,2}))\\.){3}((25[0-5])|(2[0-4][0-9])|([01][0-9]{2})|([0-9]{1,2}))$");
    }
}
