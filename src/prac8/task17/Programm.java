package prac8.task17;

import java.util.Scanner;

public class Programm {

    public static int func()
    {
        int n = new Scanner(System.in).nextInt();
        if (n == 0)
        {
            return 0;
        } else
        {
            return Math.max(n, func());
        }
    }

    public static void main(String[] args)
    {
        System.out.println(func());
    }
}
