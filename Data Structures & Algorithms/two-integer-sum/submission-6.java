class Solution {
    public int[] twoSum(int[] nums, int target) {
//creating an empty hashMap later, we will store el as keys & index as values
// as we have return the indices
        HashMap<Integer, Integer> prevMap = new HashMap<>();
//iterating the arr
        for(int i = 0; i < nums.length ; i++){
// storing the diff in a var 
            int diff = target - nums[i]; //10-4= 6; 10-5= 5; 10-6=4;
//checks if map has 6(diff);5;4
// NOTE: when diff & num is same we get our o/p
            if(prevMap.containsKey(diff)){ //4 
                return new int[] {prevMap.get(diff), i}; //{0, 2}
            }
// if not it puts the num in map
            prevMap.put(nums[i], i); //{4:0,5:0}
        }
//if any combination is not found return empty array
        return new int[] {};

    }
}
