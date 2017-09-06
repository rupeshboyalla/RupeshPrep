package LeetCode_Medium;

/**
 *  given an array find the min distance of two elements;
 *
 *  ex: [1,2,3,1,4,5] distance between 1,4
 *  o/p : 1
 */
public class MinimumDistanceOfTwoElements {

    public static void main(String[] args) {

        int[] nums = {3, 5, 4, 2, 5, 6, 6, 5, 4, 8, 3};
        MinimumDistanceOfTwoElements mn = new MinimumDistanceOfTwoElements();
        System.out.println(mn.mibDistance(nums, 3,6));

    }
    public int mibDistance(int[] nums, int x, int y){
        if(nums.length ==0)
            return -1;
        int a=-1, b=-1;
        for(int i=0; i < nums.length; i++){
            if(nums[i] == x){
                a=i;
            }
            if(nums[i] == y){
                b=i;
            }
        }
        if( a!= -1 || b!=-1){
            return Math.abs(a-b);
        }
        return -1;
    }
}
