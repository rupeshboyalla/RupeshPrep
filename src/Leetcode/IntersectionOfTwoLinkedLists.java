package Leetcode;

/**
 * Created by rupeshkb on 8/8/17.
 */
public class IntersectionOfTwoLinkedLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if(headA == null && headB == null)
            return null;
        int a = length(headA);
        int b = length(headB);
        if( a > b){
            ListNode temp = headA;
            headA = headB;
            headB = temp;
        }
        int diff = a-b;
        for (int i = 0; i <= diff; i++) {
            headB = headB.next;
        }

        while (headA.next !=null || headB.next !=null){
        if(headA == headB)
            return headA;
        else {
            headA = headA.next;
            headB = headB.next;
        }
    }

        return null;
}

    public int length(ListNode head){
        if (head == null)
            return -1;
        int count =0;
        while(head !=null){
            count ++;
            head = head.next;
        }
        return count;
    }

}
