package Leetcode;

/**
 * Created by rupeshkb on 8/7/17.
 */
public class BestTimetoBuyAndSellStock {

    public static void main(String[] args) {
        BestTimetoBuyAndSellStock bst = new BestTimetoBuyAndSellStock();
        int[] testData1 = {7, 1, 5, 3, 6, 4};
        int[] testData2 = {7, 6, 4, 3, 1};
        System.out.println(bst.maxProfit(testData1));
        System.out.println(bst.maxProfit(testData2));

    }

    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0 ;
        }
        int max = 0 ;
        int sofarMin = prices[0] ;
        for (int i = 0 ; i < prices.length ; ++i) {
            if (prices[i] > sofarMin) {
                max = Math.max(max, prices[i] - sofarMin) ;
            } else{
                sofarMin = prices[i];
            }
        }
        return  max ;
    }
}
