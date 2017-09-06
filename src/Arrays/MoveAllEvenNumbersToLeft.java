package Arrays;

import java.util.Arrays;

/**
 *
 * Move all the even numbers in a array to right.
 *
 * ex: [1,2,3,4,5,6,7,8]
 * o/p : [1,3,5,7,2,4,6,8]
 *
 *
 *
 *

 */
public class MoveAllEvenNumbersToLeft {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(moveAllEvenNumbersToLeft(a)));

    }

    public static int[] moveAllEvenNumbersToLeft(int[] a){
        if(a.length ==0 )
            throw new IllegalArgumentException("input array is null");

        int i=0;
        int j = a.length -1;
        while (i < j){
            while(a[i]%2 ==0){
                i++;
            }
            while (a[j]%2 !=0 ){
                j--;
            }

            if(i < j){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }
        return a;
    }
}
