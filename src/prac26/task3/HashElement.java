/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac26.task3;

public class HashElement<K, V> {
    private K key;
    private V value;

    public HashElement(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
