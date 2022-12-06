/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac30;

public interface OrdersManager {
    int COUNT_OF_TABLES = 32;
    int itemsQuantity(String itemName);
    int itemsQuantity(MenuItem item);
    Order[] getOrders();
    int ordersCostSummary();
    int ordersQuantity();
}