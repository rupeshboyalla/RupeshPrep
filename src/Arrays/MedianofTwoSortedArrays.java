package Arrays;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 *
 * Median is middle value
 *
 * EX: 1,2,3,4,5 now middle is 3
 *
 * EX: 1,2,3,4 now middle is will be calculated as (2+3)/2 = 2.5
 *
 * My idea is keep all the elements in a treemap and is size is even the get middle and +1
 * value if it's a odd get the middle value.
 *
 *
 *
 *
 */
public class MedianofTwoSortedArrays {


    public static void main(String[] args) {
        int[] a= {1,2,3,4};
        int[] b= {1,2,3,4};
        System.out.println(findMedian(a,b));
    }

    public static int findMedian(int[] a, int[] b){

        TreeMap<Integer, Integer> map = new TreeMap<>();

        for(int i =0; i< a.length; i++){
           map.put(a[i],0);
        }
        for(int i=0; i<b.length; i++){
            map.put(b[i],0);
        }
        int mid = map.size()/2;
        //Map.Entry<Integer, Integer>;
        if(mid/2 !=0){
            return (map.get(mid)+map.get(mid+1))/2;
        }else
            return map.get(mid);
    }

}
