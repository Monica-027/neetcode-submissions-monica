//BRUTE FORCE
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //to store unique list
        Set<List<Integer>> res = new HashSet<>();
/*sorting so that set easily removes duplicates if not 
the same values will be stored in different order & hashSet will consider 
them different & store those values again in different order int the o/p
& it is mentioned You may return the output & the triplets in any order. */
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                for(int k=j+1; k<nums.length; k++){
                    if(nums[i] + nums[j] + nums[k] == 0){
                        // creating a list & adding triplet values to the list
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                        res.add(temp); //adding all triplets list in the set
                    }
                }
            }
        }
        return new ArrayList<>(res);
    }
}
