package Leetcode;

import java.util.*;

/**
 * Created by rupeshkb on 8/2/17.
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        TwoSum s = new TwoSum();
        System.out.println(Arrays.toString(s.twoSum(nums, 9)));

    }

    /*
     This works for unsorted array which you need it for index. If you need to find the
     pairs for a given array then you have to use the another method please refer the below
     method.
     */

    public int[] twoSum(int[] nums, int target){
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i< nums.length; i++){
            if(map.containsKey(nums[i])){
                result[0] = map.get(nums[i]);
                result[1] = i;
            }else
                map.put(target-nums[i], i);
        }
        return result;
    }

    /*
        find the pair for an array
        ex: int[] a = {1,2,3,4,5,6,7,8,9} and target is 8

        o/p is  [1,7 ] [2,6] [3,5]

     */

    public Map<Integer, Integer> findPairs(int[] a, int value){
        Map<Integer, Integer> map = new HashMap<>();
        if (a.length ==0)
            throw new IllegalArgumentException("Input array is empty");
        int i=0, j = a.length-1;
        while (i < j){
            if(a[i]+a[j] == value){
                map.put(a[i], a[j]);
                i++;
                j--;
            }else if(a[i]+a[j] > value)
                j--;
            else
                i++;
        }
        return map;
    }
}
