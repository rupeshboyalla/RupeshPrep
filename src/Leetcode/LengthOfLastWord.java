package Leetcode;

/**
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ',
 * return the length of last word in the string.

 If the last word does not exist, return 0.

 Note: A word is defined as a character sequence consists of non-space characters only.

 For example,
 Given s = "Hello World",
 return 5
 *
 *
 */
public class LengthOfLastWord {


    public static void main(String[] args) {
        LengthOfLastWord ls = new LengthOfLastWord();
        System.out.println(ls.lengthOfLastWord(" "));
    }

    public int lengthOfLastWord(String s) {
        if(s.length() ==0 || s.isEmpty())
            return 0;
        String[] s_array = s.split("\\s");
        if(s_array.length <=1  )
            return 0;
        return s_array[s_array.length-1].length();
    }

}
