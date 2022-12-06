import prac30.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Dish dish1 = new Dish(5, "Test 1", "Test");
        Dish dish2 = new Dish(4, "Test 2", "Test");
        Drink drink1 = new Drink(1, "Drink 1", "Test", 1, DrinkTypeEnum.BEER);
        Drink drink2 = new Drink(2, "Drink 1", "Test", 1, DrinkTypeEnum.BEER);
        Drink drink3 = new Drink(3, "Drink 3", "Test", 1, DrinkTypeEnum.BEER);

        TableOrder tableOrder1 = new TableOrder();
        tableOrder1.add(dish1);
        tableOrder1.add(dish2);
        tableOrder1.add(drink1);

        TableOrder tableOrder2 = new TableOrder();
        tableOrder2.add(dish1);
        tableOrder2.add(dish1);
        tableOrder2.add(drink2);
        tableOrder2.add(drink3);

        TableOrder tableOrder3 = new TableOrder();
        tableOrder3.add(dish1);
        tableOrder3.add(dish1);

        InternetOrdersManager tableOrdersManager = new InternetOrdersManager();
        tableOrdersManager.add(tableOrder1);
        tableOrdersManager.add(tableOrder2);
        tableOrdersManager.add(tableOrder3);
        System.out.println("Удаление: ");
        //tableOrdersManager.remove().display();

        tableOrdersManager.display();
        System.out.println("Стоимость " + tableOrdersManager.ordersCostSummary());
    }
}
