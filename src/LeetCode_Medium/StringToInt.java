package LeetCode_Medium;

/**
 *
 * Implement atoi to convert a string to an integer.

 Hint: Carefully consider all possible input cases.
 If you want a challenge, please do not see below and ask yourself what are the possible i
 nput cases.

 Notes: It is intended for this problem to be specified vaguely (ie, no given input specs). You are responsible to gather all the input requirements up front.
 *
 *
 */
public class StringToInt {

    public static void main(String[] args) {
        StringToInt st = new StringToInt();
        System.out.println(st.myAtoi("123"));
    }

    public int myAtoi(String str) {
        if(str==null || str.length() ==0)
            return  -1;
        int index = 0;
        int sum =0;
        boolean isNegative = false;
        if(str.charAt(index) == '-'){
            isNegative = true;
        }
        for(; index< str.length(); index++){
            if(Character.isLetterOrDigit(str.charAt(index)))
            sum = sum*10+Character.getNumericValue(str.charAt(index));
        }
        if(isNegative)
            return 0-sum;

        return sum;
    }
}
