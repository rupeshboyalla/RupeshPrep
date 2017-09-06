package LeetCode_Medium;

/**
 *
 * Given two non-negative integers num1 and num2 represented as strings,
 * return the product of num1 and num2.

 Note:

 The length of both num1 and num2 is < 110.
 Both num1 and num2 contains only digits 0-9.
 Both num1 and num2 does not contain any leading zero.
 You must not use any built-in BigInteger library or convert the inputs to integer directly.
 *
 *
 *
 */
public class StringMultiplication {

    public static void main(String[] args) {
        StringMultiplication sm = new StringMultiplication();
        System.out.println(sm.multiply("6913259244", "71103343"));
    }

    public String multiply(String num1, String num2) {

        if ( (num1.isEmpty() || num1.length() ==0 ) && (num2.isEmpty() || num1.length() ==0))
            return null;

        if(num1.length()+num2.length() >110)
            return null;
        long t1 = Integer.parseInt(num1);
        long t2 = Integer.parseInt(num2);

        return Long.toString(t1*t2);

    }



}
