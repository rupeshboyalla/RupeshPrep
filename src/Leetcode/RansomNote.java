package Leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an arbitrary ransom note string and another string containing letters
 * from all the magazines, write a function that will return true if the ransom note
 * can be constructed from the magazines ; otherwise, it will return false.

 Each letter in the magazine string can only be used once in your ransom note.

 Note:
 You may assume that both strings contain only lowercase letters.

 canConstruct("a", "b") -> false
 canConstruct("aa", "ab") -> false
 canConstruct("aa", "aab") -> true
 *
 *
 */
public class RansomNote {
    public static void main(String[] args) {
        RansomNote rn = new RansomNote();
        System.out.println(rn.canConstruct("aa", "aab"));
    }
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        char[] r_array = ransomNote.toCharArray();
        char[] m_array = magazine.toCharArray();
        for(char c : r_array){
            if (map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else
                map.put(c,1);
        }
        for(char c : m_array) {
            if (map.containsKey(c) && map.get(c) == 1) {
                map.remove(c);
            } else if (map.containsKey(c))
                map.put(c, map.get(c) - 1);
        }
        return map.size() ==0 ? true : false;
    }


}
