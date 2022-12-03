/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac27.task2;


import prac14.task1.Str;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MyMap {
    private Map<String, ArrayList<String>> map;

    public MyMap() {
        map = new HashMap<>();
    }

    public HashMap<String, ArrayList<String>> createMap() {
        return (HashMap<String, ArrayList<String>>) map;
    }

    public void addValue(String key, String value) {
        if(map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            map.put(key, new ArrayList<>());
            map.get(key).add(value);
        }
    }

    public int getSameLastNameCount(String key) {
        if(map.containsKey(key))
            return map.get(key).size();
        return 0;
    }

    public int getSameFirstNameCount(String nam) {
        int count = 0;
        for(Map.Entry<String, ArrayList<String>> item : map.entrySet()){
            for (String name : item.getValue()) {
                if (name.equals(nam))
                    count++;
            }
        }
        return count;
    }
}
