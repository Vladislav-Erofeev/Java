/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac26.task4;

public class Test {
    public static void main(String[] args) {
        Set<String> stringSet = new Set<>();
        stringSet.add("a");
        stringSet.add(1, "b");
        stringSet.add(2, "c");
        stringSet.add(3, "d");
        stringSet.add(4, "e");
        stringSet.add(5, "f");
        stringSet.add(12, "g");
        try {
            System.out.println(stringSet.get());
            System.out.println(stringSet.get());
            System.out.println(stringSet.get());
            System.out.println(stringSet.get());
            System.out.println(stringSet.get());
            System.out.println(stringSet.get());
            System.out.println(stringSet.get());
            System.out.println(stringSet.get());
        } catch (SetIsEmptyException exc) {
            System.out.println(exc.getMessage());
        }
    }
}
