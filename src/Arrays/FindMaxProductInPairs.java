package Arrays;

import java.util.Arrays;

/**
 * find the max product of array pairs
 * Can be done by sorting array and max product is the end element and end element-1
 *
 *
 */
public class FindMaxProductInPairs {

    public static void main(String[] args) {
        int[] a = {-10, -3, 5,6,2};
        findMaxProduct(a);
    }

    public static void findMaxProduct(int[] a ){

        if(a.length == 0 )
            throw new IllegalArgumentException("input array is empty");
        Arrays.sort(a);

        System.out.println("Max product of any array is "+a[a.length-1] +","+a[a.length-2]);


    }
    }
