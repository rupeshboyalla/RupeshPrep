package LinkedLists;

import java.util.Arrays;

/**
 *
 * to the given array arrange -ve to left and +ve to right
 *
 */
public class ArrangeAnArray {

    public static void main(String[] args) {
        int[] a = {1,-2,-3,4,5,-6};
        System.out.println(Arrays.toString(reArrange(a)));
    }

    public static int[] reArrange(int[] a){
        if(a.length ==0 )
            return null;
        int[] result = new int[a.length];
        int index =0;
        for(int i=0; i< a.length; i++)

            if(a[i] < 0){
                result[index] = a[i];
                index ++;
        }
        for(int i=0; i< a.length; i++){
                if(a[i] > 0) {
                    result[index] = a[i];
                    index++;
                }
        }
        return result;
    }
}
