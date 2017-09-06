package LeetCode_Medium;

import java.util.HashSet;
import java.util.Set;

/**
 *
 *Given a string, find the length of the longest substring without repeating characters.

 Examples:

 Given "abcabcbb", the answer is "abc", which the length is 3.

 Given "bbbbb", the answer is "b", with the length of 1.

 Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.


 *
 *
 */
public class LongestSubString {
    public static void main(String[] args) {
        LongestSubString ls = new LongestSubString();
        System.out.println(ls.lengthOfLongestSubstring("aab"));
    }


    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int i=0, j=0, result=0;
        int n = s.length();

        while (i < n && j < n) {
            if (!set.contains(s.charAt(i))) {
                set.add(s.charAt(i++));
                result = Math.max(result, set.size());
            } else {
                set.remove(s.charAt(j++));
            }
        }
        return result;
    }
}
