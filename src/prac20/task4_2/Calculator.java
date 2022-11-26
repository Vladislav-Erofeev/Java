/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac20.task4_2;

public class Calculator {

    public static <T extends Number, V extends Number> Double sum(T a, V b) {
        return a.doubleValue() + b.doubleValue();
    }

    public static <T extends Number, V extends Number> Double sub(T a, V b) {
        return a.doubleValue() - b.doubleValue();
    }

    public static <T extends Number, V extends Number> Double div(T a, V b) throws NullPointerException{
        return a.doubleValue() / b.doubleValue();
    }

    public static <T extends Number, V extends Number> Double mul(T a, V b) {
        return a.doubleValue() * b.doubleValue();
    }
}
