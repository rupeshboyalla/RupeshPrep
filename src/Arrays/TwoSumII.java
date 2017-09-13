package Arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by rupeshkb on 9/12/17.
 */
public class TwoSumII {
    public static void main(String[] args) {
        int[] a = {6,2,4,8,7,3,9};
        TwoSumII obj = new TwoSumII();
        obj.twoSum(a, 5);

    }

    public void twoSum(int[] a , int value){
        if(a.length ==0)
            return;
        Set<Integer> set = new HashSet<>();
        for (int i=0; i<=a.length-1; i++){
            if(set.contains(Math.abs(a[i]-value))) {
                System.out.println(String.format("%d , %d", a[i], value-a[i]));
                i++;
            }
            else
                set.add(Math.abs(a[i]-value));
        }

    }
}
