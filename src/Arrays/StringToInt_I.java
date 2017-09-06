package Arrays;

import Strings.StringToInt;

/**
 * Created by rupeshkb on 7/16/17.
 */
public class StringToInt_I {

    /**
     * Sort the given array and use the Binary search to find the element
     *
     *  to sort it's is O(logn) and for binary search it's O(logn)
     *
     */
    public static void main(String[] args) {
        String s ="abc12 c13d d1";
        //o/p expected  here is 26
        System.out.println(StringToInt(s));

    }

    public static int StringToInt(String givenString){
        int result =0;
        String[] s_array  = givenString.split(" ");
        for(String s: s_array){
            int sum=0;
            char[] char_array = s.toCharArray();
            for(int i=0; i<= char_array.length-1; i++){
                if(Character.isDigit(char_array[i])){
                    sum = sum *10 + Character.getNumericValue(char_array[i]);
                }
            }
            result += sum;
        }
        return result;
    }


}
