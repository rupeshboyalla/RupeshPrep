package Leetcode;

import java.util.List;

/**
 * Created by rupeshkb on 8/8/17.
 */
public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        if(head == null)
            return false;
        ListNode current = head;
        ListNode fast = current.next;
        ListNode slow = current;
        while (slow != null && fast !=null && fast.next !=null){
            if(slow == fast)
                return true;
            else {
                slow = slow.next;
                fast = fast.next.next;
            }

        }
        return false;
    }
}
