/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac29;

public class Node {
    protected Item data;
    protected Node nextNode;
    protected Node prevNode;

    public Node(Item item) {
        data = item;
    }

    public Node(Item item, Node nextNode, Node prevNode) {
        data = item;
        this.nextNode = nextNode;
        this.prevNode = prevNode;
    }
}
