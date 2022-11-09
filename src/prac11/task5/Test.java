/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac11.task5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        // создаём списки на 10000 элементов
        ArrayList<Integer> list1 = new ArrayList<Integer>();

        LinkedList<Integer> list2= new LinkedList<Integer>();
        for(int i = 0;i < 1_000_000; i++) {
            list1.add(i);
            list2.add(i);
        }

        long start,end;
        {
            // тестируем операцию вставки
            start = System.currentTimeMillis();
            list1.add(500000, -1);
            end = System.currentTimeMillis();
            long ins1 = end - start;
            System.out.println("Вставка в ArrayList: " + ins1);
            start = System.currentTimeMillis();
            list2.add(500_000, -1);
            end = System.currentTimeMillis();
            long ins2 = end - start;
            System.out.println("Вставка в LinkedList: " + ins2);
        }

        {
            // тестируем операцию удаления
            start = System.currentTimeMillis();
            list1.remove(500001);
            end = System.currentTimeMillis();
            long ins1 = end - start;
            System.out.println("Удаление в ArrayList: " + ins1);
            start = System.currentTimeMillis();
            list2.remove(500001);
            end = System.currentTimeMillis();
            long ins2 = end - start;
            System.out.println("Удаление в LinkedList: " + ins2);
        }

        {
            // тестируем операцию добавления в конец коллекции
            start = System.currentTimeMillis();
            list1.add(-2);
            end = System.currentTimeMillis();
            long ins1 = end - start;
            System.out.println("Добавление в конец в ArrayList: " + ins1);
            start = System.currentTimeMillis();
            list2.add(-2);
            end = System.currentTimeMillis();
            long ins2 = end - start;
            System.out.println("Добавление в конец в LinkedList: " + ins2);
        }

        {
            // тестируем операцию поиска
            start = System.currentTimeMillis();
            list1.indexOf(-2);
            end = System.currentTimeMillis();
            long ins1 = end - start;
            System.out.println("Поиск в ArrayList: " + ins1);
            start = System.currentTimeMillis();
            list2.indexOf(-2);
            end = System.currentTimeMillis();
            long ins2 = end - start;
            System.out.println("Поиск в LinkedList: " + ins2);
        }
    }
}
