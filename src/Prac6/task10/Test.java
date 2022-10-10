/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package Prac6.task10;

public class Test
{
    public static void main(String[] args) {

        Computer comp1 = new Computer(4, 6023, 25, Brends.DELL, 54000);
        Computer comp2 = new Computer(2, 6013, 21, Brends.APPLE, 10000);
        Computer comp3 = new Computer(1, 4213, 15, Brends.ASUS, 95000);
        Shop shop = new Shop();
        shop.add(comp1);
        shop.add(comp2);
        shop.add(comp3);

        // тестирование функции поиска
        shop.get(shop.find(comp2)).display();

        //тестирование функции удаления
        shop.delete(shop.find(comp2));

        // тестирование поиска
        shop.find(comp2);
    }
}
