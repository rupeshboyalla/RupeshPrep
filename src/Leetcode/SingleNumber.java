package Leetcode;

import java.util.Arrays;

/**
 * Given an array of integers, every element appears twice except for one.
 * Find that single one.

 Note:
 Your algorithm should have a linear runtime complexity.
 Could you implement it without using extra memory?
 */
public class SingleNumber {
    public static void main(String[] args) {
        SingleNumber sn = new SingleNumber();
        int[] nums = {2,2,3,3,1,4,4,5,5};
        System.out.println(sn.singleNumber(nums));
    }


    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int i = 0, j=1, result = nums[i];
        while ( j <= nums.length ){
            if(nums[i] == nums[j]){
                i = i+2;
                j = j+ 2 ;
            }else {
                result = nums[i];
                i++;
                j++;
            }
        }
        return result;
    }

}
