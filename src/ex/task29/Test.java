/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package ex.task29;

import java.util.EmptyStackException;

public class Test {
    public static void main(String[] args) {
        MyStack <Integer> myStack = new MyStack<>();

        // Заполнение стека
        for(int i = 0; i < 1000; i++) {
            try {
                myStack.push(i);
            } catch (StackOverflowError exc) {
                System.out.println(exc);
                break;
            }
        }

        // Вывод стека в консоль
        for(int i = 0; i < 1000; i++) {
            try {
                System.out.println(myStack.pop());
            } catch (EmptyStackException exc) {
                System.out.println(exc);
                break;
            }
        }
    }
}
