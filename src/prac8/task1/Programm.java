package prac8.task1;

import java.util.Scanner;

public class Programm
{
    public static void func(int n)
    {
        if (n != 1)
            func(n-1);
        for(int i = 0; i < n; i++)
        {
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args)
    {
        int n = new Scanner(System.in).nextInt();
        func(n);
    }
}
