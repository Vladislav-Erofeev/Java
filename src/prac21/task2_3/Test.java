/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac21.task2_3;

import java.awt.geom.Arc2D;
import java.util.function.DoublePredicate;

public class Test {
    public static void main(String[] args) {
        Integer[] arrI = {1, 2, 3, 4, 5};
        Double[] arrD = {1.1, 2.2, 3.3, 4.4, 5.5};

        Storage<Integer> storageI = new Storage<>(arrI);
        Storage<Double> storageD = new Storage<>(arrD);

        System.out.println(storageI.get(2));
        System.out.println(storageD.get(2));
    }
}
