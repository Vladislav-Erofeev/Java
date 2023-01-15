/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package ex.task18;

public class Test {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 2, 9, 7, -3, 0, 42, 308, 17 };
        ArrayIntList list = new ArrayIntList(array);
        System.out.println(list.longestSortedSequence());
    }
}
