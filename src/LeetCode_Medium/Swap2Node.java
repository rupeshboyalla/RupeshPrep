package LeetCode_Medium;

/**
 * Given a linked list, swap every two adjacent nodes and return its head.

 For example,
 Given 1->2->3->4, you should return the list as 2->1->4->3.

 Your algorithm should use only constant space. You may not modify the values in the list,
 only nodes itself can be changed.

 */
public class Swap2Node {

    public static void main(String[] args) {

    }

    public ListNode swapPairs(ListNode head) {
            if(head == null || head.next == null)
                return head;
            ListNode cur = head, pre = null;
            head = cur.next;
            while(cur != null && cur.next!=null) {
                ListNode nxt = cur.next;
                cur.next = nxt.next;
                nxt.next = cur;
                if(pre != null)
                    pre.next = nxt;
                pre = cur;
                cur = cur.next;
            }
            return head;
    }
}
