package prac8.task4;

import java.util.Scanner;

public class Programm
{
    public static int summa(int n)
    {
        if (n < 10) {
            return n;
        }
        else
        {
            return n % 10 + summa(n/10);
        }
    }

    public static int func(int k, int d)
    {
        int summ = 0;
        for(int i = (int)Math.pow(10, k-1); i < (int)Math.pow(10, k); i++)
        {
            if (summa(i) == d)
            {
                summ++;
            }
        }
        return summ;
    }

    public static void main(String[] args)
    {
        int k = new Scanner(System.in).nextInt();
        int d = new Scanner(System.in).nextInt();

        System.out.println(func(k, d));
    }
}

/*Hello*/
