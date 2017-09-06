package Strings;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Given String is a1b2c3d4e5f6j7
 * O/P: abcdefj1234567
 *
 *
 *
 *
 */
public class ArrangingCharInAString {

    public static void main(String[] args) {

        System.out.println(reArrangingUsingQueue("a1b2c3d4e5f6j7"));
    }
    public static String reArrangingUsingQueue(String s){
        if(s.length() ==0)
            throw new IllegalArgumentException("Input string is empty");
        Queue<Character> charQueue = new PriorityQueue<>();
        Queue<Character> intQueue = new PriorityQueue<>();
        int length = s.length() -1;
        char[] s_array = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i< length ; i++){

            if(i%2 != 0){
                intQueue.add(s.charAt(i));
            }else
                charQueue.add(s.charAt(i));
        }
        int j =0;

        while (!charQueue.isEmpty()){
           s_array[j] = charQueue.remove();
           j++;
        }
        while(!intQueue.isEmpty()){
            s_array[j] = intQueue.remove();
            j++;
        }


        return String.valueOf(s_array);

    }



}
