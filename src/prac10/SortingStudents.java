package prac10;

import java.util.ArrayList;
import java.util.Comparator;

public class SortingStudents
{
    private ArrayList<Student> idNumber;
    private Comparator comparator;

    public SortingStudents()
    {
        idNumber = new ArrayList<Student>(0);
    }

    public SortingStudents(ArrayList<Student> arr)
    {
        idNumber = arr;
    }

    public void setComparator(Comparator comparator)
    {
        this.comparator = comparator;
    }
}