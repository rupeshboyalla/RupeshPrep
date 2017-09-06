package Arrays;

import com.sun.org.apache.bcel.internal.generic.ILOAD;

/**
 * Created by rupeshkb on 7/17/17.
 */
public class SumOfMaxSubArray {
    public static void main(String[] args) {
        int[] a = {0,0,0,-4,};
        System.out.println(maxSubArray(a));

    }

    public static int maxSubArray(int[]a){
        if(a.length ==0 )
            throw new IllegalArgumentException("Input array is empty");
        int max_so_far =0, max =0;
        for(int i=0; i<=a.length -1; i++){
            max = max+a[i];
            if(max < 0)
                max =0;
            else if(max_so_far < max)
                max_so_far = max;
        }

        return max_so_far;
    }
}
