class Solution {
    public int maxProduct(int[] nums) {
        int maxProd = nums[0];
        int curMin = 1, curMax = 1;
        for(int num: nums){
            //STORE CURMAX IN TEMP SO WE CAN USE THIS IN CURMIN & 
            // NOT NEW CURMAX(WHICH CAN CHANGE THE O/P)
            int temp = curMax * num;
            curMax = Math.max(num, Math.max(curMin  * num,curMax * num));
            curMin = Math.min(num, Math.min(curMin * num, temp));
            maxProd = Math.max(maxProd, curMax);
        }
        return maxProd;
    }
}
