package Prac2;

import java.util.Scanner;

public class task1
{
    public static void task2_1()
    {
        Scanner in = new Scanner(System.in);
        int length, position;
        System.out.print("Введите длину серии: ");
        length = in.nextInt();

        System.out.print("Введите номер первого числа: ");
        position = in.nextInt();

        int first = 0, second = 1;

        for(int i = 0; i < position - 1; i++) // получение начального состояния последовательности Фиббоначи
        {
            int temp = first + second;
            first = second;
            second = temp;
        }

        for(int i = 0; i < length; i++) // вывод на экран соответствующих символов Фиббоначи
        {
            System.out.printf(first + " ");
            int temp = first + second;
            first = second;
            second = temp;
        }
    }

    public static void main(String[] args)
    {
        task2_1();
    }
}
