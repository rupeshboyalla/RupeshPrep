package Arrays;

import com.sun.org.apache.regexp.internal.RE;

import java.util.*;

/**
 * Created by rupeshkb on 8/21/17.
 */
public class Example {

    public static void main(String[] args) {
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            int[] stream = {3,4,1,2,6,9,8,5};
            for(int ele : stream){
                pq.add(ele);
            }
            while(!pq.isEmpty()){
                System.out.println(pq.poll());
            }
    }

}
