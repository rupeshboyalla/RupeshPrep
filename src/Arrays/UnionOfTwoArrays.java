package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * find the union of 2 arrays.
 *
 *
 */
public class UnionOfTwoArrays {

    public static void main(String[] args) {

    }

    public static List<Integer> union(int[] num1, int[] num2){
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<num2.length; i++){
            set.add(num2[i]);
        }

        for(int i=0; i< num1.length; i++){
            if(set.contains(num1[i]) && !list.contains(num1[i])){
                list.add(num1[i]);
            }
        }

        return list;

    }
}
