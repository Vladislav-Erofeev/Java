/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac26.task3;

public class HashTab<K, V> {
    private HashElement<K, V>[] arr;
    private int maxSize;
    private int currentSize = 0;

    public HashTab () {
        maxSize = 10;
        arr = new HashElement[10];
    }

    public void hashtabAdd(K key, V value) {
        arr[key.hashCode() % maxSize] = new HashElement(key, value);
        currentSize++;
        if ((double)currentSize / (double)maxSize >= 0.5)
            resize();
    }

    public void resize() {
        maxSize = (int)Math.round(maxSize*1.5);
        HashElement[] newArr = new HashElement[maxSize];
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == null)
                continue;
            newArr[arr[i].getKey().hashCode() % maxSize] = arr[i];
        }
        arr = newArr;
    }

    public int size() {
        return maxSize;
    }

    public V hashtabLookup(K key) throws KeyNotFound{
        if (arr[key.hashCode() % maxSize] == null)
            throw new KeyNotFound();
        return arr[key.hashCode() % maxSize].getValue();
    }

    public void hashtabDelete(K key) {
        arr[key.hashCode() % maxSize] = null;
    }
}
