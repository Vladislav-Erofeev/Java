/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac14.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1: ");
        String[] ans1 = taskOne("test test test1 test2 gsfdh hfdh");
        for (String x : ans1)
            System.out.print(x + ", ");
        System.out.println();

        System.out.println("Задание 2: " + taskTwo("sdfghjkl"));

        System.out.print("задание 3: ");
        String ans = "145 USDT, 34 EUU, 34 EU, 34.23 RUB, 21 USD, 12.34 EU, 23 USDD, 23 RUB";
        System.out.println(taskThree(ans));

        System.out.println("Задание 4: " + taskFour("1 + 2"));

        System.out.println("Задание 5: " + taskFive("29/02/2003"));

        System.out.println("Задание 6: " + taskSix("9385_32546.dfgfdhf@mail.ru"));

        System.out.println("задание 7: " + taskSeven("245bjgfJhjdsfk"));
        String[] arr = {"123", "123456", "1234", "340850427", "dg"};
        System.out.println("Задание 8: ");
        taskEight(arr);
        System.out.println("Задание 9: ");
        taskNine("lkfjlkjdlfj;elrkg");
    }

    public static String[] taskOne(String str) {
        return str.split("\\s+");
    }

    public static boolean taskTwo(String str) {
        return str.matches("abcdefghijklmnopqrstuv18340");
    }

    public static String taskThree(String text) {
        Pattern pattern = Pattern.compile("[0-9]+\\.*[0-9]{1,2}\\s(USD|EU|RUB)\\b");
        Matcher matcher = pattern.matcher(text);
        String result = "";
        try {
            matcher.find();
            result += matcher.group();
        } catch (IllegalStateException e) {
            return "";
        }
        while(matcher.find()) {
            result +=  ", " + matcher.group() ;
        }
        return result.trim();
    }

    public static boolean taskFour(String str) {
        return str.matches(".*(\\+)\\s[0-9]*.*");
    }

    public static boolean taskFive(String str) {
        return str.matches("(([0-2][0-9]|3[0-1])\\/(01|03|05|07|08|10|12)\\/(19[0-9]{2}|[2-9][0-9]{3}))|(([0-2][0-9]|30)\\/(04|06|09|11)\\/(19[0-9]{2}|[2-9][0-9]{3}))|((([01][0-9]|2[0-8])\\/02\\/(19|[2-9][0-9])([02468][1235679]|[13579][13457890]))|(29\\/02\\/(19[0-9]|[2-9][0-9])([02468][048]|[13579][26])))$");
    }

    public static boolean taskSix(String str) {
        return str.matches("^[a-zA-Z0-9\\.__]+@[a-zA-Z]+\\.[a-zA-Z]{2,}");
    }

    public static boolean taskSeven(String str) {
        return str.matches("^.*(?=.{8,})(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).*$");
    }

    public static void taskEight(Object[] arr) {
        Filter filter = new Str();
        Object[] array = filter(arr, filter);
        for (Object x : array) {
            System.out.println(x);
        }
    }

    public static Object[] filter(Object[] arr, Filter filter) {
        int iDeletedCount = 0;
        for(int i = 0; i< arr.length; i++){
            if(!filter.apply(arr[i])){
                iDeletedCount++;
            } else{
                arr[i - iDeletedCount] = arr[i];
            }
        }
        return Arrays.copyOf(arr, arr.length - iDeletedCount);
    }

    public static void taskNine(String str) {
        Map<String, Integer> dictionary = new HashMap<>();
        for(int i = 97; i < 123; i++){
            Pattern pattern = Pattern.compile(Character.toString((char)i));
            Matcher matcher = pattern.matcher(str);
            int count = 0;
            while(matcher.find()) count++;
            dictionary.put(Character.toString((char)i), count);
        }

        System.out.println("Словарь: " + dictionary);
    }
}
