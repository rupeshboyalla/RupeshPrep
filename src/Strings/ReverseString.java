package Strings;

import java.util.Stack;

/**
 *
 * Reverse string there are many way to reverse string.
 *
 *1. Using in built string methods
 * StringBuffer sb = new StringBuffer("given String")
 * sd.reverse();
 *
 * 2. Using iterative methods
 *
 * 3. Using Stack
 *
 */
public class ReverseString {

    public static void main(String[] args) {
        System.out.println(reverseString_inBuiltMethod("Java"));
        System.out.println(reverseString_inBuiltMethod("Mounika"));
        System.out.println(reverseString_iterativeMethod("Mounika"));
        System.out.println(reverseString_iterativeMethod("Java"));
        System.out.println(reverseString_UsingStack("Java"));
        System.out.println(reverseString_UsingStack("Mounika"));
    }

    public static String reverseString_inBuiltMethod(String s){
        StringBuffer sb = new StringBuffer(s);
        return sb.reverse().toString();
    }

    public static String reverseString_iterativeMethod(String s){
        if(s == null || s.isEmpty())
            throw new IllegalArgumentException("Input string is null");
        char[] s_array = s.toCharArray();
        int i=0, j= s.length()-1;
        System.out.println("String length ===>"+s.length()/2);
        while(i < j){
            char temp = s_array[i];
            s_array[i] = s_array[j];
            s_array[j] = temp;
            i++;
            j--;
        }
        return new String(s_array);
    }

    public static String reverseString_UsingStack(String s){

        Stack<Character> stack = new Stack<>();

        char[] s_array = s.toCharArray();
           StringBuffer sb = new StringBuffer();
        for(char c : s_array){
            stack.push(c);
        }

        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}
