/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac25;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Test 1: " + find("(3*+*5)*–*9*×*4"));
        System.out.println("Test 2: " + find("((3*+*5)*–*9*)×*4"));
    }

    public static String find(String str) {
        Pattern pattern = Pattern.compile("\\([^()]*\\)");
        Matcher matcher = pattern.matcher(str);
        try {
            matcher.find();
            return matcher.group();
        } catch (IllegalStateException exc) {
            return "";
        }
    }
}
