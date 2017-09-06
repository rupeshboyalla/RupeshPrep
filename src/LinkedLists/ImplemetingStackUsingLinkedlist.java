package LinkedLists;

/**
 *  stack is list in first out
 *
 *  Implement PUSH, POP, TOP and isEmpty all these operation in the constant time.
 *
 *  PUSH - Add link at the beginning of the linked list
 *  POP - always remove the element at the beginning of the linked list.
 *
 *
 *
 *
 *
 */
public class ImplemetingStackUsingLinkedlist {

    Node head;


    public void push(int data){
        if (head == null ){
            head = new Node(data);
            return;
        }
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
        return;
    }

    public int pop(){
        if(head == null){
            return -1;
        }
        Node temp = head;
        head = head.next;
        return temp.data;
    }

    public int top(){
        if(head == null){
            return -1;
        }

        return head.data;
    }

    public boolean isEmpty() {
        if (head == null)
            return true;
        else
            return false;
    }

}
