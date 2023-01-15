/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package ex.task23;

public class Test {
    public static void main(String[] args) {
        ShapeFabric fabric = new ShapeFabric();
        Shape shape = fabric.createCircle(1, 1, 5);
        shape.print();
    }
}
