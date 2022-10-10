package Prac3.task7;

public class BookShelf
{
    private Book arr[];
    private int count;

    public BookShelf(Book ar[])
    {
        arr = ar;
        count = arr.length;
    }

    public Book oldest()
    {
        Book temp = new Book("def", "def", 100, 100);
        int min = 100000000;
        for(int i = 0; i < count; i++)
        {
            if (arr[i].getYear() < min)
            {
                temp = arr[i];
                min = arr[i].getYear();
            }
        }
        return temp;
    }

    public Book newest()
    {
        Book temp = new Book("def", "def", 100, 100);
        int max = -1;
        for(int i = 0; i < count; i++)
        {
            if (arr[i].getYear() > max)
            {
                temp = arr[i];
                max = arr[i].getYear();
            }
        }
        return temp;
    }

    public void sort()
    {
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr.length - i - 1;j++)
            {
                if (arr[j].getYear() > arr[j+1].getYear())
                {
                    Book temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public void displayAll()
    {
        for(Book x : arr)
        {
            System.out.println(x.toString());
        }
    }
}
