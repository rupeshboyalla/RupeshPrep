package Leetcode;

/**
 *
 * You are climbing a stair case. It takes n steps to reach to the top.
 Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to
 the top?
 Note: Given n will be a positive integer.
 *
 *  Solution: - This is a fibonacci series problem but here instead of printing the whole series
 *  i have to print only the final result.
 *
 *
 */
public class ClimbingSteps {
    public static void main(String[] args) {
        ClimbingSteps cs = new ClimbingSteps();
        System.out.println(cs.climbStairs(3));
    }

    public int climbStairs(int n) {
        int num1 =0, num2=1, result =0;
        for(int i=0; i< n; i++){
            result = num1+num2;
            num1 = num2;
            num2 = result;
        }
        return result;

    }
}
