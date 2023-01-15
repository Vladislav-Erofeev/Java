/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package ex.task23;

public class ShapeFabric implements AbstractFabric{
    @Override
    public Shape createCircle(int x, int y, int r) {
        return new Circle(x, y, r);
    }

    @Override
    public Shape createRectangle(int x, int y, int x1, int y1) {
        return new Rectangle(x, y, x1, y1);
    }
}
