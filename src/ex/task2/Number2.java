/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package ex.task2;

import java.util.HashMap;
import java.util.Map;

public class Number2 {
    public static void main(String[] args) {
        Map<Integer, String> testMap1 = new HashMap<>(0);
        testMap1.put(1, "test1");
        testMap1.put(2, "test2");
        testMap1.put(3, "test3");
        testMap1.put(4, "test4");
        testMap1.put(5, "test5");

        Map<String, Integer> newMap = reverseMap(testMap1);
//        System.out.println(newMap.get("test4"));
        long time = System.currentTimeMillis();
        System.out.println(time);
        System.out.println(System.currentTimeMillis() - time);
    }

    public static Map<String, Integer> reverseMap(Map<Integer, String> map) {
        Map<String, Integer> newMap = new HashMap<>();
        for(Map.Entry<Integer, String> item : map.entrySet()) {
            newMap.put(item.getValue(), item.getKey());
        }
        return newMap;
    }
}
