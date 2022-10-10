/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package Prac6.task3;

public class Test
{
    public static void main (String[] args)
    {
        Nameable obj = new Animal("Dog");
        System.out.println(obj.getName());

        obj = new Auto("Lada");
        System.out.println(obj.getName());

        obj = new Planet("Earth");
        System.out.println(obj.getName());
    }
}
