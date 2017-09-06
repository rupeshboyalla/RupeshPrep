package Arrays;

import java.util.Arrays;

/**
 * sort an array contains 0, 1 and 2
 * input : {0,1,2,0,1,2,2,1,0,0,1,2}
 * outpt: {0,0,0,0,1,1,1,1,2,2,2,2}
 *
 * Two ways we can solve this problem:
 *
 * 1. Count number of 0's , 1's and 2's and then print
 *
 *2. Rearrange the array value less than pivot and value equal to pivot and value greater
 * than pivot
 *
 *
 *
 */
public class SortArrayContainsO12 {

    public static void main(String[] args) {
        int[] a = {0,1,2,0,1,2,0,1,2,0,1,2};
        System.out.println(Arrays.toString(rearrange(a)));

    }

    public static int[] rearrange(int[] a){
        int start =0, i =0,  end = a.length -1;
        while (i <= end ) {
            if (a[i] == 0) {
                swap(a, start, i);
                start++;
                i++;
            } else if (a[i] == 2) {
                swap(a, i, end);
                end--;
            } else
                i++;
        }
        return a;
    }

    public static void swap(int[] a, int i, int j){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
    }

}
