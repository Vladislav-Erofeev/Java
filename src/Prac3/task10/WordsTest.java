package Prac3.task10;

public class WordsTest
{
    public static void main(String[] args)
    {
        Words obj = new Words("Здесь            было     введено 5 слов");
        System.out.println(obj.countOfWords());
    }
}
