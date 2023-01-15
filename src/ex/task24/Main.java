/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package ex.task24;

public class Main {
    public static void main(String[] args) {
        NumberFabric numberFabric = new NumberFabric();
        Number number = numberFabric.createComplexNumber(2, 4);
        number.print();
    }
}
