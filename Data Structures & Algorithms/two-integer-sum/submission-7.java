class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<nums.length; i++){
        //store diff/complement(completes the sum)
            int diff = target - nums[i];

    //1st check if map contains diff) or not
            if(map.containsKey(diff))
            {
                return new int[] {map.get(diff), i};
            }
    //put the current element in map
            map.put(nums[i], i);
        }
        return new int[0];
    }
}