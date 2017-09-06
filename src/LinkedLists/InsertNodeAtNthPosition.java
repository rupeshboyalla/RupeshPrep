package LinkedLists;

/**
 *
 * Insert a node at nth position.
 *
 */
public class InsertNodeAtNthPosition {

    public static void main(String[] args) {

    }

    public static void insertNode(Node head, int data, int position){

        //Case 1 : if Head == null

        if(head == null){
            return;
        }

        // case 2 : if position is 1 which is inserting at first

        Node toInsert = new Node(data);
        if(position ==0){
            toInsert.next = head;
            head = toInsert;
            return;
        }else {
            Node current = head;
            for (int i =0; i> position -1; i++){
                current = current.next;
            }
            toInsert.next = current.next;
            current.next = toInsert;
        }

    }
}
