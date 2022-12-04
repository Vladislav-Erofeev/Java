/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac29;

public class Test {
    public static void main(String[] args) {
        Dish dish1 = new Dish(1, "TestDish 1", "Test 1");
        Drink dish2 = new Drink(2, "TestDrink 2", "Test 2");
        Dish dish3 = new Dish(3, "TestDish 1", "Test 3");
        Drink dish4 = new Drink(4, "TestDrink 2", "Test 4");
        Dish dish5 = new Dish(5, "TestDish 1", "Test 5");
        Item[] arr1 = {dish1};
        Item[] arr2 = {dish2};
        OrderManager orderManager = new OrderManager();
        RestaurantOrder restaurantOrder = new RestaurantOrder(arr1);
        InternetOrder internetOrder = new InternetOrder(arr2);
        try {
            orderManager.addOrder("ad1", restaurantOrder);
            orderManager.addOrder("ad2", internetOrder);
            orderManager.addOrder("ad2", restaurantOrder);
        } catch (OrderAlreadyAddedException exc) {
            System.out.println(exc.getMessage());
        }
        try {
            orderManager.addItem("ad1", dish3);
            orderManager.addItem("ad1", dish4);
            orderManager.addItem("ad1", dish4);
            orderManager.addItem("ad6", dish4);
        } catch (IllegalTableNumber ex) {
            System.out.println(ex.getMessage());
        }
        Order[] array = orderManager.getAllOrders();
        for(Order x : array) {
            x.display();
            System.out.println();
        }

        System.out.println(orderManager.getSummaryCountOf("TestDish 1"));
    }
}
