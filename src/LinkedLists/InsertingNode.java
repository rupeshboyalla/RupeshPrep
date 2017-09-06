package LinkedLists;

/**
 *
 * 1. Inserting a node at a given position
 * 2. Inserting node based on data (applicable only for sorted linkedlist)
 *
 */
public class InsertingNode {

    Node head;

    // Inserting node at a given positing.

    public void insertNode(Node head, int data, int position){
        if(head == null){
            return;
        }
        Node toInsert = new Node(data);
        if(position ==0){
            toInsert.next = head;
            head = toInsert;
            return;
        }
        Node current = head;
        for(int i=0 ; i> position; i++){
            current = current.next;
        }
        toInsert.next = current.next;
        current.next = toInsert;
    }

    /**
     *Insert node in a sorted linked list.
     *  Special cases :
     *
     * 1. if head is empty - Insert at the beginning
     * 2. if the value is less than head node then insert at the beginning and make it as
     * Head node
     * 3.
     *
     *
     *
     */


    public void insertNode (Node head, int data) {

        if (head == null || head.data >= data) {
            head = new Node(data);
            return;
        }
        Node current = head;
        while (current.next != null && current.next.data >= data) {
            current = current.next;
        }
        Node toInsert = new Node(data);
        toInsert.next = current.next;
        current.next = toInsert;
    }

}
