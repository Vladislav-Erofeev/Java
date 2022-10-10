package Prac3.task9;

public class Deck
{
    String deck[] = new String[52];

   public  Deck()
    {
        for(int i = 1; i < 14; i++)
        {
            for(int j = 0; j < 4;j++)
            {
                String temp;
                switch (i)
                {
                    case 1:
                        temp = "Туз";
                        break;
                    case 11:
                        temp = "Валет";
                        break;
                    case 12:
                        temp = "Дама";
                        break;
                    case 13:
                        temp = "Король";
                        break;
                    default:
                        temp = Integer.toString(i);
                }
                switch (j)
                {
                    case 0:
                        temp += " Червы";
                        break;
                    case 1:
                        temp += " Бубны";
                        break;
                    case 2:
                        temp += " Трефы";
                        break;
                    case 3:
                        temp += " Пики";
                        break;
                }
                deck[(i-1)*4 + j] = temp;
            }
        }
        deck[50] = "Джокер чёрный";
        deck[51] = "Джокер красный";
    }

    public String get(int i)
    {
        return deck[i];
    }
}
