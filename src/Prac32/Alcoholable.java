/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package Prac32;

import java.io.Serializable;

public interface Alcoholable extends Serializable {
    boolean isAlcoholicDrink();
    double getAlcoholVol();
}