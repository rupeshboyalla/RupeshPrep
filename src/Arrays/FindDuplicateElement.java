package Arrays;

import java.util.HashSet;
import java.util.Set;

/**
 *  input: {1,2,3,4,4}
 *  output : 4
 *
 *  input :{1,1,1,2,3,4}
 *  o/p: 1
 *
 *
 *
 */
public class FindDuplicateElement {

    public static void main(String[] args) {
        int[] a = {1,2,3,1,1,4};
        System.out.println(findDuplicatesElement(a));

    }

    public static int findDuplicatesElement(int[] a){
        if(a.length ==0 )
            throw new IllegalArgumentException("input array length is empty");
        Set<Integer> set = new HashSet<>();
        for(int i : a){
            if(set.contains(i)){
                return i;
            }else
                set.add(i);

        }
        return -1;
    }
}
