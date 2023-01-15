/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package ex.task23;

public class Rectangle extends Shape{
    int x;
    int y;
    public Rectangle(int x, int y, int x1, int y1) {
        super(x, y);
        this.x = x1;
        this.y = y1;
    }

    public void print() {
        System.out.printf("Left top: (%d;%d)\nRight bottom: (%d;%d)", super.x, super.y, x, y);
    }
}
