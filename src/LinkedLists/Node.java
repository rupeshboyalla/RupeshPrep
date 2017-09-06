package LinkedLists;

/**
 *
 * Here creating node class with the integer data.
 *
 *
 */
public class Node {
    Node next;
    int data;

    public Node(int data){
        this.data = data;
        this.next = null;
    }

    public Node getNext(){
        return next;
    }

}
