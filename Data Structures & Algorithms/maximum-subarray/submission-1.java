class Solution {
    public int maxSubArray(int[] nums) {
       int maxSum = nums[0];
       int curSum = 0;
       for(int num: nums){
        //if curSum/running sum is -ve reset to 0 to start over from curr el
            if(curSum < 0){
                curSum =0;
            }
            curSum += num;
            maxSum = Math.max(maxSum, curSum);
       }
       return maxSum;
    }
}
