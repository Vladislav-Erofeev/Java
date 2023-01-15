/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package ex.task27;

public class MyArrayList <T> {
    private int currentSize = 0;
    private int size;
    private T[] array;

    public MyArrayList() {
        size = 10;
        array = (T[])(new Object[10]);
    }

    public void add(T element) {
        if((double)currentSize / size >= 0.75) {
            size *= 1.5;
            T[] newArray = (T[])(new Object[size]);
            for(int i = 0; i < currentSize; i++) {
                newArray[i] = array[i];
                array = newArray;
            }
        }
        array[currentSize] = element;
        currentSize++;
    }

    public T get(int i) throws ArrayIndexOutOfBoundsException{
        if(i >= currentSize)
            throw new ArrayIndexOutOfBoundsException("Index " + i + " out of bounds");
        return array[i];
    }

    public int getSize() {
        return currentSize;
    }
}
