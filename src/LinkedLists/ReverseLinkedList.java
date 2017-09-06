package LinkedLists;

/**
 * Created by rupeshkb on 7/10/17.
 */
public class ReverseLinkedList {

    public static Node reverse(Node head){
        Node current = head, prev = null, next;

        if(head == null)
            return null;
        while(current.next !=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
        return head;

    }
}
