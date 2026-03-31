class Solution {
    public void moveZeroes(int[] nums) {
        int idx=0;
        for(int i=0; i<nums.length;i++){
            if(nums[i]!=0){
                //use idx then inc
                //push non-zero to start
                nums[idx++] = nums[i];
            }
        }
        while(idx<nums.length){
            //use last idx from above then inc that
            //fill the remaining el's with zero
            nums[idx++] =0;
        }

    }
}