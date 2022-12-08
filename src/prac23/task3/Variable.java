/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac23.task3;

public class Variable implements Value{
    public String name;

    public Variable(String x) {
        name = x;
    }

    @Override
    public int evaluate(int x) {
        return x;
    }
}
