package Prac3.task5;

import java.util.Scanner;

public class DogKennel
{
    Dog arr[];

    public DogKennel(int n) {
        arr = new Dog[n];
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < n; i++)
        {
            System.out.print("Введите имя: ");
            //in.next();
            String name = in.next();
            System.out.print("Введите возраст: ");
            int age = in.nextInt();
            arr[i] = new Dog(name, age);
        }
    }

    public void add()
    {
        Dog temp[] = new Dog[arr.length + 1];
        for(int i = 0; i < arr.length;i++)
        {
            temp[i] = arr[i];
        }
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя для добавления: ");
        String name = in.nextLine();
        System.out.print("Введите возраст для добавления: ");
        int age = in.nextInt();
        temp[arr.length ] = new Dog(name, age);
        arr = temp;
    }

    public void displayAll()
    {
        for(Dog x: arr)
        {
            System.out.println(x.toString());
        }
    }
}
