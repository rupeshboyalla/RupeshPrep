package LinkedLists;

/**
 * Created by rupeshkb on 6/6/17.
 */
public class RemoveDuplicatesInSortedLinkedlist {
    Node head;

    public void removeDuplicates(){
        Node current = head;
        while (current.next !=null){
            if(current.data == current.next.data){
                current.next = current.next.next;
            }else
                current = current.next;
        }


    }

}
