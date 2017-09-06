package Strings;

import java.util.HashMap;
import java.util.Map;

/**
 *
 *  This is also equal to permutations of a string is a palindrome
 *
 *
 *
 */
public class RotationOfPalindrome {
    public static void main(String[] args) {

        System.out.println(rotatedPalindrome("aaaad"));
    }

    public static boolean rotatedPalindrome(String s){
        int count =0;
        if(s.length() ==0)
            return false;
        char[] s_array = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for(char c : s_array){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else
                map.put(c, 1);
        }
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() ==1 ) {

                count ++;
            }
        }

        return count == 1 ? true : false;
    }
}
