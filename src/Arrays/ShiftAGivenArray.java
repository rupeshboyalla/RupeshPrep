package Arrays;

import java.util.Arrays;
import java.util.Random;

/**
 * Shift a give array of elements (fisher-yates shuffle)
 *
 *
 */
public class ShiftAGivenArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        shuffle(a);
        System.out.println(Arrays.toString(a));
    }

    public static void shuffle(int[] a ){
        int length = a.length -1;
        for(int i = length; i>= 1; i--){
            Random random = new Random();
            int j = random.nextInt(i+1);
            System.out.println("Random number is "+j);
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }

}
