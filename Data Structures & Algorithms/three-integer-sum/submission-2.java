class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); //sort

        //create a res list which stores possible triplet list
        List<List<Integer>> res = new ArrayList<>();

        //fix 1st num
        for(int i=0; i<nums.length; i++){
            //if 1st el is >0 then definitily triplets having sum 0 won't be possible
            if(nums[i]>0) break;
//i>0 makes sure we have somthing to compare with next el's if we dont use it 
// the nums[0]==num[0-1] & -1 will give idxoutofbounderror
// Skip duplicates at i → prevents repeated starts
            if(i>0 && nums[i]==nums[i-1]) continue; //skips that iteration & jumps to next

            //other el should not be same as 1st so,
            int l=i+1;
            int r = nums.length-1;

            while(l<r){
                int sum = nums[i]+ nums[l]+ nums[r];
                if(sum>0){
                    r--;
                }else if(sum < 0){
                    l++;
                }else{
                    res.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    l++;
                    r--;
                    // skip if l same as prev l
// NOTE:Skipping dup's for l prevents generating the same triplet multiple times for 
// the same fixed i, which cannot be avoided by skipping duplicates at i alone.
// Skip duplicates at l → prevents repeated pairs
                    while(l<r && nums[l]== nums[l-1]){
                        l++;
                    }
                }
            }

        }
        return res;
        
    }
}
