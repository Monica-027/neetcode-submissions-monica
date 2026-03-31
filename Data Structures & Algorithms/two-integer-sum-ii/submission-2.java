//TWO POINTER APPROACH
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0; //starts from 0
        int r = numbers.length - 1; //ends till last index
        while(l < r){      
            int sum = numbers[l] + numbers[r];
            //if sum > target (e.g. 11>9)then we know tht the element is smaller and since, 
            // array is sorted we will move towards the right to find the exact number
            if(sum > target){
                r--;
            } //similarly, if sum < target(e.g. 7<9) we have to keep going forward
            else if(sum < target){
                l++;
            }else{
                //when we find exact numbers whose sum is same as target we increase the index by 1
                // as it is (1-index) based solution
                return new int[] {l+1, r+1};
            }
        }
        //if there is no match return the emptty array of size 0
        return new int[0];
    }
}
