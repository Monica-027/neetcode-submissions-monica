class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*n]; //double size of nums
        for(int i=0; i<n; i++){
            //i+n means index + length of 1st array 
            ans[i] = ans[i+n] = nums[i];
        }
        return ans;
    }
}