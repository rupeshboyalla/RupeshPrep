package LinkedLists;

/**
 *
 * In Queue elements will be added at one end and deletion can be done on the other end.
 *
 *
 * Operation
 * enqueue(x)
 * dequeue()
 * peek()
 * isEmpty()
 *
 */
public class ImplementingQueueUsingLinkedlist {

    Node head;
    Node front=null, tail = null;
    /**
     *
     * In enqueue we will implement in such a way that always insert an element at the end
     * of the linked list without traversing by storing the last node reference.
     *
     *
     * @param data
     */

    public void enqueue(int data){
        Node temp = new Node(data);
        if(front == null && tail == null){
            front = tail = temp;
            return;
        }
        temp.next = tail;
        tail = temp;
    }

    public int dequeue(){
        if(front == null)
            return -1;
        Node temp = front;
        front = front.next;
        return temp.data;
    }

    public int peek(){
        return front.data;
    }

    public boolean isEmpty(){
        if(front == null)
            return true;
        else
            return false;
    }


}
