/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac23.task2;

public class ArrayQueue<T> implements Queue{
    private Object[] arr;
    private int size = 0;

    @Override
    public void push(Object value) {
        Object[] temp = new Object[size + 1];
        for(int i = 0; i < size; i++) {
            temp[i] = arr[i];
        }
        temp[size] = value;
        arr = temp;
        size++;
    }

    @Override
    public Object pop() throws IndexOutOfBoundsException{
        Object vale = arr[0];
        Object[] temp = new Object[size - 1];
        for(int i = 1; i < size; i++) {
            temp[i-1] = arr[i];
        }
        arr = temp;
        size--;
        return vale;
    }
}
