package Arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * convert roman number to integer
 *  ex: input : x output: 10
 *  ex: intput : MDCL output: 1650 .
 *
 *
 */
public class RomanToInt {

    public static void main(String[] args) {
        System.out.println(convertRomanToInt("MDCL"));
        System.out.println(convertRomanToIntUsingMap("MDCL"));
    }

    public static int convertRomanToInt(String s){

        if(s.length() ==0 ){
            return -1;
        }

        int[] nums = new int[s.length()];

        for(int i=0; i< s.length(); i++){
            switch(s.charAt(i)){
                case 'M':
                    nums[i]= 1000;
                    break;
                case 'D':
                    nums[i] =500;
                    break;
                case 'C':
                    nums[i] = 100;
                    break;
                case 'L':
                    nums[i] = 50;
                    break;
                case 'x':
                    nums[i] =10;
                    break;
                case 'v':
                    nums[i] =5;
                    break;
                case 'I':
                    nums[i] = 1;
                    break;
            }
        }
        int sum =0;

        for(int i=0; i< nums.length-1; i++){
            if(nums[i] < nums[i+1]){
                sum -=nums[i];
            }else
                sum += nums[i];
        }
        sum += nums[nums.length-1];
        return sum;

    }


    public static int convertRomanToIntUsingMap(String s){
        Map<Character, Integer> map = new HashMap<>();
        map.put('M', 1000);
        map.put('D', 500);
        map.put('C',100);
        map.put('L', 50);
        map.put('X', 10);
        map.put('V', 5);
        map.put('I',1);
        int sum =0;
        for(int i=0; i< s.length()-1; i++){
            if(map.get(s.charAt(i)) < map.get(s.charAt(i+1))){
                sum -= map.get(s.charAt(i));
            }else
                sum +=map.get(s.charAt(i));
        }
        System.out.println("String length ===>"+s.length());
        sum += map.get(s.charAt(s.length()-1));
        return sum;
    }


}
