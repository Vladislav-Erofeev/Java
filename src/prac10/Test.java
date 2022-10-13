package prac10;

import java.util.ArrayList;

public class Test
{
    public static void main(String[] args)
    {
        ArrayList<Student> arr = new ArrayList<Student>(0);
        arr.add(new Student("Alexey", "Ivanov", 1, 2, 2.6));
        arr.add(new Student("Alexey", "Ivanov", 1, 4, 2.5));
        arr.add(new Student("Alexey", "Ivanov", 1, 2, 4.2));
        arr.add(new Student("Alexey", "Ivanov", 1, 1, 5));
        arr.add(new Student("Alexey", "Ivanov", 1, 6, 3.2));
        arr.add(new Student("Alexey", "Ivanov", 1, 3, 2.2));
        SortingStudents obj = new SortingStudents(arr);
        // Устанавливаем компаратор на сравнение балла
        ScoreComparator comparator = new ScoreComparator();
        obj.setComparator(comparator);
        obj.outArray();
        obj.sort();
        System.out.println();
        obj.outArray();
        System.out.println();

        // устанавливаем компаратор на сравнение номера группы
        GroupComparator groupComparator = new GroupComparator();
        obj.setComparator(groupComparator);
        obj.sort();
        obj.outArray();
    }
}
