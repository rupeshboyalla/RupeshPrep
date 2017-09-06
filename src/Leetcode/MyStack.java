package Leetcode;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * Implement the following operations of a stack using queues.

 push(x) -- Push element x onto stack.
 pop() -- Removes the element on top of the stack.
 top() -- Get the top element.
 empty() -- Return whether the stack is empty.
 Notes:
 You must use only standard operations of a queue -- which means only push to back, peek/pop from front, size, and is empty operations are valid.
 Depending on your language, queue may not be supported natively. You may simulate a queue by using a list or deque (double-ended queue), as long as you use only standard operations of a queue.
 You may assume that all operations are valid (for example, no pop or top operations will be called on an empty stack).
 *
 *
 *
 */
public class MyStack {
    public Queue<Integer> queue1;
    public Queue<Integer> queue2;

    /**
     * Initialize your data structure here.
     */
    public MyStack() {

         queue1 = new LinkedList<>();
         queue2 = new LinkedList<>();


    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
       queue1.add(x);
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        while(!queue1.isEmpty()){
            queue2.add(queue1.remove());
        }
       return queue2.remove();
    }

    /**
     * Get the top element.
     */
    public int top() {
        return queue1.peek();

    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return queue1.isEmpty();
    }


    public static void main(String[] args) {
        MyStack obj = new MyStack();
        obj.push(1);
        obj.push(2);
        System.out.println(obj.top());
        System.out.println(obj.empty());
    }
}