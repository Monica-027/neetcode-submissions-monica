class Solution {
    public int maxProduct(int[] nums) {
        int res = nums[0];
        int currMax= 1, currMin = 1;

        for(int n : nums){
            //store old currMax in temp for using in currMin
            int temp = currMax * n;
            //compare n , cMax* n, cMin * n
            currMax = Math.max(Math.max(currMax*n, currMin*n), n);
            //compare temp , n, cMin * n
            currMin = Math.min(Math.min(temp, currMin*n), n);
            res = Math.max(res, currMax);
        }
        return res;
    } 
}
