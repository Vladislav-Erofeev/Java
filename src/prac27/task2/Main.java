/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac27.task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MyMap map = new MyMap();
        map.addValue("Test1", "Test");
        map.addValue("Test1", "Test");
        map.addValue("Test1", "Test");
        map.addValue("Test4", "Test");
        map.addValue("Test2", "Test");
        map.addValue("Test3", "Test");
        map.addValue("Test1", "Test");
        System.out.println(map.getSameLastNameCount("Test7"));
        System.out.println(map.getSameFirstNameCount("Test"));
    }
}
