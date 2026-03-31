class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        //to store the index of elements
        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            //if the map has the element already
            if(map.containsKey(nums[i]) && i - map.get(nums[i])<=k){
                return true;
            }
                map.put(nums[i], i);
        }
        return false;
    }
}

//intuition
//check equality of nums with indices diff <=k -:trye
// else-> false