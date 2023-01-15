/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package ex.task23;

public abstract class Shape {
    int x;
    int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract void print();
}
