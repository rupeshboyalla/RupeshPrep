package LinkedLists;

/**
 *
 * Find out given linkedlist is a circular
 * Two ways we can do this - Store or mark the given node is you already is seen then it's
 * intersected.
 *two pointer approach.
 *
 */
public class GivenLinkedListIsCircular {

    public static boolean isCircular(Node head){

        if(head == null)
            return false;
        Node fast = head;
        Node slow = head;

        while (fast !=null && slow !=null){
            if(fast == slow){
                return true;
            }
            fast = head.next.next;
            slow = head.next;
        }
        return false;

    }
}
