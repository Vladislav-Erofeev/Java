/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package ex.taskNaN;

public class LinkedIntList {
    private ListNode head;

    public LinkedIntList() {
        head = null;
    }

    public void add(int value) {
        if(head == null) {
            head = new ListNode(value, null);
            return;
        }
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new ListNode(value, null);
    }

    public void firstLast() {
        ListNode current = head;
        while(current.next != null) {
            current = current.next;
        }
        current.next = head;
        head = head.next;
        current.next.next = null;
    }

    public void print() {
        ListNode current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
