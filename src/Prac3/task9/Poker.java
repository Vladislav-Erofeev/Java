package Prac3.task9;

import java.util.ArrayList;
import java.util.Random;

public class Poker
{
    Deck deck;
    int count;
    ArrayList<Integer> cards;

    public Poker()
    {
        deck = new Deck();
        cards = new ArrayList<Integer>(0);
    }

    public boolean dealDeck(int n)
    {
        if(n > 10)
        {
            return false;
        }
        count = n;
        Random rand = new Random();
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < 5; j++)
            {
                int number = rand.nextInt(52);
                if(cards.size() == 0)
                {
                    cards.add(number);
                    continue;
                }
                while(cards.indexOf(number) != -1)
                {
                    number = rand.nextInt(52);
                }
                cards.add(number);
            }
        }
        return true;
    }

    public void display()
    {
        for(int i = 0; i < count; i++)
        {
            for(int j = 0; j < 5; j++)
            {
                System.out.print(deck.get(cards.get(i*5 + j)) + " | ");
            }
            System.out.println();
        }
    }
}
