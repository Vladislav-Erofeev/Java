/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package Prac6.task6_9;

public class Shop implements Printable
{
    public String name;

    public Shop(String name)
    {
        this.name = name;
    }

    @Override
    public void print()
    {
        System.out.println(name);
    }
}
