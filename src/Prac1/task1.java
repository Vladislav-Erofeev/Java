package Prac1;

import java.util.Scanner;

public class task1
{
    public static void main(String[] args)
    {
        System.out.println("Введите длину массива: ");
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int arr[] = new int[length];
        for(int i = 0; i < length; i++)
        {
            System.out.print("Введите число: ");
            arr[i] = in.nextInt();
        }
        int sum = 0;
        for(int i = 0; i < length; i++)
        {
            sum += arr[i];
        }
        int i = 0;
        int sum1 = 0;
        while(i < length)
        {
            sum1 += arr[i];
            i++;
        }

        int sum2 = 0;
        i = 0;
        do
        {
            if(length == 0)
                break;
            sum2 += arr[i];
            i++;
        } while (i < length);
        System.out.println("Сумма 1: " + sum + "\nСумма 2: " + sum1 + "\nСумма 3: " + sum2);
    }
}
