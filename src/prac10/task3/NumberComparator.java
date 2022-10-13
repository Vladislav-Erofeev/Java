package prac10.task3;

import java.util.Comparator;

public class NumberComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getAverageScore() > o2.getAverageScore())
            return 1;
        if(o1.getAverageScore() < o2.getAverageScore())
            return -1;
        return 0;
    }
}
