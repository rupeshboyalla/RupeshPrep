package Leetcode;

import java.util.Arrays;

/**
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

 For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

 Note:
 You must do this in-place without making a copy of the array.
 Minimize the total number of operations.

 *
 *
 */
public class MoveZeros {

    public static void main(String[] args) {
        MoveZeros mz = new MoveZeros();
        int[] nums = {0,1,0,3,12};
        Arrays.toString(mz.moveZeros(nums));
    }

    public int[] moveZeros(int[] nums){
        int counter =0;
        for(int num :  nums){
            if(num !=0)
                nums[counter++] = num;
        }
        while (counter < nums.length){
            nums[counter++] =0;
        }
        return nums;
    }
}
