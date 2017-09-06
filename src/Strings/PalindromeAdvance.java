package Strings;

/**
 *
 * check if the given string is a palindrome with special characters and lower, upper case.
 *
 *
 */
public class PalindromeAdvance {

    public static void main(String[] args) {
        System.out.println(isPalindrome("race a car"));

    }

    public static boolean isPalindrome(String s){
        if(s.length() ==0 || s==null)
            throw new IllegalArgumentException("input string empty");
        int start =0;
        int end = s.length() -1;
        while(start < end){
            while(!isAlphaNumerical(s.charAt(start))){
                start++;
            }
            while(!isAlphaNumerical(s.charAt(end))){
                end --;
            }

            if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end)))
                return false;
            else {
                start ++;
                end --;
            }

        }

        return true;

    }

    public static boolean isAlphaNumerical(char c){
        if((c >= '0' && c <= '9') || (c >= 'a' && c <='z' ) || (c >= 'A' && c < 'Z' )) {
            return true;
        }
            return false;
    }
}
