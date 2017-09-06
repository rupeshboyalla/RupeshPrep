package Rupesh_Stack;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 *  Queue is first in first out. Insertion can happen from one end and deletion can happen
 *  on the other end.
 *
 *  Operation in Queue:
 *   - void add(object oj
 *   - object remove()
 *   - peek() to see the
 *
 *
 *
 *
 *
 */
public class Queues {

    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println(queue.peek());
        while(!queue.isEmpty()){
            System.out.println(queue.remove());
        }
    }
}
