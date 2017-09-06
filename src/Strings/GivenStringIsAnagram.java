package Strings;

import java.util.HashMap;
import java.util.Map;

/**
 *  check whether two strings are anagram or not
 */
public class GivenStringIsAnagram {

    public static void main(String[] args) {

    }

    public static boolean isAnagram(String s, String anagram){
        if((s.length() != anagram.length()) || s.isEmpty()  || anagram.isEmpty())
                return false;

        char[] s_array = s.toCharArray();
        char[] anagram_array = anagram.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for(char c : s_array){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else
                map.put(c, 1);
        }

        for(char c : anagram_array){
            if(map.containsKey(c) && (map.get(c) > 1)){
                map.put(c, map.get(c)-1);
            } else if(map.containsKey(c) && (map.get(c) == 1)){
                map.remove(c);
            }else
                return false;
        }

        return map.size() ==0 ? true : false;
    }
}
