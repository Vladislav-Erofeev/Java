package Prac3.task4;

import java.util.Scanner;

public class Tester
{
    public static void main(String[] args)
    {
        Shop obj = new Shop(5);
        obj.add();
        obj.displayAll();
        System.out.print("Введите имя для удаления: ");
        String name = new Scanner(System.in).nextLine();
        obj.delete(name);
        System.out.print("Введите имя для поиска: ");
        name = new Scanner(System.in).nextLine();
        System.out.println("Индекс элемента: " + obj.find(name));
    }
}
