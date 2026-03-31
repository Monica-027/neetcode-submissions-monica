class Solution {
    public int maxSubArray(int[] nums) {
//non-empty subarray means we take atleast 1 el subarr as maxSum we can't say 0(means none)
//if non-empty wasn't the case then we will take curSum as 0
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i< nums.length; i++){
            int curSum = 0; //resetting after every new start pos(i)
            //since, curSum is 0 at start we have to calculate from i so, j=i
            for(int j = i; j< nums.length; j++){
                curSum += nums[j];
                //comparing the curSum & maxSUm to get new maxSum
                maxSum = Math.max(curSum, maxSum);
            }
        }
        return maxSum;
    }
}
