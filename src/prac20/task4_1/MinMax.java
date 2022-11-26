/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac20.task4_1;

public class MinMax <T extends Comparable>{
    T[] arr;
    MinMax(T[] arr) {
        this.arr = arr;
    }

    public T min() {
        T min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min.compareTo(arr[i]) == 1) {
                min = arr[i];
            }
        }
        return min;
    }

    public T max() {
        T max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max.compareTo(arr[i]) == -1) {
                max = arr[i];
            }
        }
        return max;
    }
}
