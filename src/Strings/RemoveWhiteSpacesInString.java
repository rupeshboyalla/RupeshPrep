package Strings;

/**
 *
 * Remove all white spaces from a string.?
 *
 */
public class RemoveWhiteSpacesInString {

    public static void main(String[] args) {
        System.out.println(removingWhiteSpaces("all white spaces from a string"));
    }

    public static String removingWhiteSpaces(String s){
        if(s == null || s.isEmpty())
            throw new IllegalArgumentException("input string is null");
        char[] char_array = s.toCharArray();
        StringBuffer sb = new StringBuffer();
        for(int i=0; i< s.length(); i++){
            char c = char_array[i];
            if(c == ' ' || c == '\t'){

            }else
                sb.append(c);
        }
        System.out.println(sb.toString());
        return sb.toString();
    }
}
