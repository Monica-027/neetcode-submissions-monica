class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Map<Integer, Integer> count = new HashMap<>();

        //add the els with freq in map
        for(int num: nums){
            count.put(num, count.getOrDefault(num, 0)+1);
        }

        List<List<Integer>> res = new ArrayList<>();
        //fix 1st triplet
        for(int i=0; i<nums.length; i++){
            //reduce count so no dup are reused again
            count.put(nums[i], count.get(nums[i])-1);

            if(i>0 && nums[i]==nums[i-1]) continue;
            //fix 2nd triplet
            for(int j=i+1; j<nums.length; j++){
                count.put(nums[j], count.get(nums[j])-1);
                if(j > i+1 && nums[j]==nums[j-1]) continue;
                
                //find if sum of 1st & 2nd triplet is present int the arr
                int target = -(nums[i]+nums[j]);
                if(count.getOrDefault(target, 0) > 0){
                    //if present we found the list of triplets
                    res.add(Arrays.asList(nums[i], nums[j], target));
                }
            }
            //restoring jth elements for other iterations
            for(int j =i+1; j<nums.length;j++){
                count.put(nums[j], count.get(nums[j])+1);
            }
        }
        return res;
    }
}
