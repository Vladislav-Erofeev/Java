/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac19;

import java.util.Comparator;

public class CompareByGPA implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getGPA() == o2.getGPA())
            return 0;
        if(o1.getGPA() > o2.getGPA())
            return 1;
        return -1;
    }
}
