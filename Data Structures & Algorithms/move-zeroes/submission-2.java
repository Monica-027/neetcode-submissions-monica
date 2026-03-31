//Two pointers one pass -> optimal solution
class Solution {
    public void moveZeroes(int[] nums) {
//pointer for where next non-zero element should be placed
        int j = 0;
//pointer for all elements
        for(int i=0; i<nums.length; i++){
            if(nums[i] !=0){
                int temp = nums[i]; //e.g storing value of nums[1] i.e., 1
//here, the zero el's is pushed to non-zero el's position
                nums[i] = nums[j]; //nums[1] = 0; 0->1
                nums[j] = temp; //nums[0] = 1;   [1, 0]

                j++; //increasing j by 1 only when we find a non-zero
            }
        }
        
    }
}