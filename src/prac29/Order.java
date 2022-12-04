/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac29;

public interface Order {
    boolean addItem(Item item);
    boolean deleteItem(String name);
    int deleteAllItems(String name);
    int getCount();
    Item[] getItems();
    int getCost();
    int getCountOf(String name);
    String[] getNames();
    Item[] sort();

    void display();
}
