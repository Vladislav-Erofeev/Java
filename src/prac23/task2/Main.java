/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac23.task2;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new ListQueue<>();
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);
        try {
            System.out.println(queue.pop());
            System.out.println(queue.pop());
            System.out.println(queue.pop());
            System.out.println(queue.pop());
            System.out.println(queue.pop());
        } catch (IndexOutOfBoundsException exc) {
            System.out.println("Exc");
        }

    }
}
