/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package ex.task23;

public class Circle extends Shape{
    int r;

    public Circle(int x, int y, int r) {
        super(x, y);
        this.r = r;
    }

    public void print() {
        System.out.printf("Center: (%d;%d)\nR: %d", x, y, r);
    }
}
