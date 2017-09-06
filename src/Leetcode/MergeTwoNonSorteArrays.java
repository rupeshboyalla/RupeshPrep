package Leetcode;

import java.util.Arrays;

/**
 * Created by rupeshkb on 8/7/17.
 */
public class MergeTwoNonSorteArrays {
    public static void main(String[] args) {
        MergeTwoNonSorteArrays ms = new MergeTwoNonSorteArrays();
        int[] num1 = {2,5,10}; int[] num2 = {1,2,3,4};
        System.out.println(Arrays.toString(ms.merge(num1, num2)));
    }

    public int[] merge(int[] nums1, int[] num2){
        int[] result= new int[nums1.length+num2.length];
        int i =0, j=0, k =0;
        while( i < nums1.length && j < num2.length){
            result[k++] = nums1[i] < num2[j] ? nums1[i++] : num2[j++];
        }
        while(i < nums1.length){
            result[k++] = nums1[i++];
        }
        while (j < num2.length){
            result[k++] = num2[i++];
        }
        return result;
    }
}
