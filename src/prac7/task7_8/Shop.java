/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac7.task7_8;

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

    public static void printMagazines(Printable[] printable)
    {
        for(int i = 0; i < printable.length; i++)
        {
            if (printable[i] instanceof Shop)
                printable[i].print();
        }
    }
}
