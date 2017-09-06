package Leetcode;

import java.util.Stack;

/**
 * Implement Queue using Stacks
 *
 *
 *
 *
 *
 *
 */
public class MyQueue {

    public Stack<Integer> input;
    public Stack<Integer> output;

    /** Initialize your data structure here. */
    public MyQueue() {
        input = new Stack<>();
        output = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        input.push(x);

    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        while(!input.isEmpty()){
            output.push(input.pop());
        }
     return output.pop();
    }

    /** Get the front element. */
    public int peek() {
        return input.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {

       return input.isEmpty();

    }

    public static void main(String[] args) {
        MyQueue obj = new MyQueue();
        obj.push(1);
        obj.push(2);
        obj.pop();
        obj.peek();
    }
}
