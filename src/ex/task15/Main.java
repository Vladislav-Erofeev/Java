/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package ex.task15;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(-1);
        stack.push(-31);
        stack.push(31);
        stack.push(11);
        stack.push(-3);
        stack = splitStack(stack);
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }

    public static Stack<Integer> splitStack(Stack<Integer> stack) {
        Queue<Integer> queue = new ArrayDeque<>();
        Stack<Integer> newStack = new Stack<>();
        while (!stack.empty()) {
            Integer value = stack.pop();
            if(value > 0)
                queue.add(value);
            else
                newStack.push(value);
        }

        while(!queue.isEmpty()) {
            newStack.push(queue.poll());
        }
        return newStack;
    }
}
