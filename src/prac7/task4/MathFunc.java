package prac7.task4;

public class MathFunc implements MathCalculable
{
    @Override
    public double pow(double value, double powValue) {
        return Math.pow(value, powValue);
    }

    @Override
    public double abs(double a, double b) {
        return pow((a*a + b*b), 1/2);
    }

    public double circleS(double r)
    {
        return PI*pow(r, 2);
    }
}
