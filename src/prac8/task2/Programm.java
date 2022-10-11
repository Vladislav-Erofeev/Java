package prac8.task2;

import java.util.Scanner;

public class Programm
{
    public static void func(int n)
    {
        if(n!=1)
            func(n-1);
        System.out.print(n + " ");
    }

    public static void main(String[] args)
    {
        int n = new Scanner(System.in).nextInt();
        func(n);
    }
}
