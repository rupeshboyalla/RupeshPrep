package Strings;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by rupeshkb on 6/22/17.
 */
public class Example {
    public static void main(String[] args) {

        String s = "abc";
        for(int i=0; i<= s.length()-1; i++){
//            System.out.println(s.substring(0, i));
//            System.out.println(s.substring(i+1, s.length()));
            System.out.println(s.substring(0,i)+s.substring(i+1, s.length()));
        }

    }
}
