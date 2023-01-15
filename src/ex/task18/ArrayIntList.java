/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package ex.task18;

public class ArrayIntList {
    private int[] elementData;
    private int size;

    public ArrayIntList(int[] elementData) {
        this.elementData = elementData;
        size = elementData.length;
    }

    public int longestSortedSequence() {
        if(size == 0)
            return 0;
        int max = 1;
        int length = 1;
        for(int i = 1 ; i < size; i++) {
            if(elementData[i] >= elementData[i-1])
                length++;
            else {
                max = Integer.max(length, max);
                length = 1;
            }
        }
        return Integer.max(length, max);
    }
}
