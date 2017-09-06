package Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Created by rupeshkb on 6/18/17.
 */
public class SubArrayZeroSum {

    public static void main(String[] args) {
        int[] A = {4,-6,3,-1,4,2,7};
        System.out.println(findSubArraySumZero(A));

    }

    public static boolean findSubArraySumZero(int[] A){
        HashSet<Integer> set = new HashSet<>();
        int sum =0;
        set.add(0);
        for (int i=0; i< A.length; i++){
            sum +=A[i];
            if (set.contains(sum))
                return true;
        }
        return false;
    }
}
