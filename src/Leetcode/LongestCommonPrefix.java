package Leetcode;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        String[] str = {"abc", "a", "ab", "abcd"};
        System.out.println(lcp.longestCommonPrefix(str));

    }
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String pre = strs[0];
        for (int i = 1; i < strs.length; i++) {
            /*
                searching string inside a string if you find the
                string always it would be
                null
             */
            while (strs[i].indexOf(pre) != 0)
                pre = pre.substring(0, pre.length() - 1);
        }
        return pre;
    }
}
