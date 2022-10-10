/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package Prac6.task1;

public class MovableCircle implements Movable
{
    int radius;
    MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius)
    {
        this.radius = radius;
        center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    @Override
    public void moveUp()
    {
        center.moveUp();
    }

    @Override
    public void moveDown()
    {
        center.moveDown();
    }

    @Override
    public void moveLeft()
    {
        center.moveLeft();
    }

    @Override
    public void moveRight()
    {
        center.moveRight();
    }

    @Override
    public String toString()
    {
        return center.toString() + " radius: " + radius;
    }
}
