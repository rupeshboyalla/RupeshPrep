package Leetcode;

/**
 * Reverse integer
 *
 * given integer : 123 expected is 321
 * Given integer : -234 and expected is -432
 *
 */
public class ReverseInteger {
    public static void main(String[] args) {
        ReverseInteger ri = new ReverseInteger();
        System.out.println(ri.reverseInteger(1534236469));
    }

    public int reverseInteger(int num){
        int result = 0;
        boolean isNegative = false;
        if(num <0 ) {
            isNegative = true;
            num = (num < 0) ? -num : num;
        }
         while(num != 0 ){
            result = result*10 + (num%10);
             if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE){
                 return 0;
             }
             num = (num/10);
         }
         if(isNegative){
             result = 0-result;
         }

         return result;
    }


}
