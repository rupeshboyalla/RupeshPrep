package LinkedLists;

/**
 *
 * Implementing Linkedlist here.
 *
 *
 */
public class LinkedListImple {
    Node head, tail=null;

    public void addFirst(int data){
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }
    // Add function we can optimize by keeping always tail reference.
    public void add (int data){
        if(head == null){
            head = new Node(data);
            return;
        }
         Node current = head;
        while(current.next !=null){
            current = current.next;
        }
        current.next = new Node(data);
    }

    public void add_optimized(int data){
        if(head == null && tail == null){
            head = new Node(data);
            tail = head;
            return;
        }
        Node newNode = new Node(data);
        if(tail !=null){
            tail.next = newNode;
            tail = newNode;
        }

    }

    public void deleteNode(int data){
        if(head.data == data){
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next !=null){
            if(current.next.data == data){
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }

    }

    public void display(){
        if(head == null){
            return;
        }
        Node current = head;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }




}
