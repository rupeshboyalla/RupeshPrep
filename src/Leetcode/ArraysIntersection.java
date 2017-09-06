package Leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by rupeshkb on 8/11/17.
 */
public class ArraysIntersection {
    public static void main(String[] args) {
        ArraysIntersection ta = new ArraysIntersection();
        int[] num1 = {1};
        int[] num2 = {1,2};
        int[] result = ta.intersection(num1, num2);
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        Set<Integer> set = new HashSet<>();
        for(int num : nums1){
            if(search(nums2, num)){
                set.add(num);
            }
        }

        int[] result = new int[set.size()];
        int i=0;
        for(int ele : set){
            result[i++] = ele;
        }
        return result;
    }

    public boolean search(int[] nums, int num){
        if(nums.length ==0){
            return false;
        }
        int start =0, end = nums.length -1;
        while (start < end ){
            int mid = (start+end)/2;
            if(nums[mid] == num){
                return true;
            }else if(nums[mid] > num){
                end = mid-1;
            }else
                start = mid+1;

        }

        return false;
    }
}
