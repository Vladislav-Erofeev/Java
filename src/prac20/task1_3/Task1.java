/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac20.task1_3;

import java.io.Serializable;

public class Task1 <T extends Comparable, V extends Serializable, K extends Animal>{
    T field1;
    V field2;
    K field3;

    Task1(T t, V v, K k) {
        field1 = t;
        field2 = v;
        field3 = k;
    }

    public String getClasses() {
        return field1.getClass() + " " + field2.getClass() + " " + field3.getClass();
    }
}
