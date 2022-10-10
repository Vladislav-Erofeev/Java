package Prac3.task7;

public class BookTest
{
    public static void main(String[] args)
    {
        Book book1 = new Book("test1", "test1", 1934, 500);
        Book book2 = new Book("test2", "test2", 1748, 500);
        Book book3 = new Book("test3", "test3",  1859, 500);
        Book book4 = new Book("test4", "test3",  259, 500);
        Book temp[] = {book1, book2, book3, book4};
        BookShelf obj = new BookShelf(temp);
        System.out.println(obj.oldest().getYear());
        System.out.println(obj.newest().getYear());
        obj.sort();
        obj.displayAll();
    }
}