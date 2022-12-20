package Prac3.task10;

import java.util.Scanner;

public class WordsTest
{
    public static void main(String[] args)
    {
        String str = new Scanner(System.in).nextLine();
        Words obj = new Words(str);
        System.out.println(obj.countOfWords());
    }
}
