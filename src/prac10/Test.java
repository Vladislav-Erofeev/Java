package prac10;

import java.util.ArrayList;

public class Test
{
    public static void main(String[] args)
    {
        ArrayList<Student> arr = new ArrayList<Student>(0);
        arr.add(new Student("Alexey", "Ivanov", 1, 2, 2.6));
        arr.add(new Student("Alexey", "Ivanov", 1, 2, 2.5));
        arr.add(new Student("Alexey", "Ivanov", 1, 2, 4.2));
        arr.add(new Student("Alexey", "Ivanov", 1, 2, 5));
        arr.add(new Student("Alexey", "Ivanov", 1, 2, 3.2));
        arr.add(new Student("Alexey", "Ivanov", 1, 2, 2.2));
        ScoreComparator comparator = new ScoreComparator();
        SortingStudents obj = new SortingStudents(arr);
        obj.setComparator(comparator);
        obj.outArray();
        obj.sort();
        System.out.println();
        obj.outArray();
    }
}
