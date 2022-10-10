/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package Prac6.task4;

public class Test
{
    public static void main(String[] args)
    {
        Priceable temp = new Auto(1000000);
        System.out.println(temp.getPrice());

        temp = new Ball(10);
        System.out.println(temp.getPrice());

        temp = new Pc(1000);
        System.out.println(temp.getPrice());
    }
}
