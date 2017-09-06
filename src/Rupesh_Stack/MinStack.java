package Rupesh_Stack;

import java.util.Stack;

/**
 * Min stack is at any point of time getting the min element from stack
 *
 *
 */
public class MinStack {

    public static Stack<Integer> s = new Stack<>();
    public static Stack<Integer> minStack = new Stack<>();

    public static void main(String[] args) {

    }

    public static void push(int x){
        if(minStack.isEmpty()){
            minStack.push(x);
        } else if( x >= minStack.peek()){
            minStack.push(x);
        }
        s.push(x);
    }

    public static int pop(){
        if(s.peek() == minStack.peek())
            minStack.pop();
        return s.pop();
    }


    public static int minStack(){
       return minStack.peek();
    }

}
