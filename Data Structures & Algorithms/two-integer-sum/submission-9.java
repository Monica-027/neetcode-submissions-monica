class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int idx =0;  idx<nums.length; idx++){
            int diff = target - nums[idx];
            if(map.containsKey(diff)){
                return new int[]{map.get(diff), idx};
            }else{
                map.put(nums[idx],idx);
            }
        }
        return new int[0];
    }
}
