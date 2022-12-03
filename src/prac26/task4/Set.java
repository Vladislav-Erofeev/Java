/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac26.task4;

import java.util.List;

public class Set<T> {
    private HashTab<Integer, T> hashTab;
    private Integer minPriority ;

    public Set() {
        hashTab = new HashTab<>();
        minPriority = hashTab.size() - 1;
    }

    public void add(T value) {
        hashTab.hashtabAdd(minPriority, value);
    }

    public void add(Integer priority,T value) {
        hashTab.hashtabAdd(priority, value);
        if (minPriority != hashTab.size()-1) {
            hashTab.setList(hashTab.size()-1, hashTab.getList(minPriority));
            hashTab.hashtabDelete(minPriority);
            minPriority = hashTab.size()-1;
        }
    }

    public T get() {
        Integer currentPrority = 0;
        for(;;) {
            try {
                if(currentPrority.equals(hashTab.size()+1)) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                T value = hashTab.hashtabLookup(currentPrority);
                return value;
            } catch (KeyNotFound e) {
                currentPrority++;
            }
        }
    }
}
