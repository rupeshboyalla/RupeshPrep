package Leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by rupeshkb on 8/8/17.
 */
public class ValidAnagram {
    public static void main(String[] args) {
        ValidAnagram va = new ValidAnagram();
        System.out.println(va.isAnagram("a", "a"));
    }
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        char[] s_array = s.toCharArray();
        char[] t_array = t.toCharArray();
        for(char c : s_array){
            if (map.containsKey(c)) {
                map.put(c, map.get(c)+1);
            }else
                map.put(c,1);
        }

        for(char c : t_array){
            if(map.containsKey(c)){
                if(map.get(c) > 1){
                    map.put(c, map.get(c)-1);
                }else
                    map.remove(c);
            }else
                return false;
        }
        return map.isEmpty();
    }
}
