/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package ex.task25;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.List;

public class Stack<T> {
    private List<T> list;

    public Stack() {
        list = new LinkedList<>();
    }

    public void push(T data) {
        list.add(data);
    }

    public T pop() throws EmptyStackException{
        if(list.isEmpty())
            throw new EmptyStackException();
        T temp = list.get(list.size() - 1);
        list.remove(temp);
        return temp;
    }
}
