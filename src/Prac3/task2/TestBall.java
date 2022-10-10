package Prac3.task2;

import java.util.Scanner;

public class TestBall
{
    public static void main(String[] args)
    {
        Ball obj = new Ball();
        double x, y;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите x: ");
        x = in.nextDouble();
        System.out.print("Введите y: ");
        y = in.nextDouble();
        obj.setX(x);
        obj.setY(y);
        System.out.print("Введите координаты перемещения мяча: ");
        x = in.nextDouble();
        y = in.nextDouble();
        obj.move(x, y);
        System.out.println(obj.toString());
    }
}
