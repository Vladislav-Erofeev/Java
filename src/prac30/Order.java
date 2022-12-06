/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac30;

public interface Order {
    boolean add(MenuItem item);
    String[] itemsNames();
    int itemsQuantity();
    int itemQuantity(String itemName);
    int itemQuantity(MenuItem itemName);
    MenuItem[] getItems();
    boolean remove(String itemName);
    boolean remove(MenuItem itemName);
    int removeAll(String itemName);
    int removeAll(MenuItem itemName);
    MenuItem[] sortedItemsByCostDesc();
    int costTotal();
    Customer getCustomer();
    void setCustomer(Customer customer);
    void display();
}
