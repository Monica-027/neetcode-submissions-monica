// Two pointer
class Solution {
    public int maxProfit(int[] prices) {
//starting from left
        int l = 0;
        int r = 1;
        int maxP =0;
        while(r < prices.length){
 //prices[l] < prices[r] for max profit
            if(prices[l] < prices[r]){
              int profit = prices[r] - prices[l];
              maxP = Math.max(maxP, profit); //comparing if maxP is greater than previos
            }else{
 // if l > r no need for comparison directly r will be new low price index
                l = r;
            }
            //r will increase to check for prices on next days
            r++;
        }
        return maxP;
    }    
}

//requirement
// the price should be the least non-duplicate num
// the highest num second pointer/loop will give max profit