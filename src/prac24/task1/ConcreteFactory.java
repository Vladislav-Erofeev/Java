/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac24.task1;

public class ConcreteFactory implements ComplexAbstractFactory{
    @Override
    public Complex createComplex() {
        return new Complex(0, 0);
    }

    @Override
    public Complex createComplex(int real, int image) {
        return new Complex(real, image);
    }
}
