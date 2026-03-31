class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    //taking a set to avoid storing duplicate List<Integer> again in the main list
       Set<List<Integer>> result = new HashSet<>();
       Arrays.sort(nums); //sorting the array here so that we dont have to sort 
    // every triplet below again & again
        for(int i = 0; i < nums.length ; i++){
            for(int j= i+1; j <nums.length; j++){
                for(int k = j + 1; k < nums.length; k++){
                    if(nums[i] + nums[j]+ nums[k]== 0){
                        //adding the list of triplet im temp container
                       List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
            // adding the list of triplet to the empty set one by one
            //here if a duplicate list will try to add up set, won't accept it
                       result.add(temp);
                    }
                }
            }
        }
        //returning the list of list of triplets
        return new ArrayList<>(result);
    }
}
