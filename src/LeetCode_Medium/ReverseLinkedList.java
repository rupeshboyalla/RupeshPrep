package LeetCode_Medium;

import Rupesh_Linkedlist.Linkedlist;

/**
 * Created by rupeshkb on 8/15/17.
 */
public class ReverseLinkedList {
    ListNode head;
    public static void main(String[] args) {
        ReverseLinkedList rl = new ReverseLinkedList();
        rl.add(5);
        rl.add(4);
        rl.add(3);
        rl.add(2);
        rl.add(1);
        rl.addFirst(6);
        rl.disPlay();
        rl.reverseLinkedList();
        rl.disPlay();
    }

    public void addFirst(int data){
        if(head == null){
            head = new ListNode(data);
        }else {
            ListNode newHead = new ListNode(data);
            newHead.next = head;
            head = newHead;
        }
    }

    public void add(int data){
        if(head == null){
            head = new ListNode(data);
        }else {
            ListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new ListNode(data);
        }
    }

    public void disPlay(){
        if(head == null)
            return;
        ListNode current = head;
        while (current.next !=null){
            System.out.print(current.val+"->");
            current = current.next;
        }
        System.out.println(current.val);
    }

    public void reverseLinkedList(){
        if(head == null)
            return;
        ListNode current = head;
        ListNode prev=null, next;
        while(current !=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;

        }
        head = prev;
    }


}
