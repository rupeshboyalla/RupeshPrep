package Arrays;

import java.util.Arrays;

/**
 * rearrange an array with high and low value
 *
 *
 *
 */
public class RearrangeArrayWithLowAndHighValue {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7};
        rearrangeArray(a);
        System.out.println(Arrays.toString(a));

    }

    public static void rearrangeArray(int[] a){
        for(int i = 1 ; i <= a.length-1; i += 2){
            //if the prev element is greater than current element swap
            if(a[i-1] > a[i]){
                int temp = a[i];
                a[i] = a[i-1];
                a[i-1] = temp;
            }
            // if the next element is greater the current element swap it
            if(i+1 < a.length && a[i+1] > a[i]){
                int temp = a[i+1];
                a[i+1] = a[i];
                a[i] = temp;
            }
        }
    }
}
