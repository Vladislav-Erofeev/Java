package Prac1;

import java.util.Arrays;
import java.util.Random;

public class task3
{
    public static void main(String[] args)
    {
        int array1[] = new int[10];
        int array2[] = new int[10];
        Random rand = new Random();
        for(int i = 0; i < 10; i++)
        {
            array1[i] = rand.nextInt(10);
            array2[i] = (int)(Math.random() * 10);
        }

        System.out.println("Первый массив: ");
        for(int i = 0; i < 10; i++)
        {
            System.out.print(array1[i] + " ");
        }
        System.out.println("\nВторой массив: ");
        for(int i = 0; i < 10; i++)
        {
            System.out.print(array2[i] + " ");
        }

        Arrays.sort(array1);
        Arrays.sort(array2);

        System.out.println("\nПервый массив: ");
        for(int i = 0; i < 10; i++)
        {
            System.out.print(array1[i] + " ");
        }
        System.out.println("\nВторой массив: ");
        for(int i = 0; i < 10; i++)
        {
            System.out.print(array2[i] + " ");
        }
    }
}
