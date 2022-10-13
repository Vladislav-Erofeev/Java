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

    public void sort(int low, int high)
    {
        if (idNumber.size() == 0)
            return;
        if (low >= high)
            return;
        int middle = low + (high - low) / 2;
        Student opora = idNumber.get(middle);
        int i = low, j = high;
        while (i <= j) {
            while (comparator.compare(idNumber.get(i), opora) < 0) {
                i++;
            }

            while (comparator.compare(idNumber.get(j), opora) > 0) {
                j--;
            }
            if (i <= j) {
                Student temp = idNumber.get(i);
                idNumber.set(i, idNumber.get(j));
                idNumber.set(j, temp);
                i++;
                j--;
            }
        }
        if (low < j)
            sort(low, j);
        if (high > i)
            sort(i, high);
    }

    public void sort()
    {
        sort(0, idNumber.size() - 1);
    }

    public void outArray()
    {
        for(Student x : idNumber)
        {
            System.out.println(x);
        }
    }
}