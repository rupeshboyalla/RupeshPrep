package Leetcode;

/**
 * Created by rupeshkb on 8/11/17.
 */
public class RemoveNodeInLinkedlIst {

    public ListNode removeElements(ListNode head, int val) {
        if(head == null)
            return null;
        ListNode current = head;
        while(current.next !=null){
            if(current.next.val == val) {
                current.next = current.next.next;
            }
            else
                current = current.next;
    }
        return head.val == val ? head.next: head;
}
}
