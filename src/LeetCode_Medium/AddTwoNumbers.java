package LeetCode_Medium;

/**
 *
 *You are given two non-empty linked lists representing two non-negative integers.
 *  The digits are stored in reverse order and each of their nodes contain a single digit.
 *  Add the two numbers and return it as a linked list.

 You may assume the two numbers do not contain any leading zero, except the number 0 itself.


 Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 Output: 7 -> 0 -> 8


 *
 *
 *
 *
 *
 */
public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next = new ListNode(4);

        AddTwoNumbers add = new AddTwoNumbers();

        ListNode l4 =  add.addTwoNumbers(l1, l2);
        System.out.println();

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        int carry =0;
        int sum =0;

        while(l1.next != null && l2.next !=null){
            int temp = l1.val +l2.val;
            if(temp >9){
                sum = sum*10+ temp%10;
                carry = temp/10;
            }else{
                sum=sum*10+temp+carry;
                carry =0;
            }

            while (sum < 0){
                 int temp1 = sum%10;
                sum = sum/10;
                result.next.val = temp1;
            }

        }

        return result;

    }
}
