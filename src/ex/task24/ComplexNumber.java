/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package ex.task24;

public class ComplexNumber extends Number{
    int im;

    public ComplexNumber(int x, int y) {
        super(x);
        im = y;
    }

    public void print() {
        System.out.printf("%d + %di\n", re, im);
    }
}
