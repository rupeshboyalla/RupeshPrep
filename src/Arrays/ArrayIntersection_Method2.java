package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by rupeshkb on 8/11/17.
 */
public class ArrayIntersection_Method2 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> intersection = new ArrayList<>();


        for(int num : nums1){
            if(!set.contains(num)){
                set.add(num);
            }
        }

        for(int num : nums2){
            if(set.contains(num) && !intersection.contains(num)){
                intersection.add(num);
            }
        }

        int[] result = new int[intersection.size()];
        int count =0;
        for (int num : intersection){
                  result[count++] = num;
        }
        return result;
    }
}
