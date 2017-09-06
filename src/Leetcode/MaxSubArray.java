package Leetcode;

import java.util.Map;

/**
 *Find the contiguous subarray within an array (containing at least one number)
 * which has the largest sum.

 For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
 the contiguous subarray [4,-1,2,1] has the largest sum = 6.
 *
 *
 */
public class MaxSubArray {
    public static void main(String[] args) {
        MaxSubArray msb = new MaxSubArray();
        int[] nums = {-1};
                //{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(msb.maxSubArray(nums));

    }

    public int maxSubArray(int[] nums) {
        if(nums.length ==0)
            return -1;
        if(nums.length ==1 )
            return nums[0];
        int max_sum_so_far=nums[0], sum=0;
        for(int i =0; i< nums.length ; i++) {
            sum = Math.max(sum + nums[i], nums[i]);
            max_sum_so_far = Math.max(max_sum_so_far, sum);
        }
        return max_sum_so_far;
    }
}
