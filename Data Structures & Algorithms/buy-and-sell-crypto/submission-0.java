// BRUTE FORCE
class Solution {
    public int maxProfit(int[] prices) {
// creating a var maxP
        int maxP = 0;
// comparing one value with others to the right
        for(int i =0; i < prices.length; i++){
            for(int j = i+1; j < prices.length; j++){
//using max() of Math class to comparewhich price is max & update it
                maxP = Math.max(maxP, prices[j] - prices[i]);
            }
        }
        return maxP;
    }    
}

//requirement
// the price should be the least non-duplicate num
// the highest num second pointer/loop will give max profit