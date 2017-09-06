package Leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a pattern and a string str, find if str follows the same pattern.

 Here follow means a full match, such that there is a bijection between a
 letter in pattern and a non-empty word in str.

 Examples:
 pattern = "abba", str = "dog cat cat dog" should return true.
 pattern = "abba", str = "dog cat cat fish" should return false.
 pattern = "aaaa", str = "dog cat cat dog" should return false.
 pattern = "abba", str = "dog dog dog dog" should return false.
 Notes:
 You may assume pattern contains only lowercase letters,
 and str contains lowercase letters separated by a single space.
 *
 *
 *
 *
 *
 */
public class StringPatternMatch {

    public static void main(String[] args) {
        StringPatternMatch spm = new StringPatternMatch();
        System.out.println(spm.wordPattern("abba", "dog cat cat dog"));
    }

    public boolean wordPattern(String pattern, String str) {
        char[] pattern_array = pattern.toCharArray();
        String[] str_array = str.split("\\s");
        if(pattern_array.length != str_array.length)
            return false;
        Map<Character, String> map = new HashMap<>();
        for(int i=0; i< pattern_array.length; i++){
            if(map.containsKey(pattern_array[i])){
                if(!str_array[i].equals(map.get(pattern_array[i])))
                    return false;
            }else if(!map.containsValue(str_array[i]))
                map.put(pattern_array[i], str_array[i]);
            else
                return  false;
        }
        return true;
    }
}
