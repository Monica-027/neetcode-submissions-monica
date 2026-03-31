//can do but not optimal
class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        int l=0;
        for(int r = 1; r< nums.length; r++){
            if(nums[r]==nums[l]){
                return true;
            }
            l++;
        }
        return false;
    }
}