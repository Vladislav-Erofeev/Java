/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac23.task3;

public class Main  {
    public static void main(String[] args) {
        Value n1 = new Subtract(new Multiply(new Const(2), new Variable("x")), new Const(3));
        System.out.println("Вычисление 2x-3");
        System.out.println(n1.evaluate(5));

        Value n = new Add(new Subtract( new Multiply(new Variable("x"), new Variable("x")) , new Multiply(new Const(2), new Variable("x"))), new Const(1));
        System.out.println("Вычисление выражения x^2 - 2x + 1: ");
        System.out.println(n.evaluate(5));
    }
}
