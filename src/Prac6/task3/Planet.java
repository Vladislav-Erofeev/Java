/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package Prac6.task3;

public class Planet implements Nameable
{
    private String name;

    public Planet(String name)
    {
        this.name = name;
    }

    @Override
    public String getName()
    {
        return name;
    }
}
