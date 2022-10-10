package Prac2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class task2
{
    public static void task2_2()
    {
        System.out.print("Введите длину массива: ");
        int length = new Scanner(System.in).nextInt(); // ввод длины массива
        Random rand = new Random();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 0; i < length; i++)
            arr.add(rand.nextInt(100));

        System.out.println("Длина ихсодного массива: " + length);
        for(int i = 0; i < length; i++)
            System.out.print(arr.get(i) + " ");

        System.out.print("\nВведите символ для удаления: ");
        int number = new Scanner(System.in).nextInt();
        int i = 0;
        while(i != length)
        {
            if (arr.get(i) == number) {
                arr.remove(i);
                length--;
                continue;
            }
            i++;
        }

        System.out.println("Длина нового массива: " + length);
        for(i = 0; i < length; i++)
            System.out.print(arr.get(i) + " ");

        System.out.print("\nВведите символ: ");
        number = new Scanner(System.in).nextInt();
        i = 0;
        while(i != length)
        {
            if (arr.get(i)%10 == number) {
                arr.remove(i);
                length--;
                continue;
            }
            i++;
        }
        System.out.println("Длина нового массива: " + length);
        for(i = 0; i < length; i++)
            System.out.print(arr.get(i) + " ");
    }

    public static void main(String[] args)
    {
        task2_2();
    }
}
