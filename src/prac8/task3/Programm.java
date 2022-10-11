package prac8.task3;

import java.util.Scanner;

public class Programm
{
    public static void func(int a, int b)
    {
        if (a == b)
        {
            System.out.print(a);
        }
        if (a < b)
        {
            System.out.print(a + " ");
            func(a+1, b);
        }
        else if (a > b)
        {
            System.out.print(a + " ");
            func(a-1, b);
        }
    }

    public static void main(String[] args)
    {
        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();
        func(a, b);
    }
}
