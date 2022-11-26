/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac20.task4_1;

public class Test {
    public static void main(String[] args) {
        Integer[] test = {0, 4, 2,4 ,5, 2, 5, 10, 12};
        MinMax<Integer> minMax = new MinMax<>(test);
        System.out.println(minMax.min());
        System.out.println(minMax.max());
    }
}
