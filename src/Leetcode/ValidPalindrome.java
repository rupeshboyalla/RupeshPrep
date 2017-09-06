package Leetcode;

/**
 * Given a string, determine if it is a palindrome, considering only alphanumeric
 * characters and ignoring cases.

 For example,
 "A man, a plan, a canal: Panama" is a palindrome.
 "race a car" is not a palindrome.

 Note:
 Have you consider that the string might be empty? This is a good question to ask during an interview.

 For the purpose of this problem, we define empty string as valid palindrome.


 *
 *
 *
 *
 */
public class ValidPalindrome {
    public static void main(String[] args) {
        ValidPalindrome valid = new ValidPalindrome();
        System.out.println(valid.isPalindrome("A man, a plan, a canal: Panama"));
    }

    public boolean isPalindrome(String s) {
        if(s.isEmpty() || s.length() ==0){
            return false;
        }
        char[] s_array = s.toCharArray();
        int i =0, j = s_array.length-1;

        while(i <= j){
            if( !Character.isLetterOrDigit(s_array[i])){
                i++;
            }
            else if( !Character.isLetterOrDigit(s_array[j])){
                j--;
            }
           else if(Character.toLowerCase(s_array[i]) == Character.toLowerCase(s_array[j])){
                i++; j--;
            }else
                return false;
        }
        return true;

    }
}
