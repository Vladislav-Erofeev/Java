package Prac3.task6;

public class CircleTest
{
    public static void main(String[] args)
    {
        Circle obj1 = new Circle(1, 1, 4);
        Circle obj2 = new Circle(2, 2, 4);
        System.out.println(obj1.equals(obj2));
        System.out.println(obj1.calculateS() + " " + obj2.calculateL());
    }
}
