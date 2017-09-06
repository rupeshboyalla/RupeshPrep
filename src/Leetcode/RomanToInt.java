package Leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by rupeshkb on 8/3/17.
 */
public class RomanToInt {
    public static void main(String[] args) {
        RomanToInt ri = new RomanToInt();
        System.out.println(ri.romanToInt("iv"));
        System.out.println(ri.romanToIntUsingSwitch("iv"));
    }

    /**
     * This solution is also working fine but the run time is 63%
     * @param s
     * @return
     */

    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('M', 1000);
        map.put('D', 500);
        map.put('C',100);
        map.put('L', 50);
        map.put('X', 10);
        map.put('V', 5);
        map.put('I', 1);
        s= s.toUpperCase();
        char[] s_array = s.toCharArray();
        int result =0, i=0;
        for(; i < s_array.length-1; i++){
            if(map.get(s_array[i]) < map.get(s_array[i+1])){
                result = result - (map.get(s_array[i]));
            }else
                result += map.get(s_array[i]);
        }

        return  result+map.get(s_array[i]);
    }

    /**
     * Switch is faster so i'm using the switch implementation
     *
     */
     public int romanToIntUsingSwitch(String s){
         int result =0;
         char[] s_array = s.toCharArray();
         int[] num = new int[s.length()];
         for(int i=0; i<= s.length()-1; i++){
             switch (s_array[i]) {
                 case 'M':
                     num[i] = 1000;
                     break;
                 case 'D':
                     num[i] = 500;
                     break;
                 case 'C':
                     num[i] = 100;
                     break;
                 case 'L':
                     num[i] = 50;
                     break;
                 case 'X':
                     num[i] = 10;
                     break;
                 case 'V':
                     num[i] = 5;
                     break;
                 case 'I':
                     num[i] = 1;
                     break;

             }
         }
         for(int i=0; i< num.length -1; i++){
            if(num[i] < num[i+1]){
                result = result - num[i];
            }else
                result = result+num[i];
         }

         return result+num[num.length-1];
     }

}
