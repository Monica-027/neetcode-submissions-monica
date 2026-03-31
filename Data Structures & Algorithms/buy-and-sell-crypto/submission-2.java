class Solution {
    public int maxProfit(int[] prices) {
        int l=0; //buy day idx
        int r=1; //sell day idx
        int max=0;

    //loop runs till the last sell day
        while(r<prices.length){
    //we always need the buy price(least buy price of all daywise) to be less than sell price
            if(prices[l]<prices[r]){
    //update max price
                max = Math.max(max, prices[r]-prices[l]);
            }else{
    //if buy price is greater than price[r] means price[r] should be new buy 
    // price becoz buyinG at min & sell At max will give MAX profit
               l=r;
            }
            r++; //CONTINUE THE LOOP
        } 
        return max;
    }
}

