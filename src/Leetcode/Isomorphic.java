package Leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Given two strings s and t, determine if they are isomorphic.

 Two strings are isomorphic if the characters in s can be replaced to get t.

 All occurrences of a character must be replaced with another character
 while preserving the order of characters.
 No two characters may map to the same character but a character may map to itself.

 For example,
 Given "egg", "add", return true.

 Given "foo", "bar", return false.

 Given "paper", "title", return true.

 Note:
 You may assume both s and t have the same length.
 */
public class Isomorphic {
    public static void main(String[] args) {
        Isomorphic i = new Isomorphic();
        System.out.println(i.isIsomorphic("ab", "aa"));
    }
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        for(int i=0; i< s.length(); i++){
            char a = s.charAt(i);
            char b = t.charAt(i);
            if(map.containsKey(a)){
                if(b !=  map.get(a)) {
                    return false;
                }
            }else if(!map.containsValue(b))
                map.put(a, b);
            else
                return false;
        }

        return true;
    }
}
