package LinkedLists;

/**
 * Created by rupeshkb on 7/10/17.
 */
public class MergePointOfTwoLinkedList {

    public static Node mergePoint(Node a, Node b) {
        int m = length(a);
        int n = length(b);
        if (m > n) {
            Node temp = a;
            a = b;
            b = temp;
        }
        int d = n - m;
        for (int i = 0; i <= d; i++) {
            b = b.next;
        }

        while (a != null & b != null) {
            if (a == b)
                return a;
            else {
                a = a.next;
                b = b.next;
            }
        }
        return null;
    }

    public static int length(Node head) {
        if (head == null)
            return -1;
        int counter = 0;
        while (head.next != null) {
            head = head.next;
            counter++;
        }
        return counter;
    }
}
