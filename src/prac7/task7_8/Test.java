package prac7.task7_8;

public class Test
{
    public static void main(String[] args)
    {
        Printable[] obj = {new Book("Book 1"), new Shop("Shop 1")};
        Book.printBooks(obj);
    }
}
