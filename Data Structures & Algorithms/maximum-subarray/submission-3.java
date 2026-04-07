class Solution {
    public int maxSubArray(int[] nums) {
        int res = nums[0], currSum = 0; //intialise cSum outside else it'll reset for every iteration
        for(int num: nums){
            if(currSum<0){
                currSum = 0;
            }
                currSum += num;
                res = Math.max(res, currSum);
            
        }
        return res;
    }
}
