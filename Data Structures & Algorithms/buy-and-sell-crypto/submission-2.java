class Solution {
    public int maxProfit(int[] prices) {
        int maxP=0;

    for (int l =0; l <prices.length; l++){
        int buy = prices[l];
        for(int r = l +1; r<prices.length; r++){
            int sell = prices[r];
            maxP = Math.max(maxP, sell - buy);

        }
    }
        return maxP;
    }
}
