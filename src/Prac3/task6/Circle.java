package Prac3.task6;

public class Circle
{
    private int x;
    private int y;
    private int R;

    public Circle(int x, int y, int r) {
        this.x = x;
        this.y = y;
        R = r;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getR() {
        return R;
    }

    public void setR(int r) {
        R = r;
    }

    public boolean equals(Circle obj)
    {
        if (R == obj.R)
        {
            return true;
        }
        return false;
    }

    public double calculateS()
    {
        return 3.14*R*R;
    }

    public double calculateL()
    {
        return 2*3.14*R;
    }
}
