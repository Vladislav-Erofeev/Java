/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package Prac32;

import java.io.Serializable;

public class QueueNode implements Serializable {
    QueueNode next;
    QueueNode prev;
    Order value;


    QueueNode(Order value, QueueNode prev){
        this.prev = prev;
        this.value = value;
        next =null;
    }

    public void setNext(QueueNode next){
        this.next = next;
    }
}
