/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac24.task1;

public class Test {
    public static void main(String[] args) {
        ComplexAbstractFactory factory = new ConcreteFactory();
        System.out.println(factory.createComplex());
        System.out.println(factory.createComplex(1, 1));
    }
}
