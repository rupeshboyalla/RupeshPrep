package Rupesh_Stack;

/**
 *
 *  Implement stack:
 *
 *      we can implement stack using the array list and also a linkedlist
 *      if we use the array list the time complexity is O(n) while removing the element bec
 *      to get the size the time complexity is O(n) in array list.
 *
 *      Using Linkedlist the time complexity is O(1) we can add an element at the head
 *      of the linkedlist and remove an element head
 *
 *
 */
class Node{
    int data;
    Node next;

    Node (int data){
        this.data = data;
    }
}


public class ImplementingStack {
    Node head;

    public static void main(String[] args) {

    }

    public void push(int x){
        if(head == null){
            head = new Node(x);
        }else{
            Node newHead = new Node(x);
            newHead.next = head;
            head = newHead;
        }
    }

    public int pop(){
        if(head == null){
            return -1;
        }
        int temp = head.data;
        head = head.next;
        return temp;
    }

    public int size(){
        if (head == null)
            return 0;
        int count =0;
        while(head.next != null){
            count ++;
            head = head.next;
        }
        return count;
    }

    public boolean isEmpty(){
        if (head == null)
            return true;
        else
            return false;
    }
}
