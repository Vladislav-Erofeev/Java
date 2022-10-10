/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package Prac6.task6_9;

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
}
