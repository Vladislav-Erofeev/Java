/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac30;

public class MenuItem {
    private int cost;
    private String name;
    private String description ;

    public MenuItem(int cost, String name, String description) {
        this.cost = cost;
        this.name = name;
        this.description = description;
    }

    public int getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
