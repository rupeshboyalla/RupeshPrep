package LeetCode_Medium;

/**
 * Created by rupeshkb on 8/16/17.
 */
public class SearchingInCircularSortedArray {




    public static int search(int[] nums, int value){
        if(nums.length ==0)
            return -1;

        int low=0, high = nums.length-1;

        while(low <= high ){

            int mid = (low+high)/2;

            if(nums[mid] == value) {
                return mid;
            } else
                if(nums[mid] <= nums[high]){
                  if(value > nums[mid] && value > nums[high])
                      low = mid+1;
                  else
                      high = mid-1;
                }else {
                    if (nums[low] <= value && value < nums[mid - 1]) {
                        high = mid-1;
                    }else
                        low = mid+1;
                }
        }

        return -1;
    }
}
