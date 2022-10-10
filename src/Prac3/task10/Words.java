package Prac3.task10;

public class Words
{
    String str;

    public Words(String str)
    {
        this.str = str;
    }

    public int countOfWords()
    {
        int count = 0;
        str.toLowerCase();
        for(int i = 0; i < str.length() - 1; i++)
        {
            if(str.charAt(i) == ' ' && ((int)(str.charAt(i+1)) >= (int)('а') && (int)(str.charAt(i+1)) <= (int)('я') ||
                    (int)(str.charAt(i+1)) >= (int)('a') && (int)(str.charAt(i+1)) <= (int)('z')
            || (int)(str.charAt(i+1)) >= (int)('0') && (int)(str.charAt(i+1)) <= (int)('9')))
                count++;
        }
        if (str.charAt(str.length() - 1) == '.' || str.charAt(str.length() - 1) == '!' || str.charAt(str.length() - 1) == ' '
                || str.charAt(str.length() - 1) == '?' || (str.charAt(str.length() - 1) >= 'a'
                || str.charAt(str.length() - 1) <= 'z')) // обработка последнего символа
            count++;
        return count;
    }
}
