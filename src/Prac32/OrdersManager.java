/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package Prac32;

import java.io.Serializable;

public interface OrdersManager extends Serializable {
    int itemsQuantity(String itemName);
    int itemsQuantity(MenuItem item);
    Order[] getOrders();
    int ordersCostSummary();
    int ordersQuantity();


}