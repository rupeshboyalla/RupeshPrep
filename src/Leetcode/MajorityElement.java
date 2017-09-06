package Leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Given an array of size n, find the majority element. The majority element
 * is the element that appears more than ⌊ n/2 ⌋ times.

 You may assume that the array is non-empty and the majority element always
 exist in the array.

 Credits:
 Special thanks to @ts for adding this problem and creating all test cases.


 *
 *
 */
public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {3,3,4};
        MajorityElement me = new MajorityElement();
        System.out.println(me.majorityElement(nums));
    }
    public int majorityElement(int[] nums) {
        int max =0, result = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            if (map.containsKey(i)){
                int value =  map.get(i)+1;
                map.put(i, value);
            }else
                map.put(i,1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(max < entry.getValue()){
                max = entry.getValue();
                result = entry.getKey();
            }
        }
        return result;

    }
}
