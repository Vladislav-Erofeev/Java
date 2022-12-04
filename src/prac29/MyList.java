/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac29;

public class MyList {
    private Node head;

    public MyList() {
        head = null;
    }

    public void add(Item item) {
        if (head == null) {
            head = new Node(item);
            head.prevNode = head;
            head.nextNode = head;
            return;
        }
        Node current = head;
        while (current.nextNode != head) {
            current = current.nextNode;
        }
        Node temp = new Node(item, head, current);
        current.nextNode = temp;
        head.prevNode = temp;
    }

    public Item get(int i) throws ArrayIndexOutOfBoundsException{
        Node current = head;
        int count = 0;
        while (count < i) {
            if (current.nextNode == head && count == i-1) {
                throw new ArrayIndexOutOfBoundsException("Item not found");
            }
            current = current.nextNode;
            count++;
        }
        return current.data;
    }

    public Node getNode(int i) throws ArrayIndexOutOfBoundsException{
        Node current = head;
        int count = 0;
        while (count < i) {
            if (current.nextNode == head && count == i-1) {
                throw new ArrayIndexOutOfBoundsException("Item not found");
            }
            current = current.nextNode;
            count++;
        }
        return current;
    }

    public void remove(int i) throws ArrayIndexOutOfBoundsException {
        if(i == 0 && size() == 1) {
            head = null;
            return;
         }else if (i == 0) {
            head.nextNode.prevNode = head.prevNode;
            head.prevNode.nextNode = head.nextNode;
            head = head.nextNode;
            return;
        }

        Node node = getNode(i);
        node.prevNode.nextNode = node.nextNode;
        node.nextNode.prevNode = node.prevNode;
    }

    public void display() {
        if (head == null)
            return;
        Node current = head;
        System.out.println(head.data);
        while (current.nextNode != head) {
            current = current.nextNode;
            System.out.println(current.data);
        }
    }

    public int size() {
        if (head == null) {
            return 0;
        }
        Node current = head;
        int count = 1;
        while(current.nextNode != head) {
            current = current.nextNode;
            count++;
        }
        return count;
    }

    public boolean include(String name) {
        if (head == null)
            return false;
        Node current = head;
        do {
            if (current.data.getName() == name) {
                return true;
            }
            current = current.nextNode;
        } while (current != head);
        return false;
    }
}
