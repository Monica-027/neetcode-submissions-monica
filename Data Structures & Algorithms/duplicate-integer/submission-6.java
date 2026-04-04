class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> seenNums = new HashSet<>();
        for(int n: nums){
            if(seenNums.contains(n)){
                return true;
            }
            seenNums.add(n);
        }
        return false;
    }
}