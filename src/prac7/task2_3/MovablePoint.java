/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac7.task2_3;

import Prac6.task2.Movable;

public class MovablePoint implements Movable
{
    private int x;
    private int y;
    protected int xSpeed;
    protected int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp()
    {
        y += ySpeed;
    }

    @Override
    public void moveDown()
    {
        y -= ySpeed;
    }

    @Override
    public void moveLeft()
    {
        x -= xSpeed;
    }

    @Override
    public void moveRight()
    {
        x += xSpeed;
    }

    @Override
    public String toString() {
        return "(" + x + ";" + y + ")" + " speed: " + "(" + xSpeed + ";" + ySpeed + ")";
    }

    public boolean speedTest(MovablePoint point)
    {
        return (xSpeed == point.xSpeed && ySpeed == point.ySpeed) ? true : false;
    }
}
