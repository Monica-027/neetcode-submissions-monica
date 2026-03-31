//OPTIMAL APPROACH-> HASHSET(takes space)
class Solution {
    public boolean hasDuplicate(int[] nums) {
        //empty set
        HashSet<Integer> seenNum = new HashSet<>();

        //loop through each els in array
        for(int num : nums){
            if(seenNum.contains(num)){ //check if num is present in set or not
                return true; //if num/dup present
            }
            seenNum.add(num); //if num not present add in set
        }
        return false;
    }
}