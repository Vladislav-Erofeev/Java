/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac23.task2;

public class ListQueue<T> extends AbstractQueue implements Queue<T>{
    private QueueNode<T> head;
    private QueueNode<T> tail;

    @Override
    public void push(T value) {
        if(tail == null) {
            QueueNode<T> node = new QueueNode<>();
            node.value = value;
            head = node;
            tail = node;
            size++;
            return;
        }
        QueueNode<T> node = new QueueNode<>();
        node.value = value;
        tail.next = node;
        tail = node;
        size++;
    }

    @Override
    public T pop() throws NullPointerException{
        T value = head.value;
        head = head.next;
        size--;
        return value;
    }
}
