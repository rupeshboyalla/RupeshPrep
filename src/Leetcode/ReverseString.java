package Leetcode;

/**
 * Created by rupeshkb on 8/8/17.
 */
public class ReverseString {
    public static void main(String[] args) {
        ReverseString rs = new ReverseString();
        System.out.println(rs.reverseString("hello"));
    }

    public String reverseString(String s) {
        if(s.length() ==0)
            return null;
        char[] s_array = s.toCharArray();
        int start = 0, end = s.length()-1;
        while (start < end){
            char temp = s_array[start];
            s_array[start] = s_array[end];
            s_array[end] = temp;
            start ++;
            end --;
        }
        return String.valueOf(s_array);
    }
}
