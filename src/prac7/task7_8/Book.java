/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac7.task7_8;

public class Book implements Printable
{
    private String name;

    public Book(String name)
    {
        this.name = name;
    }

    @Override
    public void print()
    {
        System.out.println(name);
    }

    public static void printBooks(Printable[] printable)
    {
        for(int i = 0; i < printable.length; i++)
        {
            if (printable[i] instanceof Book)
             printable[i].print();
        }
    }
}
