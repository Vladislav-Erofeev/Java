package Prac1;

public class task2
{
    public static void main(String[] args)
    {
        double sum = 0;
        for(int i = 1; i <= 10; i++)
        {
            sum += 1.0/i;
            double num = 1.0/i;
            System.out.printf("%.2f ", num);
        }
        System.out.printf("\nСумма чисел: %.2f", sum);
    }
}
