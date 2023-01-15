/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package ex.task4;


import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(2);
        set.add(4);
        set.add(6);
        set.add(8);
        set.add(2);
        System.out.println(hasOdd(set));
    }

    public static boolean hasOdd(Set<Integer> set) {
        for(int x : set) {
            if(x % 2 == 1) {
                return true;
            }
        }
        return false;
    }
}
