class Solution {
    public int maxProfit(int[] prices) {
        //temp take minprice but store the max Integer(infnity) in it so,when we update we store lesser val than that
        int minPrice = Integer.MAX_VALUE;
        int max = 0;
        for(int price : prices){
            if(price < minPrice){
                //update the min val
                minPrice = price;
            }else{
                //here, price is today's price
                max = Math.max(max, price - minPrice);
            }
        }
        return max;
    }
}
