class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] proArr = new int[n];
        for(int i = 0; i <n; i++){
//after all iteration of inner loop for i product is set as 1 again when new outer loop starts        
            int product = 1;
            for(int j = 0; j < n; j++){
//as we want the num to not multiply itself
                if(i != j){
                    product *= nums[j]; 
                }
            } 
            proArr[i] = product;
        }
        return proArr;
    }
}  

