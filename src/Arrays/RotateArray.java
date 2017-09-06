package Arrays;

import java.util.Arrays;

/**
 *
 * Rotate an array of n elements to the right by k steps.
 * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7]
 * is rotated to [5,6,7,1,2,3,4].
 * How many different ways do you know to solve this problem?
 *
 *
 *
 */
public class RotateArray {

    public static void main(String[] args) {
        int[] a = {0,1,2,3,4,5,6,7};
        //System.out.println(Arrays.toString(rotateArray(a, 3)));
        rotateArrayUsingSplit(a,1);
        System.out.println(Arrays.toString(a));
    }


/**
 * Bubble rotate
 *
 * Time complexity is O(n*k) where n is the number of elements and k is
 * how many time need to rotate
 *
 */

 public static int[] rotateArray(int[] a, int order){
     if(a.length ==0 )
         throw new IllegalArgumentException("Input array length is zero");
     for(int i=0; i< order; i++){
         for(int j = a.length-1; j>0 ; j--){
             int temp = a[j];
             a[j] = a[j-1];
             a[j-1] = temp;
         }
     }
     return a;
     }

     public static void rotateArrayUsingSplit(int[] a, int order){
            if (a.length ==0 || order < 0)
                throw new IllegalArgumentException("Empty input array or order is less than " +
                        "zero");
            if(order > a.length)
                order = order % a.length;

            int b = a.length - order;

            reverse(a, 0, b-1);
            reverse(a, b, a.length-1);
            reverse(a, 0, a.length-1);

     }

     public static void reverse(int[] a, int left, int right ){
         while (left < right){
             int temp = a[left];
             a[left] = a[right];
             a[right] = temp;
             left ++;
             right --;
         }
     }
}





