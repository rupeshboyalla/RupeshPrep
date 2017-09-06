package Arrays;

import java.util.Arrays;

/**
 *
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.

 You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 Output: 7 -> 0 -> 8
 */
public class AddTwoNumbers {

    /**
     * Created by rupeshkb on 6/7/17.
     */
    public static class FindAllPairs {

        public static void main(String[] args) {
            int[] givenArray = {2,3,4,5,6,7};
            int value =7;
            findPairs(givenArray, value);
        }

        public static void findPairs(int[]givenArray, int value) {
            Arrays.sort(givenArray);
            int start = 0;
            int end = givenArray.length - 1;
            while (start < end){
                if(givenArray[start] + givenArray[end] == value){
                    System.out.println(givenArray[start]+","+givenArray[end]);
                    end--;
                }else if(givenArray[start]+givenArray[end] > value)
                    end --;
                else
                    start ++;
            }
        }
    }
}
