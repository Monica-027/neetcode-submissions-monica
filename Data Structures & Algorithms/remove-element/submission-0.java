//two pointer
class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; //count and index for updated array
        for(int i =0; i < nums.length; i++){ 
            if(nums[i] != val){
                nums[k] = nums[i]; //Swapping the same el as val to other el
                k++; //updating index and count
            }
        }
        return k;
    }
}