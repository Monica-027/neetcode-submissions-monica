class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> set = new HashSet<>();

        //ADDING NUMS TO SET
        for(int num: nums){
            set.add(num);
        }

        //temp result
        int resLength = 0;

        for(int num : nums){
            //count Seq fro each seq
            int countSeq = 0, curr= num;
            while(set.contains(curr)){
                countSeq++;
                //inc curr num for checking seq
                curr++;
            }
            resLength = Math.max(resLength, countSeq);
        }
        
        return resLength;
    }
}
