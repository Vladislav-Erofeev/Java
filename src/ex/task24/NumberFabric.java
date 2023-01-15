/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package ex.task24;

public class NumberFabric implements Fabric{
    @Override
    public Number createNumber(int x) {
        return new Number(x);
    }

    @Override
    public ComplexNumber createComplexNumber(int x, int y) {
        return new ComplexNumber(x, y);
    }
}
