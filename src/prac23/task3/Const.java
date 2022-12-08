/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac23.task3;

public class Const implements Value{
    private int value;

    public Const(int val) {
        value = val;
    }

    @Override
    public int evaluate(int x) {
        return value;
    }
}
