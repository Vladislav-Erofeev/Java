/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package ex.task29;

import java.util.EmptyStackException;

public class MyStack<T> {
    private final int CAPACITY = 10;

    private int top = 0;
    private T[] array;

    public MyStack() {
        array = (T[])(new Object[CAPACITY]);
    }

    public void push(T element) throws StackOverflowError {
        if (top == CAPACITY)
            throw new StackOverflowError();
        array[top++] = element;
    }

    public T pop() throws EmptyStackException{
        if (top == 0)
            throw new EmptyStackException();
        return array[--top];
    }
}
