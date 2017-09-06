package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, return indices of the two numbers such that
 * they add up to a specific target.

 You may assume that each input would have exactly one solution,
 and you may not use the same element twice.

 Example:
 Given nums = [2, 7, 11, 15], target = 9,

 Because nums[0] + nums[1] = 2 + 7 = 9,
 return [0, 1].

 *
 */
public class TwoSum {

    public static void main(String[] args) {
       // int[] givenArray = {2, 7, 11, 15};
        int[] givenArray = {3,0,3};
      int[] result = twoSum1( givenArray,   6);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] givenArray, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < givenArray.length; i++) {
            if (map.containsKey(target - givenArray[i])) {
                result[1] = i;
                result[0] = map.get(target - givenArray[i]);
                return result;
            }
            map.put(givenArray[i], i);
        }
        return result;
    }

    public static int[] twoSum1(int[] givenArray, int target){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] result = new int[2];
        for(int i = 0; i < givenArray.length; i++) {
            if(map.get(givenArray[i]) != null) {
                result[0] = map.get(givenArray[i]);
                result[1] = i;
                return result;
            }
            map.put(target-givenArray[i], i);
        }
        return result;
    }


}
