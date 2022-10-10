package Prac3.task8;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args)
    {
        int length;
        System.out.print("Введте длину массива: ");
        length = new Scanner(System.in).nextInt();
        String[] arr = new String[length];
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < length;i++)
        {
            System.out.print("Введите строку: ");
            String temp = in.nextLine();
            arr[i] = temp;
        }
        for(int i = 0; i < length/2; i++)
        {
            String temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }

        for(int i = 0; i < length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
