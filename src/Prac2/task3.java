package Prac2;

import java.util.Scanner;

public class task3
{
    public static String trans(double number, int n)
    {
        int wholePart = (int)(number);
        double fracPart = number - wholePart;

        String numInNew = "";
        int temp = wholePart;
        while (temp != 0)
        {
            if (temp % n < 10)
            {
                numInNew = numInNew + (temp % n);
            }
            else
            {
                numInNew = numInNew + (char)( (int)('A') + (temp % n) - 10);
            }
            temp /= n;
        }
        numInNew = new StringBuilder(numInNew).reverse().toString();
        //  System.out.println(numInNew);

        String newFrac = "";
        for(int i = 0; i < 3; i++)
        {
            fracPart *= n;
            int tempFrac = (int)(fracPart);
            fracPart = fracPart - tempFrac;
            if (tempFrac < 10)
            {
                newFrac = newFrac + tempFrac;
            }
            else
            {
                newFrac = newFrac + (char)( (int)('A') + tempFrac - 10);
            }
        }
        return numInNew + "." + newFrac;
    }
    public static void task2_3()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        double number = in.nextDouble();
        System.out.print("Введите целевую систему счисления: ");
        int n = in.nextInt();
        System.out.println("2: " + trans(number, 2));
        System.out.println("n: " + trans(number, n));
        System.out.println("16: " + trans(number, 16));
    }
    public static void main(String[] args)
    {
        task2_3();
    }
}
