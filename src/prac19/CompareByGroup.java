/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac19;

import java.util.Comparator;

public class CompareByGroup implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getGroup().compareToIgnoreCase(o2.getGroup());
    }
}
