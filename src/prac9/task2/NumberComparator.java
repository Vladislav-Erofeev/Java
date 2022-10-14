package prac9.task2;

import java.util.Comparator;

public class NumberComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getIdNumber() > o2.getIdNumber())
            return 1;
        if(o1.getIdNumber() < o2.getIdNumber())
            return -1;
        return 0;
    }
}
