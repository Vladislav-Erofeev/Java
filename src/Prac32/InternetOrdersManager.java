/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package Prac32;

import java.io.Serializable;

public class InternetOrdersManager implements OrdersManager, Serializable {

    QueueNode head = null;
    QueueNode tail = null;
    Integer size = 0;


    @Override
    public int itemsQuantity(String itemName) {
        QueueNode tmp = head;
        int total = 0;
        while (tmp != null) {
            total += tmp.value.getItems().stream().mapToInt(obj -> (obj.getName() == itemName) ? 1 : 0).sum();
            tmp = tmp.next;
        }
        return total;
    }

    @Override
    public int itemsQuantity(MenuItem item) {
        QueueNode tmp = head;
        int total = 0;
        while (tmp != null) {
            total += tmp.value.getItems().stream().mapToInt(obj -> (obj == item) ? 1 : 0).sum();
            tmp = tmp.next;
        }
        return total;
    }

    @Override
    public Order[] getOrders() {
        Order[] orders = new Order[size];
        QueueNode tmp = head;
        int i = 0;
        while (tmp != null) {
            orders[i++] = tmp.value;
            tmp = tmp.next;
        }
        return orders;
    }

    @Override
    public int ordersCostSummary() {
        QueueNode tmp = head;
        int total = 0;
        while (tmp != null) {
            total += tmp.value.getItems().stream().mapToInt(MenuItem::getCost).sum();
            tmp = tmp.next;
        }
        return total;
    }

    @Override
    public int ordersQuantity() {
        QueueNode tmp = head;
        int count = 0;
        while (tmp != null) count++;
        return count;
    }


    public boolean add(Order order){
        size++;
        if(head == null){
            head = new QueueNode(order,null);
            tail = head;
        }else{
            tail.next = new QueueNode(order,tail);
            tail = tail.next;
        }
        return true;
    }

    public Order remove(){
        size--;
        QueueNode tmp = head;
        if(head.next != null) head = head.next;
        else{
            head = null;
            tail = null;
        }
        return tmp.value;
    }

    public Order order(){
        return head.value;
    }


}