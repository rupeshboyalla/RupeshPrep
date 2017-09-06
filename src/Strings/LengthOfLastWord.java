package Strings;

/**
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ',
 * return the length of last
 * word in the string. If the last word does not exist, return 0.
 */
public class LengthOfLastWord {

    public static void main(String[] args) {

    }

    public static int countLength(String s){
        if(s.length() == 0)
            throw new IllegalArgumentException("given string is empty");
        char[] s_array = s.toCharArray();
        boolean flag = false;
        int result = 0;
        for(int i=s.length() -1 ; i>=0 ; i--){
            if(Character.isAlphabetic(s_array[i])){
                flag = true;
                result ++;
            }
            else if(flag)
                return result;
        }
        return result;
    }
}
