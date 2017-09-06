package Leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * Given two arrays, write a function to compute their intersection.

 Example:
 Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].

 Note:
 Each element in the result should appear as many times as it shows in both arrays.
 The result can be in any order.
 Follow up:
 What if the given array is already sorted? How would you optimize your algorithm?
 What if nums1's size is small compared to nums2's size? Which algorithm is better?
 What if elements of nums2 are stored on disk, and the memory is limited such that
 you cannot load all elements into the memory at once?
 *
 *
 *
 *
 */
public class ArraysIntersectionII {

    public static void main(String[] args) {

    }

    public int[] intersect(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();


        for(int num : nums1){
            if(!set.contains(num))
            set.add(num);
        }



        for(int num: nums2){
            if(set.contains(num)){
               list.add(num);
            }
        }
        int[] result = new int[list.size()];
        int count =0;
        for(int num : list){
            result[count++] =num;
        }
        return result;
    }
}
