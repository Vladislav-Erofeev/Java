/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package ex.task23;

public interface AbstractFabric {
    Shape createCircle(int x, int y, int r);
    Shape createRectangle(int x, int y, int x1, int y1);
}
