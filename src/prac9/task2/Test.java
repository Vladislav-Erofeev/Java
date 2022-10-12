package prac9.task2;

public class Test
{
    public static void main(String[] args)
    {
        Student[] arr = {new Student(4), new Student(2), new Student(5), new Student(1), new Student(6)};
        NumberComparator comparator = new NumberComparator();
        SortingStudentsByGPA sort = new SortingStudentsByGPA(comparator);
        sort.sort(arr);
        for(Student x : arr)
        {
            System.out.print(x.getIdNumber() + " ");
        }
    }
}
