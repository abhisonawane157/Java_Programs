
// 121. Best Time to Buy and Sell Stock : https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class LeetCode_Best_Time_to_Buy_and_Sell_Stock {
    static int maxProfit(int[] prices) {
        // if(prices==null||prices.length<=1)
        // return 0;
        // int prof = 0;
        // for (int i = 0; i < prices.length; i++) {
        // for (int j = i + 1; j < prices.length; j++) {
        // if (prof < (prices[j] - prices[i])) {
        // prof = prices[j] - prices[i];
        // }
        // }
        // }
        // return prof;
        if (prices == null || prices.length <= 1)
            return 0;

        int min = prices[0];
        int result = 0;
        for (int i = 1; i < prices.length; i++) {
            result = Math.max(result, prices[i] - min);
            min = Math.min(min, prices[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        // int[] nums = { 7, 1, 5, 3, 6, 4 };
        int[] nums = { 7, 6, 4, 3, 1 };
        int ans = maxProfit(nums);
        System.out.println(ans);
    }
}

// Output
// Input: prices = [7,1,5,3,6,4]
// Output: 5
// Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit =
// 6-1 = 5.
// Note that buying on day 2 and selling on day 1 is not allowed because you
// must buy before you sell.

// Input: prices = [7,6,4,3,1]
// Output: 0
// Explanation: In this case, no transactions are done and the max profit = 0.