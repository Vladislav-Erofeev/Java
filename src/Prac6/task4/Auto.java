/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package Prac6.task4;

public class Auto implements Priceable
{
    private int price;

    public Auto(int price)
    {
        this.price = price;
    }

    @Override
    public int getPrice()
    {
        return price;
    }
}
