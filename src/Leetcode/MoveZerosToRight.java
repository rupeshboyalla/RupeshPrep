package Leetcode;

import java.util.Arrays;

/**
 *  Move Zeros to left
 *
 *  [0,1,0,2,13]
 *
 *  O/P = [0,0,1,2,13]
 *
 *
 *
 *
 *
 *
 */
public class MoveZerosToRight {

    public static void main(String[] args) {
        MoveZerosToRight mzr = new MoveZerosToRight();
        int[] nums = {0,1,0,2,13};
        mzr.moveZeros(nums);
    }

    public void moveZeros(int[] nums){
        int count = nums.length-1;
        for(int i = nums.length-1; i > 0; i--){
            if(nums[i] != 0)
                nums[count--] = nums[i];
        }

        while (count >= 0){
            nums[count--] =0;
        }

        System.out.println(Arrays.toString(nums));
    }
}
