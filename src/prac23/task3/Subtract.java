/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac23.task3;

public class Subtract extends Binary implements Value{
    public Subtract(Value left, Value right) {
        super.left = left;
        super.right = right;
    }

    public int evaluate(int x) {
        return left.evaluate(x) - right.evaluate(x);
    }
}
