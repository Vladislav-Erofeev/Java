/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package Prac6.task6_9;

public class Test
{
    public static void main(String[] args)
    {
        Printable[] print = {new Book("Book 1"), new Book("Book 2"), new Shop("Shop 1"), new Book("Book 3"),
                new Shop("Shop 2"), new Shop("Shop 3")};
        for(Printable x : print)
        {
            x.print();
        }
    }
}
