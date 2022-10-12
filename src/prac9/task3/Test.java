package prac9.task3;

public class Test
{
    public static void main(String[] args)
    {
        Student[] arrayA = {new Student(4), new Student(2), new Student(5)};
        Student[] arrayB = {new Student(7), new Student(6), new Student(1)};

        NumberComparator comparator = new NumberComparator();
        MergeStudents sort = new MergeStudents(comparator);
        Student[] newArray = sort.sort(arrayA, arrayB);
        for(Student x : newArray)
        {
            System.out.print(x.getIdNumber() + " ");
        }
    }
}
