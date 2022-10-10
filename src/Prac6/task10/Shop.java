/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package Prac6.task10;

import java.util.ArrayList;

public class Shop
{
    private ArrayList<Computer> PCs;

    public Shop()
    {
        PCs = new ArrayList<Computer>(0);
    }

    public int find(Computer computer)
    {
        for(int i = 0; i < PCs.size(); i++)
        {
            if (PCs.get(i).equals(computer))
            {
                return i;
            }
        }
        System.out.println("Такой объект не найден");
        return -1;
    }

    public void add(Computer computer)
    {
        PCs.add(computer);
    }

    public void delete(int index)
    {
        PCs.remove(index);
    }

    public Computer get(int index)
    {
        return PCs.get(index);
    }


}
