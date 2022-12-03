/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac27.task1;


import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("a");
        hashSet.add("b");
        hashSet.add("c");

        TreeSet<String> treeSet = new TreeSet<>(hashSet);
        System.out.println(treeSet);
    }
}
