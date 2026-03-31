class Solution {
    public int removeDuplicates(int[] nums) {
        int k=1;// start uniqueEl pos as 1 becoz, the firstel will always be unique
        for(int i = 1; i<nums.length; i++){ //strt loop from 1 beoz of num[i-1] to avoid IOBexc
            if(nums[i]!=nums[i-1]){
                nums[k] = nums[i]; //store uniquEL in duplicateEl place
                k++; //update unique EL new pos
            }
        }
        return k;   
    }
}