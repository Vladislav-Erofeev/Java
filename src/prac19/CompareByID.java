/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac19;

import java.util.Comparator;

public class CompareByID implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getId() == o2.getId())
            return 0;
        if(o1.getId() > o2.getId())
            return 1;
        return -1;
    }
}
