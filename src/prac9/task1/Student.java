package prac9.task1;

public class Student implements Comparable<Student>
{
    private int idNumber;

    public Student(int id)
    {
        idNumber = id;
    }

    public int compareTo(Student obj)
    {
        if (idNumber < obj.idNumber)
        {
            return -1;
        }
        else if (idNumber > obj.idNumber)
        {
            return 1;
        }
        else{
            return 0;
        }
    }

    public static void sort(Comparable[] list)
    {
        int min = 0;
        for(int i = 0; i < list.length - 1; i++)
        {
            min = i;
            for(int j = list.length - 1; j > i; j--)
            {
                if (list[j].compareTo(list[min]) < 0)
                {
                    min = j;
                }
            }
            Comparable temp = list[i];
            list[i] = list[min];
            list[min] = temp;
        }
    }

    public int getValue()
    {
        return idNumber;
    }
}