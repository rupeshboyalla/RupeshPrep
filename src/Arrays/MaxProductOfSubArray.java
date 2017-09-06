package Arrays;

/**
 * Created by rupeshkb on 7/17/17.
 */
public class MaxProductOfSubArray {
    public static void main(String[] args) {

        int[] a = {2,3,0,4,6};

        System.out.println(maxProduct(a));

    }

    public static long maxProduct(int[] a){
        if(a.length ==0)
            throw new IllegalArgumentException("Input array is zero ");
        int maxproduct_so_far =1, maxproduct =1;
        for(int i=0; i<= a.length -1; i++){
            maxproduct *=a[i];
            if(maxproduct ==0 )
                maxproduct = 1;
            if(maxproduct_so_far < maxproduct)
                maxproduct_so_far = maxproduct;
        }
        return maxproduct_so_far;
    }

}
