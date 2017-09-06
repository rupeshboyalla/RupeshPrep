package Leetcode;

/**
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n,
 * find the one that is missing from the array.

 For example,
 Given nums = [0, 1, 3] return 2.

 Note:
 Your algorithm should run in linear runtime complexity.
 Could you implement it using only constant extra space complexity?
 */
public class MissingNumber {

    public static void main(String[] args) {
        MissingNumber mn = new MissingNumber();
        int[] nums = {0};
        System.out.println(mn.missingNumber(nums));
    }

    public int missingNumber(int[] nums) {
        int start =0, end = nums.length-1;
        if(nums.length ==1)
            return nums[0]+1;
        if(end == 1){
            return nums[0] - nums[1] >1 ? nums[1]-1 : -1;
        }
        while(start < end){
            int mid = (start+end)/2;
            if(nums[mid] - nums[mid -1] >1){
                return nums[mid] -1;
            }else if(nums[mid] < mid+1 ){
                start = mid +1;
            }else
               end = mid -1;
        }
        return -1;
    }
}
