/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac24.task1;

public class Complex {
    private int real;
    private int image;

    public Complex(int real, int image) {
        this.real = real;
        this.image = image;
    }

    @Override
    public String toString() {
        return real + " + " + image + "i";
    }
}
