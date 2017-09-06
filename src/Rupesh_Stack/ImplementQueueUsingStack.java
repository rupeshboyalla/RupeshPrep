package Rupesh_Stack;

import java.util.Stack;

/**
 *
 * Queue has a property where first inserted element will be removed first.
 * Also called as FIFO (First in first out)
 *
 *
 */
public class ImplementQueueUsingStack {
    public static Stack<Integer> input = new Stack<>();
    public static Stack<Integer> output = new Stack<>();

    public static void main(String[] args) {
        System.out.println("Inserting elements into stack");
        enqueue(1);
        enqueue(2);
        enqueue(3);
        enqueue(4);
        enqueue(5);
        enqueue(6);
        enqueue(7);
        enqueue(8);
        System.out.println("Removing elements ");
        System.out.println(peek());
        System.out.println(isEmpty());
        System.out.println(dequeue());
        System.out.println(peek());
        System.out.println(dequeue());
        System.out.println(peek());
        System.out.println(dequeue());
        System.out.println(peek());
        System.out.println(dequeue());
        System.out.println(peek());
        System.out.println(dequeue());
        System.out.println(peek());
        System.out.println(dequeue());
        System.out.println(peek());
        System.out.println(dequeue());
        System.out.println(peek());
        System.out.println(dequeue());
        System.out.println(isEmpty());
    }


    public static void enqueue(int x){
        System.out.println(x);
        input.push(x);
    }

    public static int dequeue(){
        while(!input.isEmpty()){
            output.push(input.pop());
        }
        return output.pop();
    }

    public static int peek(){
        while(!input.isEmpty()){
            output.push(input.pop());
        }
        return output.peek();
    }


    public static boolean isEmpty(){
        return input.isEmpty() && output.isEmpty();
    }

}
