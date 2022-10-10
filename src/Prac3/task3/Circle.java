package Prac3.task3;

public class Circle {

    private Point center;

    public Circle(int x, int y)
    {
        center = new Point(x, y);
    }

    public int getX()
    {
        return center.getX();
    }

    public int getY()
    {
        return center.getY();
    }

    public void setX(int x)
    {
        center.setX(x);
    }

    public void setY(int y)
    {
        center.setY(y);
    }

    public String toString()
    {
        return "x: " + center.getX() + " y: " + center.getY();
    }
}
