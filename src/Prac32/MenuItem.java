/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package Prac32;


import java.io.Serializable;

public class MenuItem implements Serializable {
    String name, description;
    int cost;

    public MenuItem(){
        this.name = "";
        this.description = "";
        this.cost = 0;
    }

    public MenuItem(String name, String description, int cost){
        this.name = name;
        this.description = description;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getCost() {
        return cost;
    }
}