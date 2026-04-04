class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price: prices){
            //if currPrice < minPrice update minPrice
            if(price < minPrice){
                minPrice = price;
                //if greater update profit
            }else{
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }
        return maxProfit;
    }
}
