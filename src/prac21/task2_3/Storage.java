/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac21.task2_3;

public class Storage <T>{
    T[] array;

    public Storage(T[] arr) {
        array = arr;
    }

    public T get(int i) {
        return array[i];
    }
}
