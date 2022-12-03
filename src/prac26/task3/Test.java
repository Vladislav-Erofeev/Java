/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac26.task3;

public class Test {
    public static void main(String[] args) {
        HashTab<String, Integer> hashTab = new HashTab<>();
        hashTab.hashtabAdd("a", 10);
        hashTab.hashtabAdd("b", 20);
        hashTab.hashtabAdd("c", 30);
        hashTab.hashtabAdd("d", 40);
        try {
            System.out.println(hashTab.hashtabLookup("c"));
            hashTab.hashtabDelete("c");
            System.out.println(hashTab.hashtabLookup("c"));
        } catch (KeyNotFound a) {
            System.out.println(a.getMessage());
        }
    }
}
