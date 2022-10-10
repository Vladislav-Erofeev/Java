package Prac3.task3;

import java.util.Scanner;

public class Tester {
    private Circle arr[];
    private int count;

    public Tester(int n)
    {
        count = n;
        arr = new Circle[count];
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < n; i++)
        {
            int x = i, y = i;
            arr[i] = new Circle(x, y);
        }
    }

    public void start()
    {
        for(Circle x : arr)
            System.out.println(x.toString());
    }
}
