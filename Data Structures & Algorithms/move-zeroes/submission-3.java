class Solution {
    public void moveZeroes(int[] nums) {
        
        //pointer where next non-zero el's should be
        int l=0;
        for(int r=0; r<nums.length;r++){
            //swapping the non-zero values with zero values
            if(nums[r]!=0){ 
                //store 0 value  in temp container
                int temp = nums[l];  
                // store non-zero in 0's position
                nums[l] = nums[r]; 
                //push zero forward
                nums[r] = temp;  
                l++;
            }
        }
        
    }
}