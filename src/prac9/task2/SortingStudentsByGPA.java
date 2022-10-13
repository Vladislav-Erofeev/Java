package prac9.task2;

import java.util.Comparator;

public class SortingStudentsByGPA
{
    private Comparator comparator;

    public SortingStudentsByGPA(Comparator comparator) {
        this.comparator = comparator;
    }

    public void quickSort(Student[] array, int low, int high) {
        if (array.length == 0)
            return;
        if (low >= high)
            return;
        int middle = low + (high - low) / 2;
        Student opora = array[middle];
        int i = low, j = high;
        while (i <= j) {
            while (comparator.compare(array[i], opora) < 0) {
                i++;
            }

            while (comparator.compare(array[j], opora) > 0) {
                j--;
            }
            if (i <= j) {
                Student temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(array, low, j);
        if (high > i)
            quickSort(array, i, high);
    }

    public void sort(Student[] arr)
    {
        quickSort(arr, 0, arr.length-1);
    }
}
