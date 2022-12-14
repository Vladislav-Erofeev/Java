/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package Prac32;
import java.io.Serializable;

public class Dish extends MenuItem implements Serializable {
    public Dish(){
        super();

    }
    public Dish(String name, String description, int cost){
        super(name, description, cost);
    }

    @Override
    public String toString(){
        return " " + getName() + " " + getDescription() + " " + getCost();
    }
}