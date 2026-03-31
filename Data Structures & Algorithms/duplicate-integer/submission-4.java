class Solution {
    public boolean hasDuplicate(int[] nums) {
        //sort so duplicate becomes adjacent to each other
        Arrays.sort(nums); 
        //start comparison from i & compare it with previous element(i-1)
        // when i = 1 compare i-1 = 1-1 =0
        // when i = 2 compare i-1 =2-1= 1 and so on...
        for(int i = 1; i< nums.length; i++){
            if(nums[i]==nums[i-1]){
                return true;
            }
        }
        return false;
        
    }
}