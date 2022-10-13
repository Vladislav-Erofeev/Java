package prac10.task3;

import java.sql.SQLOutput;

public class Test
{
    public static void main(String[] args)
    {
        Student[] arrayA = {new Student("Test1" , "Test1", 4, 2, 3.4),
                new Student("Test2" , "Test2", 4, 2, 2.2),
                new Student("Test3" , "Test3", 4, 2, 5.0) };
        Student[] arrayB = {new Student("Test4" , "Test4", 4, 2, 4.2),
                new Student("Test5" , "Test5", 4, 2, 3.2),
                new Student("Test6" , "Test6", 4, 2, 1.4)};

        NumberComparator comparator = new NumberComparator();
        MergeStudents sort = new MergeStudents(comparator);
        Student[] newArray = sort.sort(arrayA, arrayB);
        for(Student x : newArray)
        {
            System.out.println(x);
        }
    }
}
