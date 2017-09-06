package Rupesh_Stack;

import java.util.Stack;

/**
 *  Stack is a Last In First out data structure.
 *
 *  Operations in stack:
 *  push(obj data) takes constant time for inserting the data
 *  pop() takes constant time for removing data
 *  peek() takes constant time to look the first element
 *  size() takes linear time to get the size of the stack.
 *  isEmpty() will check stack is empty or not.
 *
 *
 *
 */
public class AboutStack {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        System.out.println("stack inserting order" );
        stack.push(2);
        System.out.println(2);
        stack.push(3);
        System.out.println(3);
        stack.push(4);
        System.out.println(4);
        stack.push(5);
        System.out.println(5);
        stack.push(6);
        System.out.println(6);
        System.out.println("Stack printing order");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
