/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac26.task4;

import java.util.ArrayList;
import java.util.List;

public class HashTab<K, V> {
    private List<HashElement<K, V>>[] arr;
    private int maxSize;
    private int currentSize = 0;

    public HashTab () {
        maxSize = 10;
        arr = new List[10];
    }

    public void hashtabAdd(K key, V value) {
        if (arr[key.hashCode() % maxSize] == null) {
            arr[key.hashCode() % maxSize] = new ArrayList<>(0);
            arr[key.hashCode() % maxSize].add(new HashElement(key, value));
        } else {
            arr[key.hashCode() % maxSize].add(new HashElement(key, value));
        }
        currentSize++;
        if ((double)currentSize / (double)maxSize >= 0.5)
            resize();
    }

    public void resize() {
        maxSize = (int)Math.round(maxSize*1.5);
        List<HashElement<K, V>>[] newArr = new List[maxSize];
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == null)
                continue;
            HashElement temp = arr[i].get(arr[i].size()-1);
            newArr[temp.getKey().hashCode() % maxSize] = arr[i];
        }
        arr = newArr;
    }

    public int size() {
        return maxSize;
    }

    public List<HashElement<K, V>> getList(K key) {
        return arr[key.hashCode() % maxSize];
    }

    public void setList(K key, List<HashElement<K, V>> list) {
        arr[key.hashCode() % maxSize] = list;
    }

    public V hashtabLookup(K key) throws KeyNotFound {
        if (arr[key.hashCode() % maxSize] == null || arr[key.hashCode() % maxSize].isEmpty())
            throw new KeyNotFound();
        V temp = arr[key.hashCode() % maxSize].get(0).getValue();
        if (arr[key.hashCode() % maxSize].size() == 1) {
            arr[key.hashCode() % maxSize] = null;
        } else {
            arr[key.hashCode() % maxSize].remove(0);
        }
        return temp;
    }

    public void hashtabDelete(K key) {
        arr[key.hashCode() % maxSize] = null;
    }
}
