package LeetCode_Medium;

import Leetcode.InsertPosition;
import com.sun.org.apache.regexp.internal.RE;

/**
 * Created by rupeshkb on 8/14/17.
 */
public class IntegerToRoman {
    public static void main(String[] args) {
        IntegerToRoman ir = new IntegerToRoman();
        System.out.println(ir.intToRoman(3329));
    }

    public String intToRoman(int num) {
        StringBuffer sb = new StringBuffer();
        String[] M = {"", "M", "MM", "MMM"};
        String[] C = {"", "C","CC", "CCC", "CD", "D","DC", "DCC", "DCCC", "CM"};
        String[] X = {"","X", "XX", "XXX","XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] I = {"", "I","II", "III","IV","V","VI", "VII","VIII","IX"};
        return M[num/1000]+C[(num%1000)/100]+X[(num%100)/10]+I[num%10];
    }
}
