public class Solution {
    public int maxProfit(int[] prices) {
        int minP = Integer.MAX_VALUE;
        int maxP = 0;
        for (int price : prices) {
            minP = Math.min(minP, price);
            maxP = Math.max(maxP, price - minP);
        }
        return maxP;
    }
}