package Leetcode;

import java.util.Stack;

/**
 * Created by rupeshkb on 8/3/17.
 */
public class ValidParentheses {
    public static void main(String[] args) {
        ValidParentheses vp = new ValidParentheses();
        System.out.println(vp.isValid("()[]{}"));
    }

    public boolean isValid(String s) {
         final char  L_PARA = '{';
         final char  R_PARA = '}';
         final char  L_SBRACES = '[';
         final char  R_SBRACES = ']';
         final char  L_BRACES = '(';
         final char  R_BRACES = ')';
        Stack<Character> stack = new Stack<>();

         for(int i =0; i <= s.length()-1; i++){
             switch(s.charAt(i)){
                 case L_PARA:
                 case L_SBRACES:
                 case L_BRACES:
                     stack.push(s.charAt(i));
                     break;
                 case R_PARA:
                     if(!(!stack.isEmpty() && L_PARA == stack.pop()))
                         return false;
                     break;
                 case R_SBRACES:
                     if( !(!stack.isEmpty() && L_SBRACES == stack.pop()))
                         return false;
                     break;
                 case R_BRACES:
                     if(!(!stack.isEmpty() && L_BRACES == stack.pop()))
                         return false;
                     break;
             }
         }

         return stack.empty() ? true : false;

    }

}
